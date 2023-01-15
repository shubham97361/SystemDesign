package LLD.DecoratorPattern.Toppings;

import LLD.DecoratorPattern.BasePizza.BasePizza;

public class Pineapple implements ToppingInterface {

    private BasePizza basePizza;

    public Pineapple(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        
        return basePizza.getCost() + 50;
    }
    
}
