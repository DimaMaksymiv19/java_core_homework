package Main.Homework15;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(10, "Olga");
        map.put(1, "Dima");

        MyEntry first = new MyEntry(map);
        first.showKeysSet();
        first.addMapEl("Sd", 22);
        first.showMap();
        first.showValuesList();
    }
}
