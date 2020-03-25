package hom.learn.serializ;

import java.io.*;

/**
 * @Descrption:
 * @Author: rootbee
 * @Date: 2020/3/25 - 上午11:34
 */
public class ObjectStreamOut {
    public static void main(String[] args) {

        File file = new File("/home/rootbee/temp/out.txt");
        Student stu = new Student("李华","18");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(stu);
            oos.flush();
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
