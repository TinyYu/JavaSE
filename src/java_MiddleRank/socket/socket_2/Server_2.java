package java_MiddleRank.socket.socket_2;

import jdk.internal.util.xml.impl.Input;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端 接收数据
 **/
public class Server_2 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("监听端口号:8888");
            Socket s = ss.accept();

            //打开输入流
            InputStream is = s.getInputStream();

            //读取客户端发送的数据
            int msg = is.read();
            //打印数据
            System.out.println(msg);
            is.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
