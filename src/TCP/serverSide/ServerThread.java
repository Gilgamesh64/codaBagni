package TCP.serverSide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import events.Event;
import events.SimpleEvent;

/**
 * simple TCP server thread that sends a string when received one
 * @author Gilgamesh64
 */
public class ServerThread extends Thread {
    
    private Socket socket;

    private final Event<String> stringReceived = new SimpleEvent<>();


    private InputStream input;
    private BufferedReader reader;

    private OutputStream output;
    private PrintWriter writer;

    public Event<String> stringReceivedEvent() {
        return stringReceived;
    }

    public ServerThread(Socket socket) {
        this.socket = socket;

        try {

            input = socket.getInputStream();
            reader = new BufferedReader(new InputStreamReader(input));

            output = socket.getOutputStream();
            writer = new PrintWriter(output, true);

        } catch (IOException e) {e.printStackTrace();}

        Queue.sendStringEvent().addListener(
            message -> {
                System.out.println(message);
                write(message);
        });
    }
    
    public void run() {
        try {
            String text;

            do {
                text = reader.readLine();
                if(text.contains("add")){
                    String name = text.split(" ")[1];
                    Queue.add(name);
                } 
                if(text.equals("back")){
                    Queue.poll();
                }
            } while (!text.equals("close"));

            close();
        } catch (IOException ex) {
            close();
            return;
        }
    }

    private void write(String s){
        writer.println(s);
        
    }


    private void close(){
        try {
            socket.close();
            System.out.println("Closing Socket");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}