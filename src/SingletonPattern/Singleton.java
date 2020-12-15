package SingletonPattern;

public class Singleton {
    // we can do it but what if dont need to use this object
    // it may waste the memory,
    // and this is called "eagerly creation"
    //private static Singleton instance = new Singleton();

    private volatile static Singleton instance;
    //volatile: Multiple threads can access the same variable


    private Singleton(){

    }

    public static Singleton getInstance(){
        // Double-checked locking
        if (instance == null){
            synchronized (Singleton.class) {
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
