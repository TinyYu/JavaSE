package java_MiddleRank.thread.test.test_2;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        char[] c = str.toCharArray();
        String str1 = "";
        StringBuffer sb = new StringBuffer(str1);
        for (int i = 0;i < 3;i++){
            sb.append(c[(int) (Math.random() * c.length)]);
        }
        String pw = String.valueOf(sb);
        ArrayList<String> arrayList = new ArrayList<>();
        Thread t1 = new Thread(){
            public void run(){
                String pw_n = "";
                for (int i = 0;i < c.length;i++) {
                    for (int j = 0;j < c.length;j++){
                        for (int z = 0;z <c.length;z++){
                            StringBuffer sb = new StringBuffer(pw_n);
                            sb.append(c[i]);
                            sb.append(c[j]);
                            sb.append(c[z]);
                            String pw_new = String.valueOf(sb);
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            arrayList.add(pw_new);
                            if (pw_new.equals(pw)){
                                System.out.println("找到匹配密码:" + pw_new);
                                break;
                            }
                        }
                    }
                }
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            public void run(){
                while(true) {
                    while (arrayList.isEmpty()){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    String s = arrayList.remove(0);
                    System.out.println("密码不匹配:" + s);
                }
            }
        };
        t2.setDaemon(true);
        t2.start();
    }
} 
