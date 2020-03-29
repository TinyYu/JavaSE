package java_basics.six_interface_and_inheritance.conceal;

public class ADHero extends Hero implements AD{
    @Override
    public void attack() {
        System.out.println("物理伤害");
    }

    //隐藏父类的battleWin方法
    public static void battleWin(){
        System.out.println("ad hero battleWin");
    }

    public static void main(String[] args) {
        Hero.battleWin();
        ADHero.battleWin();
    }
}
