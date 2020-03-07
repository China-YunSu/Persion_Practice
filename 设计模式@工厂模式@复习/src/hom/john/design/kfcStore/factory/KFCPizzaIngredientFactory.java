package hom.john.design.kfcStore.factory;

import hom.john.design.core.*;

/**
 * @Descrption: make pizza
 * @Author: rootbee
 * @Date: 2020/3/7 - 下午10:47
 */
public class KFCPizzaIngredientFactory implements IPizzaIngredientFactory {
    @Override
    public Dough makeDough() {
        return new Dough().makeDough();
    }

    @Override
    public Sauce makeSauce() {
        return new Sauce().makeSauce();
    }

    @Override
    public Cheese makeCheese() {
        return new Cheese().makeCheese();
    }

    @Override
    public Clam makeClam() {
        return new Clam().makeClam();
    }
}
