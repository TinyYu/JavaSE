package java_MiddleRank.list.test.test_10;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author: ly
 * @date: 2020/03/25
 **/
public class MyHashMap implements IHashMap{
    private Object[] objects = new Object[2000];
    @Override
    public void put(String key, Object object) {
        if (objects[hashcode(key)] == null) {
            LinkedList<Object> linkedList = new LinkedList<>();
            linkedList.add(new Entry(key,object));
            objects[hashcode(key)] = linkedList;
        } else {
            LinkedList<Object> linkedList = (LinkedList<Object>) objects[hashcode(key)];
            linkedList.addLast(new Entry(key,object));
            objects[hashcode(key)] = linkedList;
        }
    }

    @Override
    public Object get(String key) {
        Object object = null;
        if (objects[hashcode(key)] == null){
            object = null;
        }
        LinkedList<Object> linkedList = (LinkedList<Object>) objects[hashcode(key)];
        for (Object o : linkedList){
            Entry e = (Entry) o;
            if (e.getKey().equals(key)){
                object = e.getValue();
            }
        }
        return object;
    }

    public int hashcode(String s){
        char[] chars = s.toCharArray();
        int hashcode_int = 0;
        for (int i = 0;i < chars.length;i++){
            hashcode_int += (int) chars[i];
        }
        hashcode_int *= 32;
        if (hashcode_int > 1999){
            hashcode_int = hashcode_int % 2000;
        }
        return hashcode_int;
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }
}
