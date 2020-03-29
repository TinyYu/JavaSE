package java_basics.five_Class_and_objects.test.test_2;

/**
 * 辅助英雄类
 */
public class Support extends Hero{
    int hp;
    public void heal(){
        System.out.println("加血");
    }
    public void heal(Hero hero){
        System.out.println(name + "为" + hero.name + "加血");
    }
    public void heal(Hero hero,Support support){
        System.out.println(name + "为" + hero.name + "加" + support.hp + "点血");
    }
    public static void main(String[] args) {
        Support s = new Support();
        s.name = "奶妈";

        Hero h1 = new Hero();
        h1.name = "提莫";
        s.heal(h1);

        Hero h2 = new Hero();
        h2.name = "盖伦";
        s.hp = 100;
        s.heal(h2,s);

    }
}
