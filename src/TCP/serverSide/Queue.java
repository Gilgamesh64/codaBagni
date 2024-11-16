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
        if(queue.isEmpty()) sendStringEvent().trigger("Coda Vuota");
        else sendStringEvent().trigger(Queue.print());
    }

    public static synchronized String print(){
        return queue.isEmpty() ? "Coda Vuota" : queue.toString().replaceAll("\\[", "").replaceAll("\\]", "");
    }

    public static synchronized int getSize(){
        return queue.size();
    }

    public static synchronized String peek(){
        return queue.isEmpty() ? "Coda Vuota" : queue.peek();
    }
}
