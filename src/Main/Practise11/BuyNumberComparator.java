package Main.Practise11;

import java.util.Comparator;

public class BuyNumberComparator implements Comparator<Buy> {
    @Override
    public int compare(Buy o1, Buy o2) {
        if (o1.getNumber() > o2.getNumber()){
            return -1;
        }else if (o1.getNumber() < o2.getNumber()){
            return 1;
        }else {
        return 0;
        }
    }
}
