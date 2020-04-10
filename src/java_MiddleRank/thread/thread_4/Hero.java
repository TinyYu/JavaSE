package java_MiddleRank.thread.thread_4;

public class Hero {
    private String name;
    private float hp;
    private int damage;

    public Hero() {
    }

    public Hero(String name, float hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    //回血
    public void recover(){
        hp += 1;
    }
    //掉血
    public void hurt(){
        //使用this作为同步对象
        synchronized (this) {
            hp -= 1;
        }
    }

    //在方法前加修饰符
//    public synchronized recover(){
//        hp += 1;
//    }

    public boolean isDead(){
        return 0 >= hp ? true : false;
    }

    public void attackHero(Hero h){
        h.hp -= damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
        if (h.isDead()){
            System.out.println(h.name + "死亡");
        }
    }
}
