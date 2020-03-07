package hom.john.design.kfcStore;

import hom.john.design.core.IPizzaIngredientFactory;
import hom.john.design.core.Pizza;
import hom.john.design.core.PizzaStore;
import hom.john.design.kfcStore.factory.KFCPizzaIngredientFactory;
import hom.john.design.kfcStore.pizza.CheesePizza;
import hom.john.design.kfcStore.pizza.ClamPizza;

/**
 * @Descrption: intstance Piazzastore
 *              it is a Piazz Factorty
 *              overwrite creatPizza
 * @Author: rootbee
 * @Date: 2020/3/7 - 下午10:14
 */
public class KFC extends PizzaStore {

    @Override
    protected Pizza creatPizza(String type) {
        IPizzaIngredientFactory pizzaIngredientFactory = new KFCPizzaIngredientFactory();
        if (type.equalsIgnoreCase("cheese")) {
            return new CheesePizza(pizzaIngredientFactory);
        } else if (type.equalsIgnoreCase("Clame")) {
            return new ClamPizza(pizzaIngredientFactory);
        }
        return null;
    }
}
