package hom.john.design.core;


public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = creatPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println(type + "Pizza is finshed");
        return pizza;
    }

    protected abstract Pizza creatPizza(String type);
}
