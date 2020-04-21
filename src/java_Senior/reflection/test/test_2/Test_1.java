package java_Senior.reflection.test.test_2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test_1 {
    public static void main(String[] args) {
        File f = new File("F:\\java\\JavaSE\\src\\java_Senior\\reflection\\test\\test_2\\hero.config");
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (true){
                String line = br.readLine();
                if (line == null)
                    break;
                Hero hero = getHero(line);
                if (hero instanceof ADHero){
                    ((ADHero) hero).magicAttack();
                } else if (hero instanceof APHero){
                    ((APHero) hero).magicAttack();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Hero getHero(String line){
        Class pClass = null;
        Hero hero = null;
        try {
            pClass = Class.forName(line);
            Constructor c = pClass.getConstructor();
            hero = (Hero)c.newInstance();
            return hero;
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return hero;
    }

    public static void att(Hero hero,Hero hero2,String name){
        try {
            Method m = hero.getClass().getMethod("setName", String.class);
            m.invoke(hero,name);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
