package java_MiddleRank.genericity.test;

import java.util.ArrayList;

public class Test_3 {
    //多余
    public static void iterate(ArrayList<Hero> list) {
        for (Hero hero : list) {
            System.out.println(hero.getName());
        }
    }

    public static void iterateAP(ArrayList<APHero> list) {
        for (Hero hero : list) {
            System.out.println(hero.getName());
        }
    }

    public static void iterateAD(ArrayList<ADHero> list) {
        for (Hero hero : list) {
            System.out.println(hero.getName());
        }
    }

    public static void main(String[] args) {
        ArrayList<Hero> hs = new ArrayList<>();
        ArrayList<APHero> aphs = new ArrayList<>();
        ArrayList<ADHero> adhs = new ArrayList<>();

        hs.add(new Hero(1,"hero"));
        aphs.add(new APHero(1,"ap"));
        adhs.add(new ADHero(1,"ad"));

        iterate(hs);
        iterateAP(aphs);
        iterateAD(adhs);

        iterateS(hs);
        iterateS(aphs);
        iterateS(adhs);
    }

    //简化
    public static void iterateS(ArrayList<? extends Hero> list){
        for (Hero h : list){
            System.out.println(h.getName());
        }
    }
}
