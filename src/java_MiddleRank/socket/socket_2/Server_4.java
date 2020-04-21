package java_MiddleRank.socket.socket_2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端 使用Scanner
 **/
public class Server_4 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("监听端口:8888");
            Socket s = ss.accept();
            InputStream is = s.getInputStream();

            //封装输入流到DataInoutSteam
            DataInputStream dis = new DataInputStream(is);
            //使用readUTF读取字符
            String msg = dis.readUTF();
            System.out.println(msg);
            dis.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
