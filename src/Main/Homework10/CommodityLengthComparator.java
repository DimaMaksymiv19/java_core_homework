package Main.Homework10;

import java.util.Comparator;

public class CommodityLengthComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getLen() > o2.getLen()) {
            return 1;
        } else  if (o1.getLen() < o2.getLen()) {
            return -1;
        } else {
            return 0;
        }
    }
}
