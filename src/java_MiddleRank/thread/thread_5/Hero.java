package java_MiddleRank.thread.thread_5;

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
        hp += 1;
    }

    public synchronized  void hurt(){
        hp -= 1;
    }
    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
