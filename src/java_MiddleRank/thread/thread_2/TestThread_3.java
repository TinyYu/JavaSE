package java_MiddleRank.thread.thread_2;


import sun.awt.windows.ThemeReader;

/**
 * 线程的优先级
 **/
public class TestThread_3 {
    public static void main(String[] args) {
        Hero_1 h1 = new Hero_1("hero1",616,30);
        Hero_1 h2 = new Hero_1("hero2",516,40);
        Hero_1 h3 = new Hero_1("hero3",416,50);
        Hero_1 h4 = new Hero_1("hero4",716,20);

        Thread t1 = new Thread(){
            public void run(){
                while (!h1.isDead()){
                    h2.attackHero(h1);
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                while (!h3.isDead()){
                    h4.attackHero(h3);
                }
            }
        };
    }
} 
