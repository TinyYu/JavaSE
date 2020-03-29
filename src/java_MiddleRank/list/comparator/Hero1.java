package java_MiddleRank.list.comparator;

/**
 * @author: ly
 * @date: 2020/03/25
 **/
public class Hero1 implements Comparable<Hero1>{
    private String name;
    private float hp;
    private int damage;

    public Hero1() {
    }

    public Hero1(String name, float hp, int damage) {
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

    @Override
    public int compareTo(Hero1 o) {
        if (this.hp > o.hp)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Hero1{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }
}
