package java_basics.five_Class_and_objects.overload;

/**
 * 可变参数
 */
public class ADHero extends Hero{
    //可变参数
    public void attack(Hero... heros){
        for (int i = 0;i < heros.length;i++) {
            System.out.println(name + "攻击了" + heros[i].name);
        }
    }

    public static void main(String[] args) {
        ADHero a = new ADHero();
        a.name = "赏金猎人";

        Hero  h1 = new Hero();
        h1.name = "提莫";
        Hero h2 = new Hero();
        h2.name = "盖伦";
        a.attack(h1,h2);
    }
}
