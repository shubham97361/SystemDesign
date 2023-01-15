package LLD.DecoratorPattern.Toppings;

import LLD.DecoratorPattern.BasePizza.BasePizza;

public class Cheese implements ToppingInterface {

    private BasePizza basePizza;

    public Cheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        
        return basePizza.getCost() + 10;
    }
    
}
