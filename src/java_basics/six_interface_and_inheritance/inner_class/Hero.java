package java_basics.six_interface_and_inheritance.inner_class;

/**
 * 非静态内部类
 **/
public class Hero {
    String name;

    // 非静态内部类，只有一个外部类对象存在的时候，才有意义
    // 战斗成绩只有在一个英雄对象存在的时候才有意义
    class BattleScore{
        int kill;//击杀
        int die;//死亡
        int assit;//助攻

        public void legendary(){
            if (kill >= 8){
                System.out.println(name + "超神");
            } else {
                System.out.println(name + "未超神");
            }
        }
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "tm";

        //实例化内部类
        //BattleScore对象只有在一个英雄对象存在的时候才有意义
        //所以其实实例化必须建立在一个外部类对象的基础之上
        BattleScore score = h.new BattleScore();
        score.kill = 9;
        score.legendary();
    }
} 
