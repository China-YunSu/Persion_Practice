package hom.john.design.core;

/**
 * @Descrption: IPizzaIngredientFactory
 * @Author: rootbee
 * @Date: 2020/3/7 - 下午10:32
 */
public interface IPizzaIngredientFactory {
    Dough makeDough();

    Sauce makeSauce();

    Cheese makeCheese();

    Clam makeClam();
}
