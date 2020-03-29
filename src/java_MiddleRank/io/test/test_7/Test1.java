package java_MiddleRank.io.test.test_7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: ly
 * @date: 2020/03/17
 **/
public class Test1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        File f = new File("F:/class_test.java");
        File f2 = new File("f:/class_stream.java");
        System.out.println("输入类名:");
        String class_name = s.nextLine();
        System.out.println("输入属性类型:");
        String class_l = s.nextLine();
        System.out.println("输入属性的名称:");
        String class_s = s.nextLine();
        char[] c = class_s.toCharArray();
        c[0] = (char)(c[0] - 32);
        String class_S = String.valueOf(c);

        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            List<String> list = new ArrayList();
            while (true){
                String line = br.readLine();
                if (null == line)
                    break;
                String str_class = line.replaceAll("@class@",class_name);
                String str_l = str_class.replaceAll("@type@",class_l);
                String str_s = str_l.replaceAll("@property@",class_s);
                String str = str_s.replaceAll("@Uproperty@",class_S);
                list.add(str);

            }

            fw = new FileWriter(f2);
            pw = new PrintWriter(fw);
            for (String list1 : list){
                pw.println(list1);
                pw.flush();
            }
            System.out.println("保存位置:" + f2);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
} 
