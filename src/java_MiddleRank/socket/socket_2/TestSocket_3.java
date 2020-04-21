package java_MiddleRank.socket.socket_2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端 发送字符串
 **/
public class TestSocket_3 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1",8888);
            OutputStream os = s.getOutputStream();

            //把输出流封装在DataOutputStream中
            DataOutputStream dos = new DataOutputStream(os);
            //发送字符串
            dos.writeUTF("lol");
            dos.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
