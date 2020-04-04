package java_MiddleRank.genericity.test;

public class Hero implements Comparable<Hero> {
    private float hp;
    private String name;

    public Hero() {
    }

    public Hero(float hp,String name) {
        this.hp = hp;
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "hp=" + hp +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Hero o) {
        if (hp < o.hp) {
            return -1;
        } else {
            return 1;
        }
    }
}
