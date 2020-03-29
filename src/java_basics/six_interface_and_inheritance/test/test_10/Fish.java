package java_basics.six_interface_and_inheritance.test.test_10;


public class Fish extends Animal implements Pet{
    private String name;

    public Fish() {
        super(0);
    }

    public void walk(){
        System.out.println("无法行走");
    }
    @Override
    public void eat() {

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {

    }
}
