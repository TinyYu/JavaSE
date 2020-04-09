package java_MiddleRank.thread.thread_2;

/**
 * 临时暂停线程
 **/
public class TestThread_4 {
    public static void main(String[] args) {
        Hero_1 h1 = new Hero_1("hero1",61600,1);
        Hero_1 h2 = new Hero_1("hero2",51600,1);
        Hero_1 h3 = new Hero_1("hero3",41600,1);
        Hero_1 h4 = new Hero_1("hero4",71600,1);
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
                    //临时暂停，使得t1可以占用CPU资源
                    Thread.yield();
                    h4.attackHero(h3);
                }
            }
        };
        t1.setPriority(5);
        t2.setPriority(5);
        t1.start();
        t2.start();

    }
} 
