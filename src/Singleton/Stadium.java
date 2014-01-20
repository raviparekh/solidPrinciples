package Singleton;

public class Stadium {
    private static Stadium instance = null;

    public static Stadium getInstance(){
        if (instance == null){
            instance = new Stadium();
        }
        return instance;
    }
}
