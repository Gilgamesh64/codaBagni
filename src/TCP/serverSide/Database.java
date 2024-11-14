package TCP.serverSide;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.ConcurrentHashMap;

public class Database {
    public static ConcurrentHashMap<String, String> passwordMap = new ConcurrentHashMap<>();
    Database(){
        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
            String s = br.readLine();
            while(s != null){
                String name = s.split(":")[0];
                String pw = s.split(":")[1];
                passwordMap.put(name, pw);
                s = br.readLine();
            }

        } catch (Exception e) {e.printStackTrace();}
    }
}
