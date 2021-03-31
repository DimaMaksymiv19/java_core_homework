package Main.Practise16;

import java.util.Arrays;
import java.util.List;

public class SortedRunnable implements Runnable{

    private String[] something;
    private long timeout;

    public SortedRunnable(String[] something, long timeout) {
        this.something = something;
        this.timeout = timeout;
    }

    public String[] getSomething() {
        return something;
    }

    public void setSomething(String[] something) {
        this.something = something;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }


    @Override
    public void run() {
        for (String some: something)
        {
            System.out.println(some);
            try
            {
                Thread.sleep(timeout);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
