package java_MiddleRank.list.test.test_10;

/**
 * @author: ly
 * @date: 2020/03/25
 **/
public class Entry {
    private Object key;
    private Object value;

    public Entry() {
    }

    public Entry(Object key, Object value) {
        super();
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" +
                "key=" + key +
                ", value=" + value +
                ']';
    }
}
