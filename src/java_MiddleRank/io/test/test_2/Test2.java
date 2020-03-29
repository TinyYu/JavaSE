package java_MiddleRank.io.test.test_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author: ly
 * @date: 2020/03/13
 **/
public class Test2 {
    public static void main(String[] args) {
        File f = new File("f:/LOLFolder/MEMORY.DMP");
        if (f.exists()){
            FileInputStream fis = null;
            FileOutputStream fos = null;
            long length_zhid = 104857600 * 2;//指定分隔文件大小200mb
            try {
                fis = new FileInputStream(f);
                byte[] bytes = new byte[(int) f.length()];
                fis.read(bytes);

                //拆分文件个数
                int sum = 0;
                if (bytes.length % length_zhid == 0){
                    sum = (int) (bytes.length / length_zhid);
                } else {
                    sum = (int) (bytes.length / length_zhid) + 1;
                }

                byte[][] bytes1 = new byte[sum][(int) length_zhid];
                for (int i = 0;i < sum;i++) {
                    if (i < sum - 1){
                        System.arraycopy(bytes, (int) (length_zhid * i), bytes1[i], 0, (int) length_zhid);
                    } else {
                        bytes1[i] = new byte[(int) (bytes.length - length_zhid * i)];
                        System.arraycopy(bytes,(int) (length_zhid * i),bytes1[i],0, (int) (bytes.length - length_zhid * i));
                    }
                }
                String s = f.getAbsolutePath();
                for (int i = 0;i < bytes1.length;i++){
                    StringBuffer sb = new StringBuffer(s);
                    sb.append("-" + (i + 1));
                    File file = new File(String.valueOf(sb));
                    fos = new FileOutputStream(file);
                    fos.write(bytes1[i]);
                    System.out.println("拆分文件:" + file + " 文件大小:" + file.length() + "字节");
                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("未找到指定路径");
        }
    }
} 
