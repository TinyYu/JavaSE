package java_MiddleRank.socket.socket_2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 **/
public class Server_1 {
    public static void main(String[] args) {
        try {
            //服务端打开8888端口
            ServerSocket ss = new ServerSocket(8888);
            Socket s = ss.accept();
            System.out.println("有连接过来:" + s);
            s.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
