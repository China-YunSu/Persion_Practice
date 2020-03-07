package hom.john.design.kfcStore.custorm;

import hom.john.design.core.PizzaStore;
import hom.john.design.kfcStore.KFC;

/**
 * @Descrption: Custorm select PizzaStore to orderPizza;
 * @Author: rootbee
 * @Date: 2020/3/7 - 下午11:03
 */
public class Custorm {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new KFC();
        pizzaStore.orderPizza("cheese");

    }
}
