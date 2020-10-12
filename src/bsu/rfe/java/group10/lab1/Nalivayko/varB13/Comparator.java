package bsu.rfe.java.group10.lab1.Nalivayko.varB13;
import java.util.Comparator;
class Comparator1 implements Comparator<Food>{

    public int compare(Food arg0, Food arg1) {
        if (arg0==null) return 1;
        if (arg1==null) return -1;
        return arg0.getName().compareTo(arg1.getName());
    }

}
