package java_MiddleRank.genericity.generictiy_3;

/**
 * APHero extends Hero
 */
public class APHero extends Hero {
    private String name;

    public APHero(String name) {
        this.name = name;
    }

    public APHero(String name, float hp, String name1) {
        super(name, hp);
        this.name = name1;
    }

    @Override
    public String toString() {
        return "APHero{" +
                "name='" + name + '\'' +
                '}';
    }
}
