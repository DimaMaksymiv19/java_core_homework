package Main.Practise16;

import java.util.List;

public class Queue extends Thread{
    private List<Integer> numbers;
    private long timeout;

    public Queue(List<Integer> numbers, long timeout) {
        this.numbers = numbers;
        this.timeout = timeout;
    }

    public Queue(Runnable target, List<Integer> numbers, long timeout) {
        super(target);
        this.numbers = numbers;
        this.timeout = timeout;
    }

    public Queue(ThreadGroup group, Runnable target, List<Integer> numbers, long timeout) {
        super(group, target);
        this.numbers = numbers;
        this.timeout = timeout;
    }

    public Queue(String name, List<Integer> numbers, long timeout) {
        super(name);
        this.numbers = numbers;
        this.timeout = timeout;
    }

    public Queue(ThreadGroup group, String name, List<Integer> numbers, long timeout) {
        super(group, name);
        this.numbers = numbers;
        this.timeout = timeout;
    }

    public Queue(Runnable target, String name, List<Integer> numbers, long timeout) {
        super(target, name);
        this.numbers = numbers;
        this.timeout = timeout;
    }

    public Queue(ThreadGroup group, Runnable target, String name, List<Integer> numbers, long timeout) {
        super(group, target, name);
        this.numbers = numbers;
        this.timeout = timeout;
    }

    public Queue(ThreadGroup group, Runnable target, String name, long stackSize, List<Integer> numbers, long timeout) {
        super(group, target, name, stackSize);
        this.numbers = numbers;
        this.timeout = timeout;
    }

    public Queue(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals, List<Integer> numbers, long timeout) {
        super(group, target, name, stackSize, inheritThreadLocals);
        this.numbers = numbers;
        this.timeout = timeout;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }
    @Override
    public void run()
    {
        for (int number : numbers)
        {

            System.out.println(this.getName() + " " + number);
            try {
                Thread.sleep(timeout);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            }
        }
    }


