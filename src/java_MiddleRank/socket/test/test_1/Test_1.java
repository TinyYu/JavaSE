package java_MiddleRank.socket.test.test_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Test_1 {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            String ip = inetAddress.getHostAddress();
            String[] ips = ip.split("\\.");
            String c = ips[ips.length - 1];
            List<String> list = new  ArrayList<>();
            for (int i = 1;i <= 255;i++){
                if (!String.valueOf(i).equals(c)) {
                    ips[ips.length - 1] = String.valueOf(i);
                    StringBuilder sb = new StringBuilder();
                    for (int x = 0;x < ips.length;x++){
                        sb.append(ips[x]);
                        if (x != ips.length - 1){
                            sb.append(".");
                        }
                    }
                    Process p = Runtime.getRuntime().exec("ping " + sb);
                    BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(),"gbk"));
                    String line = null;
                    while ((line = br.readLine()) != null){
                        if (line.equals("请求超时")){
                            break;
                        }
                        list.add(String.valueOf(sb));
                    }
                }
            }
            System.out.println("一下ip可连接");
            for (String s : list){
                System.out.println(s);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
