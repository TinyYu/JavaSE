package java_MiddleRank.thread.thread_5;

public class Hero_1 {
    private String name;
    private float hp;

    public Hero_1() {
    }

    public Hero_1(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    public synchronized void recover(){
        hp += 1;
        System.out.printf("%s 回血1点,增加血后，%s的血量是%.0f%n", name, name, hp);
        //// 通知那些等待在this对象上的线程，可以醒过来了
        this.notify();
    }

    public synchronized void hurt(){
        if (hp == 1){
            try {
                // 让占有this的减血线程，暂时释放对this的占有，并等待
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hp -= 1;
        System.out.printf("%s 减血1点,减少血后，%s的血量是%.0f%n", name, name, hp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Hero_1{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
