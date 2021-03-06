package bsu.rfe.java.group10.lab1.Nalivayko.varB13;

public class Tea extends Food {
    private String color;
    private int sugar;

    public Tea(String color,int sugar) {
        super("Чаёк");
        this.color = color;
        this.sugar = sugar;
    }

    public Tea(String color) {
        super("Чаёк");
        this.color = color;
    }

    public void consume() {
        System.out.println(this + " выпит");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Tea)) return false;
            return color.equals(((Tea)arg0).color);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " цвета '" + color.toUpperCase() + "'";
    }

    @Override
    public int calculateCalories() { return 1;}
//        if (sugar == 1){
//            return 65;
//        }
//        else if (sugar == 0){
//            return 2;
//        }
//        else {return 1;
}
