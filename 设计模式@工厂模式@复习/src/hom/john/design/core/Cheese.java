package hom.john.design.core;

/**
 * @Descrption: Make Cheese
 * @Author: rootbee
 * @Date: 2020/3/7 - 下午10:07
 */
public class Cheese {
    private final String name = "Cheese";

    public Cheese makeCheese() {
        System.out.println(name + " is adding");
        return this;
    }

    public  String getCheese() {
        return name;
    }
}
