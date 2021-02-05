package SingletonPattern;

public class TestSingleton {
    public static void main(String... args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        (new MyThread()).start();
        (new Thread(new MyRunnable())).start();

        System.out.println(s1);
        System.out.println(s2);

    }

    static class MyThread extends Thread{
        @Override
        public void run(){
            Singleton s1 = Singleton.getInstance();
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run(){
            Singleton s1 = Singleton.getInstance();
        }
    }
}
