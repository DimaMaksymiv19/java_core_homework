package Main.Practise16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Start {
//    public static void main(String[] args) throws InterruptedException {
//        Queue queue1 = new Queue(Arrays.asList(1,2,3,4,5,6,7),2500);
//        Queue queue2 = new Queue(Arrays.asList(10,20,30,40,50,60,70),1500);
//        Queue queue3 = new Queue(Arrays.asList(100,200,300,400,500,600,700),1500);
//
//        queue1.start();
//        queue2.start();
//
//        queue2.join();
//
//        System.out.println("Main complete");
//
//        queue3.start();
//        queue3.setDaemon(true);
//    }
public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    System.out.println("Enter somethink");
//    List<String> listForConstructor = new ArrayList<>();
//    for (int i = 0;i < 5; i++ ){
//        listForConstructor.add(scan.next());
//    }
    String[] aea = {"3", "ad", "bb", "1"};
//    DirectThread directThread = new DirectThread(listForConstructor, 1500);
//    directThread.start();
//
    Thread thread = new Thread(new SortedRunnable(aea,1000));
    thread.start();
}
}
