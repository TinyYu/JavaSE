package java_Senior.annotation.annotation_4;

import java.lang.reflect.Method;

/**
 * 解析注解
 **/
public class ParseHibernateAnnotation {
    public static void main(String[] args) {
        Class<Hero> clazz = Hero.class;
        MyEntity myEntity = clazz.getAnnotation(MyEntity.class);
        if (myEntity == null){
            System.out.println("Hero类不是实体类");
        } else {
            System.out.println("Hero类是实体类");

            //获取表名
            MyTable myTable = clazz.getAnnotation(MyTable.class);
            String tableName = myTable.name();
            System.out.println("其对应的表名是:" + tableName);

            //获取方法
            Method[] methods = clazz.getMethods();
            Method primaryKeyMethod = null;
            for (Method m : methods){
                MyId myId = m.getAnnotation(MyId.class);
                if (null != myId){
                    primaryKeyMethod = m;
                    break;
                }
            }
            if (primaryKeyMethod != null){
                System.out.println("找到主键：" + method2attribute(primaryKeyMethod.getName()));
                MyGeneratedValue myGeneratedValue = primaryKeyMethod.getAnnotation(MyGeneratedValue.class);
                System.out.println("其自增长的策略是:" + myGeneratedValue.strategy());
                MyColumn myColumn = primaryKeyMethod.getAnnotation(MyColumn.class);
                System.out.println("对应数据库中的字段是:" + myColumn.value());
            }
            System.out.println("其他非主键属性分别对应的数据库字段如下：");
            for (Method m : methods){
                if (m == primaryKeyMethod){
                    continue;
                }
                MyColumn myColumn = m.getAnnotation(MyColumn.class);
                //那些setter方法上是没有MyColumn注解的
                if (null == myColumn)
                    continue;
                System.out.format("属性: %s\t对应的数据库字段是:%s\n",method2attribute(m.getName()),myColumn.value());
            }
        }
    }

    public static String method2attribute(String methodName){
        String result = methodName;
        result = result.replaceFirst("get","");
        result = result.replaceFirst("is","");
        if (result.length() <= 1){
            return result.toLowerCase();
        } else {
            return result.substring(0,1).toLowerCase() + result.substring(1,result.length());
        }
    }
}
