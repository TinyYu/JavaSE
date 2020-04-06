package java_MiddleRank.lambda.lambda_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * 引用构造器
 */
public class TestLambda_3 {
    public static void main(String[] args) {
        Supplier<List> s = new Supplier<List>() {
            @Override
            public List get() {
                return new ArrayList();
            }
        };

        //匿名类
        List list1 = getList(s);

        //lambda表达式
        List list2 = getList(() -> new ArrayList());

        //引用构造器
        List list3 = getList(ArrayList::new);
    }

    public static List getList(Supplier<List> s){
        return s.get();
    }
}
