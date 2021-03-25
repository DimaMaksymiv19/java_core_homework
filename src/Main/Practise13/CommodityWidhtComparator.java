package Main.Practise13;

import Main.Homework10.Main;

import java.util.Comparator;

public class CommodityWidhtComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getWidth() > o2.getWidth()) {
            return 1;
        } else  if (o1.getWidth() < o2.getWidth()) {
            return -1;
        } else {
            return 0;
        }
    }
}
