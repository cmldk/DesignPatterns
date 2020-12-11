package Exercises.observer.myclasses;

public class NumberPublisherDemo {

    public static void main(String[] args) throws InterruptedException {

        NumberPublisher publisher = new NumberPublisher();

        publisher.registerObserver(new BinaryView());
        publisher.registerObserver(new HexaDecimalView());
        publisher.registerObserver(new DecimalView());

        int publishCount = 5;

        for (int i =0; i<publishCount; i++){
            int number = i*20;
            System.out.println("\nPublishing:" + number);
            publisher.publishNumber(number);
            Thread.sleep(1000);
        }

    }

}
