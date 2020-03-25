package hom.learn.stream;

import java.io.*;

/**
 * @Descrption:
 * @Author: rootbee
 * @Date: 2020/3/25 - 上午10:55
 */
public class DemoStream {

    public static void main(String[] args) {

        //创建文件
        File file = new File("/home/rootbee/temp/out.txt");

        //创建字符输出流

        try {
            FileOutputStream out = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(out, "GBK");
            osw.write("你好！");
            osw.flush();
            osw.close();
            out.close();
        } catch (UnsupportedEncodingException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream in = new FileInputStream(file);
            InputStreamReader isr= new InputStreamReader(in,"GBK");
            int len;
            while ((len = isr.read()) != -1) {
                System.out.println((char) len);
            }
            isr.close();
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
