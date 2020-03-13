package hom.john.design.simpleB;

/**
 * @Descrption: 恶汉模式
 * @Author: rootbee
 * @Date: 2020/3/14 - 上午12:26
 */
public class Simple {
    private static Object object;

    static {
        object = new Object();
    }

    public static Object getObject() {
        return object;
    }
}
