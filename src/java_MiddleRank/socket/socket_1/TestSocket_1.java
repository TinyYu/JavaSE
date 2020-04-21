package java_MiddleRank.socket.socket_1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 获取本机ip
 **/
public class TestSocket_1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host = InetAddress.getLocalHost();
        String ip = host.getHostAddress();
        System.out.println("本机ip: " + ip);
    }
} 
