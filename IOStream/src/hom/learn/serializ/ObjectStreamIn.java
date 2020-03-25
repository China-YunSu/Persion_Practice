package hom.learn.serializ;

import java.io.*;

/**
 * @Descrption:
 * @Author: rootbee
 * @Date: 2020/3/25 - 上午11:27
 */

/*
    文件操作对象需要序列化接口
 */
public class ObjectStreamIn {

    public static void main(String[] args) {

        File file = new File("/home/rootbee/temp/out.txt");
        Student stu = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            stu = (Student) ois.readObject();
            System.out.println(stu);
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
