package Main.Hometask19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        Test testSum = (a , b , c ) ->(a + b + c);
        System.out.println("Task 1");
        System.out.println(testSum.value(5,1,5));

        Test testMax = (a, b , c) ->
        {
            List<Integer> list = new ArrayList<>(Arrays.asList(a, b, c));
            int maxRes = list.get(0);
            for (Integer el : list)
            {
                if (el >= maxRes)
                {
                    maxRes = el;
                }
            }
       return maxRes;
        };
        System.out.println("Task 2");
        System.out.println(testMax.value(4,2,8));

        Test testAvg = (x, y, z) -> (x+y+z)/3;
        System.out.println("Task 3");
        System.out.println(testAvg.value(23,11,4));

    }
}
