package hom.learn.demo;

import hom.learn.serializ.Student;

import java.io.*;
import java.util.List;

/**
 * @Descrption:
 * @Author: rootbee
 * @Date: 2020/3/25 - 下午12:19
 */
public class DemoIn {
    public static void main(String[] args) {
        File file = new File("/home/rootbee/temp/out.txt");
        List<Student> studentPool = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentPool = ( List<Student>)ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Student student : studentPool) {
            System.out.println(student);
        }


    }
}
