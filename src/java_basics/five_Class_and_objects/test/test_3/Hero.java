package java_basics.five_Class_and_objects.test.test_3;

/**
 * 为Hero设计4个参数的构造方法
 * 这四个参数分别是
 * String heroName
 * float heroHP
 * float heroArmor
 * int heroMoveSpeed
 */
public class Hero {
    String heroName;
    float heroHP;
    float heroArmor;
    int heroMoveSpeed;

    public Hero(String heroName, float heroHP, float heroArmor, int heroMoveSpeed) {
        this.heroName = heroName;
        this.heroHP = heroHP;
        this.heroArmor = heroArmor;
        this.heroMoveSpeed = heroMoveSpeed;
    }
}
