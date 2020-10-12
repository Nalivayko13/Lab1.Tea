package  bsu.rfe.java.group10.lab1.Nalivayko.varB13;

public class Main {

    public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
                itemsSoFar++;
            }
            else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
                itemsSoFar++;
            }
            else if(parts[0].equals("Tea")){
                breakfast[itemsSoFar] = new Tea(parts[1]);
                itemsSoFar++;
            }
           // itemsSoFar++;
        }
        Comparator1 com=new Comparator1();
        for (String arg: args){
            if(arg.equalsIgnoreCase("-sort")){
                for(int i=1;i<breakfast.length;i++){
                    if(breakfast[i-1]!= null) {
                        com.compare(breakfast[i-1], breakfast[i]);
                    }
                }
            }
        }
        for (Food item: breakfast) {
            if (item != null)
                item.consume();
        }
        int calories=0;
       for (String arg: args){
            if(arg.equalsIgnoreCase("-calories")){
               for(Food item: breakfast){
                   if(item!= null) {
                       //System.out.println(item.calculateCalories());
                       calories += item.calculateCalories();
                   }
               }
            }
        }
       System.out.println("  ");
      for (Food item: breakfast){
          if(item!=null) {
              System.out.print(item + " ,");
          }
      }
      System.out.println("  ");
      System.out.println("Съедено за завтраком "+calories + " калорий");
      System.out.println("Всего хорошего!");

    }
}


