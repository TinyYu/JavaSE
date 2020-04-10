package java_MiddleRank.thread.test.test_4;

public class Hero {
    private String name;
    private float hp;

    public Hero() {
    }

    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
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

    public synchronized void recover(){
        if (hp == 1000){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hp = hp + 1;
        System.out.printf("%s 回血1点,增加血后，%s的血量是%.0f%n", name, name, hp);
    }

    public synchronized void hurt(){
        hp = hp - 1;
        System.out.printf("%s 减血1点,减少血后，%s的血量是%.0f%n", name, name, hp);
        if (hp == 1){
            this.notify();
        }
    }
}
