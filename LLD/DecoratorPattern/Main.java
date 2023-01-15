package LLD.DecoratorPattern;

import LLD.DecoratorPattern.BasePizza.Maragetti;
import LLD.DecoratorPattern.Toppings.Cheese;
import LLD.DecoratorPattern.Toppings.Pineapple;

public class Main {


    public static void main(String[] args) {
        
    Maragetti maragetti = new Maragetti();
    Cheese cheese = new Cheese(maragetti);
    Pineapple pineapple = new Pineapple(cheese);

        int finalCost = pineapple.getCost();
        System.out.println(finalCost);
    }
    
}
