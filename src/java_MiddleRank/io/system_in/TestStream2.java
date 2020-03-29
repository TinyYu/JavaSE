package java_MiddleRank.io.system_in;

import java.util.Scanner;

/**
 * Scanner读取字符串
 **/
public class TestStream2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true){
            String line = s.nextLine();
            System.out.println(line);
        }
    }
} 
