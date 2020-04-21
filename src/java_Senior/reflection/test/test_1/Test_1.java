package java_Senior.reflection.test.test_1;


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test_1 {
    public static void main(String[] args) {
        File f = new File("F:\\java\\JavaSE\\src\\java_Senior\\reflection\\test\\test_1\\hero.config");
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
}
