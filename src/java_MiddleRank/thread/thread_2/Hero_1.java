package java_MiddleRank.thread.thread_2;

public class Hero_1 {
    private String name;
    private float hp;
    private int damage;

    public Hero_1() {
    }

    public Hero_1(String name, float hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attackHero(Hero_1 h){
        /**
         * 去除暂停时间，多线程各自会尽力去占有cpu资源
         * 这样才能看出线程的优先级效果
         */
//        try {
//            //每次攻击暂停1000毫秒
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        h.hp -= damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
    }

    public boolean isDead(){
        return 0 >= hp ? true : false;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }
}
