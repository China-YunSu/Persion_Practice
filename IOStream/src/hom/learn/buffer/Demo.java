package hom.learn.buffer;

import java.io.*;

/**
 * @Descrption:
 * @Author: rootbee
 * @Date: 2020/3/24 - 下午11:57
 */
public class Demo {
    public static void main(String[] args) {
        //文件路径
        String path = "/home/rootbee/temp/out.txt";

        //创建文件
        File file = new File(path);

        //创建输入流
        FileInputStream in = null;
        try {
            in = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //创建缓冲输入流
        BufferedInputStream bin = new BufferedInputStream(in);

        try {
            System.out.println((char)bin.read());
            bin.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //创建输出流
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //创建缓冲输出流
        BufferedOutputStream bout = new BufferedOutputStream(out);

        try {
            bout.write("haike".getBytes());
            bout.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //创建字符输入出流
        try {
            FileWriter fw = new FileWriter(file);
            //创建字符缓冲流输出流
            BufferedWriter bfw = new BufferedWriter(fw);
            bfw.write("hello bufferWriter");
            bfw.flush();
            bfw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //创建字符输入流
        try {
            FileReader fr = new FileReader(file);
            //创建字符缓冲流输入流
            char[] res = new char[64];
            BufferedReader bfd = new BufferedReader(fr);
            int len = bfd.read(res);
            System.out.println(new String(res,0,len));
            bfd.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
