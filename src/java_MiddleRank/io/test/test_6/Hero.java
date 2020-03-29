package java_MiddleRank.io.test.test_6;

import java.io.Serializable;

/**
 * @author: ly
 * @date: 2020/03/16
 **/
public class Hero implements Serializable {
    //表示这个类当前的版本
    private static final long serialVersionUID = 1L;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
