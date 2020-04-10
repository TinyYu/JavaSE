package java_MiddleRank.thread.thread_5;

/**
 * 使用while进行线程交互(不推荐)
 */
public class TestThread_1 {
    public static void main(String[] args) {
        Hero h1 = new Hero("h1",611);
        Thread t1 = new Thread(){
            public void run(){
                while(true){
                    //使用while循环判断是否是1，如果是1就不停的循环
                    //直到加血线程回复了血量
                    while(h1.getHp() == 1){
                        continue;
                    }
                    h1.hurt();
                    System.out.printf("t1 为%s 减血1点,减少血后，%s的血量是%.0f%n",h1.getName(),h1.getName(),h1.getHp());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run() {
                while (true) {
                    h1.recover();
                    System.out.printf("t2 为%s 回血1点,增加血后，%s的血量是%.0f%n",h1.getName(),h1.getName(),h1.getHp());
                    try {
                        //t1线程比t2快
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t2.start();
    }
} 
