package bsu.rfe.java.group7.lab1.Kalashnikova.varA7;

public class Breakfast {
    public static void main(String[] args) {
        int sumApple = 0;
        int sumIce_Cream = 0;
        int sumCheese = 0;
        int i = 0;
        for (String arg1 : args) {
            String[] part = arg1.split("/");
            if (part[0].equals("Ice_Cream")) {
                Ice_Cream i_c = new Ice_Cream(part[1]);
                i_c.consume();
                sumIce_Cream++;}
            else if (part[0].equals("Cheese")){
                Cheese cheese = new Cheese();
                cheese.consume();
                sumCheese++;}
            else if (part[0].equals("Apple")){
                Apple apple = new Apple(part[1]);
                apple.consume();
                sumApple++;}
            i++;
        }
        System.out.println("Количество съеденных продуктов:  " + (sumApple+sumIce_Cream+sumCheese));
        System.out.println("Яблок съедено: " + sumApple);
        System.out.println("Мороженого съедено: " + sumIce_Cream);
        System.out.println("Сыра съедено: " + sumCheese);
    }
}
