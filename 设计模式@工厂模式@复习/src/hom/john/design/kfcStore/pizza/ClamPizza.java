package hom.john.design.kfcStore.pizza;

import hom.john.design.core.IPizzaIngredientFactory;
import hom.john.design.core.Pizza;

/**
 * @Descrption: ClamPizza
 * @Author: rootbee
 * @Date: 2020/3/7 - 下午10:45
 */
public class ClamPizza extends Pizza {
    IPizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(IPizzaIngredientFactory pizzaIngredientFactory) {
        super("ClamPizza");
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println(name + "is preparing");
        pizzaIngredientFactory.makeDough();
        pizzaIngredientFactory.makeClam();
    }
}
