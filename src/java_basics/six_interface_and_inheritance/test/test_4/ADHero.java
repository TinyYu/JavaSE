package java_basics.six_interface_and_inheritance.test.test_4;


public class ADHero extends Hero{
    //隐藏父类的battleWin方法
    public static void battleWin(){
        System.out.println("ad hero battleWin");
    }

    public static void main(String[] args) {
        Hero h = new ADHero();
        h.battleWin();
    }
}
