package java_MiddleRank.thread.thread_1;

/**
 * 使用匿名类,继承Thread
 **/
public class TestThread_4 {
    public static void main(String[] args) {
        Hero h1 = new Hero("hero1",616,30);
        Hero h2 = new Hero("hero2",516,40);
        Hero h3 = new Hero("hero3",416,50);
        Hero h4 = new Hero("hero4",716,20);

        //匿名类
        Thread t1 = new Thread(){
            public void run(){
                //匿名类中用到局部变量h1，必须把h1声明为final，JDK7之后，不是必须要加final了
                while (!h1.isDead()){
                    h2.attackHero(h1);
                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                while (!h3.isDead()){
                    h4.attackHero(h3);
                }
            }
        };
        t2.start();
    }
} 
