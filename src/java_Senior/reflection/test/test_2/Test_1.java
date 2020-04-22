package java_Senior.reflection.test.test_2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test_1 {
    public static void main(String[] args) {
        File f = new File("F:\\java\\JavaSE\\src\\java_Senior\\reflection\\test\\test_2\\hero.config");
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            List<String> list = new ArrayList<>();
            while (true){
                String line = br.readLine();
                if (line == null)
                    break;
                list.add(line);
            }
            Hero hero1 = getHero(list.get(0));
            setName(hero1,list.get(1));

            Hero hero2 = getHero(list.get(2));
            setName(hero2,list.get(3));

            Method m = hero1.getClass().getMethod("attackHero", Hero.class);
            m.invoke(hero1,hero2);
        } catch (IOException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
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

    public static void setName(Hero hero,String name){
        try {
            Method m = hero.getClass().getMethod("setName", String.class);
            m.invoke(hero,name);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
