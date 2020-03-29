package java_basics.six_interface_and_inheritance.test.test_3;

public class Hero {
    String name;
    public void useMortal(Mortal m){
        m.die();
    }

    public static void main(String[] args) {
        Mortal ad = new ADHero();
        Mortal ap = new APHero();
        Mortal adap = new APADHero();
        Hero h = new Hero();
        h.useMortal(ad);
        h.useMortal(ap);
        h.useMortal(adap);

    }
}
