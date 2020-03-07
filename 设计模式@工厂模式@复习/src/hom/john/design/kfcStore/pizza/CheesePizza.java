package hom.john.design.kfcStore.pizza;

import hom.john.design.core.IPizzaIngredientFactory;
import hom.john.design.core.Pizza;

/**
 * @Descrption: CheesePizza
 * @Author: rootbee
 * @Date: 2020/3/7 - 下午10:21
 */
public class CheesePizza extends Pizza {
    IPizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(IPizzaIngredientFactory pizzaIngredientFactory) {
        super("CheesePizza");
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println(name + " is preparing...");
        pizzaIngredientFactory.makeDough();
        pizzaIngredientFactory.makeCheese();
    }
}
