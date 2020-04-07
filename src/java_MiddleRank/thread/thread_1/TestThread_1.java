package java_MiddleRank.thread.thread_1;

/**
 * 多线程概念
 * 进程：启动一个LOL.exe就叫一个进程。 接着又启动一个DOTA.exe，这叫两个进程。
 * 线程：线程是在进程内部同时做的事情，比如在LOL里，有很多事情要同时做，比如"盖伦” 击杀“提莫”，同时“男枪”又在击杀“女枪”，这就是由多线程来实现的。
 * TestThread_1 是进程
 */
public class TestThread_1 {
    public static void main(String[] args) {
        Hero h1 = new Hero("盖伦",616,50);
        Hero h2 = new Hero("提莫",300,30);
        Hero h3 = new Hero("男枪",616,50);
        Hero h4 = new Hero("女枪",300,30);

        //盖伦攻击提莫
        while (!h2.isDead()){
            h1.attackHero(h2);
        }

        //男枪攻击女枪
        while(!h4.isDead()){
            h3.attackHero(h4);
        }
    }
}
