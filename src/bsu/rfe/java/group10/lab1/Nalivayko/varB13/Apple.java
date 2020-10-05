package bsu.rfe.java.group10.lab1.Nalivayko.varB13;

public class Apple extends Food{
    private String size;

    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }

    public void consume() {
        System.out.println(this + " съедено");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) return false;
            return size.equals(((Apple)arg0).size);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }

    @Override
    public int calculateCalories() {
        if (size.equalsIgnoreCase("big")){
            return 156;
        }
        else if (size.equalsIgnoreCase("small")){
            return 52;
        }
        else if (size.equalsIgnoreCase("medium")){
            return 103;
        }
        return 0;
    }
}
