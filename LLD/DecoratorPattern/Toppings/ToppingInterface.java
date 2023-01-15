package LLD.DecoratorPattern.Toppings;

import LLD.DecoratorPattern.BasePizza.BasePizza;

public interface ToppingInterface extends BasePizza {

    public int getCost();
}
// can an interface implements other interface