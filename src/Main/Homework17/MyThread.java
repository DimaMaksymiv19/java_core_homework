package Main.Homework17;

public class MyThread extends Thread{
    private int number;

    public MyThread(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(1);
        for(int i = 1; i <= this.number; i++){
            System.out.println(i + (i-1));
        }
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
