package  bsu.rfe.java.group10.lab1.Nalivayko.varB13;;

public class Main {

    public static void main(String[] args) throws Exception{
            Food[] breakfast = new Food[20];
            int itemsSoFar = 0;
            for (String arg: args) {
                String[] parts = arg.split("/");
                if (parts[0].equals("Cheese")) {
                    breakfast[itemsSoFar] = new Cheese();
                } else
                if (parts[0].equals("Apple")) {
                    breakfast[itemsSoFar] = new Apple(parts[1]);
                }
                itemsSoFar++;
            }
        for (int i=0; i<breakfast.length; i++)
            if (breakfast[i]!=null)
                breakfast[i].consume();
            else break;
            System.out.println("Всего хорошего!");
        }
    }

