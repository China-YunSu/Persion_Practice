package hom.john.design.core;

/**
 * @Descrption: make Clam
 * @Author: rootbee
 * @Date: 2020/3/7 - 下午10:09
 */
public class Clam {
    private final String Clam = "clam";

    public Clam makeClam() {
        System.out.println("Clam is adding");
        return this;
    }

    public String getClam() {
        return Clam;
    }
}
