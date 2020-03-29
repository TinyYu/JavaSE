package java_basics.five_Class_and_objects.this_test;

/**
 * 通过this访问属性
 */
public class This_2 {
    String name; //姓名
    float hp; //血量

    //参数名和属性名一样
    //在方法体中，只能访问到参数name
    public void setName1(String name){
        name = name;
    }

    //为了避免setName1中的问题，参数名不得不使用其他变量名
    public void setName2(String heroName){
        name = heroName;
    }

    //通过this访问属性
    public void setName3(String name){
        //name代表的是参数name
        //this.name代表的是属性name
        this.name = name;
    }

    public static void main(String[] args) {
        This_2 t = new This_2();
        t.setName1("tm");

        This_2 t1 = new This_2();
        t1.setName2("tm");

        This_2 t2 = new This_2();
        t2.setName3("tm");
    }
}
