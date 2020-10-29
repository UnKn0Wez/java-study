package com.qzw.week8;

import java.io.*;
import java.util.UUID;

/**
 * @ClassName FileCopy
 * @Description 使用IO流实现文件的复制
 * @Author UnKnW
 * @Date 2020/10/29 8:55
 **/
public class FileCopy {
        public static void main(String[] args) throws IOException {
            //1、将源文件读入内存数组
            File inputFile = new File("C:/Users/UnKnW/Pictures/test.txt");
            InputStream file1 = new FileInputStream(inputFile);
            InputStreamReader is = new InputStreamReader(file1);
            char[] b = new char[(char) inputFile.length()];
            //read没有返回值
            int read = is.read(b);
            System.out.println(b);
            System.out.println(read);
            //2、将内存数组中的值写到目标文件
            File outputFile = new File("C:/Users/UnKnW/Pictures/" + UUID.randomUUID().toString() + ".txt");
            OutputStream file2 = new FileOutputStream(outputFile);
            OutputStreamWriter os = new OutputStreamWriter(file2);
            os.write(b);
            is.close();
            os.close();
    }
}
