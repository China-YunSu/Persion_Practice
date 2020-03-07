package hom.john.design.core;

/**
 * @Descrption: Make Sauce
 * @Author: rootbee
 * @Date: 2020/3/7 - 下午10:05
 */
public class Sauce {
    private final String name = "Sauce";

    public Sauce makeSauce() {
        System.out.println(name + " is saucing");
        return this;
    }

    public String getName() {
        return name;
    }
}
