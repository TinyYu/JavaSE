package java_MiddleRank.list.test.test_10;

/**
 * @author: ly
 * @date: 2020/03/25
 **/
public class Hero {
    private String name;

    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }
}
