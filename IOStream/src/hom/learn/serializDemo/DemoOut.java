package hom.learn.demo;

import hom.learn.serializ.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Descrption:
 * @Author: rootbee
 * @Date: 2020/3/25 - 下午12:11
 */
public class DemoOut {

    public static void main(String[] args) {
       File  file = new File("/home/rootbee/temp/out.txt");
        List<Student> studentPool = new ArrayList<>();
        studentPool.add(new Student("凌霄","18"));
        studentPool.add(new Student("张郃","14"));
        studentPool.add(new Student("赵云","20"));

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentPool);
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
