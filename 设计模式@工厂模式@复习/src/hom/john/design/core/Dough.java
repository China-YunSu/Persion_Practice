package hom.john.design.core;

/**
 * @Descrption: Make Dough
 * @Author: rootbee
 * @Date: 2020/3/7 - 下午9:58
 */
public class Dough {
    private final String name = "Dough";

    public Dough makeDough() {
        System.out.println(name + " is adding");
        return this;
    }

    public String getName() {
        return name;
    }
}
