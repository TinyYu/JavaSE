package java_MiddleRank.list.test.test_3;

public class Hero {
    private String name;
    private float fp;

    public Hero() {
    }

    public Hero(String name, float fp) {
        this.name = name;
        this.fp = fp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFp() {
        return fp;
    }

    public void setFp(float fp) {
        this.fp = fp;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", fp=" + fp +
                '}';
    }
}
