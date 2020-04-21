package java_Senior.reflection.test.test_2;

/**
 * 获取类对象，会初始化类属性
 **/
public class Hero {
    private String name;
    private float hp;
    private int damage;
    private int id;

    static String copyright;

    static {
        copyright = "版权由Riot Games公司所有";
    }

    public Hero() {
    }

    public Hero(String name, float hp, int damage, int id) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getCopyright() {
        return copyright;
    }

    public static void setCopyright(String copyright) {
        Hero.copyright = copyright;
    }

    public void attackHero(Hero h2){
        System.out.println(this.name + " 正在攻击 " + h2.getName());
    }
}
