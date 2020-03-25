package hom.learn.stream;

import java.io.*;

/**
 * @Descrption: FILE learn
 * @Author: rootbee
 * @Date: 2020/3/24 - 下午8:42
 */
public class DemoFile {
    public static void main(String[] args) {
        //路径分隔符；  与系统有关
        System.out.println(File.pathSeparator);
        //文件分隔符
        System.out.println(File.separator);

        //文件路径
        String path = "/home/rootbee/temp/out.txt";

        //创建文件对象
        File file = new File(path);

        //创建字节输入流
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write("rootbee".getBytes());
            fos.close();
            //创建字节输出流
            FileInputStream fis = new FileInputStream(file);
            byte[] in = new byte[7];
            fis.read(in);
            System.out.println((char)in[6]);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader frd = new FileReader(file);
            char[] container = new char[1024];
            int len = frd.read(container);
            System.out.println(new String(container,0, len));
            frd.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建字符输入流
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(":122");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
