package TCP.serverSide;

import java.util.concurrent.ConcurrentHashMap;

public class Database {
    public static ConcurrentHashMap<String, String> passwordMap = new ConcurrentHashMap<>();
    Database(){
        passwordMap.put("Marco_trevisan", "Trebbi");
        passwordMap.put("chrstian", "Ciao");
    }
}
