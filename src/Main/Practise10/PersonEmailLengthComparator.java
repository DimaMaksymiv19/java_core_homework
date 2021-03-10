package Main.Practise10;

import java.util.Comparator;

public class PersonEmailLengthComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.geteMail().length() > o2.geteMail().length()){
            return 1;
        }else if (o1.geteMail().length() < o2.geteMail().length()){
            return -1;
        }else {
        return 0;
        }
    }
}
