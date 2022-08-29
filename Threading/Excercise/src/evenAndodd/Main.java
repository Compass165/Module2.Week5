package evenAndodd;

public class Main {

    public static void main(String[] args) {
        Thread threadOdd = new OddThread();
        Thread threadeven = new EvenThread();


        try {
            threadOdd.start();
            threadOdd.join();
            threadeven.start();
        } catch (InterruptedException ie) {
            System.err.println(ie.getMessage());
        }
    }

}
