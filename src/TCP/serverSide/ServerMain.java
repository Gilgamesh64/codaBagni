package TCP.serverSide;

public class ServerMain {
    public static void main(String[] args) throws Exception {
        Database d = new Database();
        Server s = new Server(5050);
        s.start();
    }
}
