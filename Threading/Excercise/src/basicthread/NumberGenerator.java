package basicthread;

public class NumberGenerator implements Runnable{

    @Override
    synchronized public void run() {
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);
            System.out.println(hashCode());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
