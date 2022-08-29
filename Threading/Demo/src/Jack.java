public class Jack implements Runnable{
    public int j5;

    public Jack() {
        this.j5 = 5000000;
    }
    public synchronized void nuoiCon() throws InterruptedException {
        if (j5>0){
            Thread.sleep(1000);
            j5 -= 5000000;
            System.out.printf("\nĐã ck nuôi con 1 tháng = 1Jack, tk còn: %d Đ",j5);
        }
        else {
            System.out.println("\nkhông còn đồng nào");
        }
    }
    @Override
    public void run() {
        try {
            nuoiCon();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Jack jack = new Jack();
        Thread phongNuoiCon = new Thread(jack);
        Thread huyNuoiCon = new Thread(jack);
        phongNuoiCon.start();
        huyNuoiCon.start();
    }
}
