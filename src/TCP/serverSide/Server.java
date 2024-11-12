package TCP.serverSide;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * simple TCP server class that creates a new thread when something connects
 */
public class Server extends Thread {
    private int port;

    public Server(int port){
        this.port = port;
    }
    
    @Override
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");
                new ServerThread(socket).start();
            }
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}