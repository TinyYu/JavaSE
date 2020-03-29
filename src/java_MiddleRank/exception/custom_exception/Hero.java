package java_MiddleRank.exception.custom_exception;

/**
 * 抛出自定义异常
 **/
public class Hero {
    public String name;
    float hp;

    public void attackHero(Hero hero) throws TestException{
        if (hero.hp == 0)
            //创建TestException实例,通说throw抛出异常
            throw  new TestException(hero.name + "死亡");
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "tm";
        h.hp = 0;

        try {
            h.attackHero(h);
        } catch (TestException e) {
            //e.getMessage() 获取当时出错的具体原因
            System.out.println("异常的具体原因:" + e.getMessage());
            e.printStackTrace();
        }
    }
} 
