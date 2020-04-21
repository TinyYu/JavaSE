package java_MiddleRank.socket.socket_2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端 使用Scanner
 **/
public class TestSocket_4 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1",8888);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            //使用Scanner读取控制台的输入,并发送到服务端
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            dos.writeUTF(str);
            dos.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
