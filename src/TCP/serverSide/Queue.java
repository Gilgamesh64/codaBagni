package TCP.serverSide;

import java.util.concurrent.ConcurrentLinkedQueue;

import events.Event;
import events.SimpleEvent;

public class Queue {

    //event to trigger if you want to send a string to all clients
    private static final Event<String> sendString = new SimpleEvent<>();

    /**
     * example: sendStringEvent().trigger("foo")
     * sends foo to every actionListener
     * @return triggerable event
     */
    public static Event<String> sendStringEvent() {
        return sendString;
    }

    private static ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

    public static synchronized void add(String name){
        if(queue.contains(name)) return;
        queue.add(name);
        sendStringEvent().trigger(Queue.print());
    }

    public static synchronized void poll(){
        queue.poll();
        if(queue.isEmpty()) sendStringEvent().trigger("Coda vuota");
        else sendStringEvent().trigger(Queue.print());
    }

    public static synchronized String peek(){
        return queue.isEmpty() ? "Coda vuota" : Queue.print();
    }

    public static String print() {
        return queue.toString();
    }
}
