package hom.john.design.simpleA;

/**
 * @Descrption: 单件：懒汉模式
 * @Author: rootbee
 * @Date: 2020/3/14 - 上午12:09
 */
public class Simple {
    private static Object object;

    private Simple() {
    }

    public Object getInstance() {
        if (object == null) {
            synchronized (Object.class) {
                if (object == null) {
                    object = new Simple();
                }
            }
        }
        return object;
    }
}
