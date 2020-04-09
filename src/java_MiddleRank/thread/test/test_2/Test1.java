package java_MiddleRank.thread.test.test_2;

public class Test1 {
    public static void main(String[] args) {
        Hero h1 = new Hero("h1",616,30);
        Hero h2 = new Hero("h2",1016,30);
        Thread t1 = new Thread(){
            public void run() {
                int count = 1;
                while (!h2.isDead()) {
                    h1.bdq(h2);
                    System.out.printf("波动拳%d\n",count);
                    try {
                        if (count == 3){
                            System.out.println("冷却5秒");
                            Thread.sleep(5000);
                            count = 0;
                        }else {
                            Thread.sleep(1000);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count++;
                }
            }
        };
        t1.start();
    }
} 
