package integerKVPair;

import java.util.Date;

public class Test <T extends Object>{
    private T Key;
    private T value;
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public T getKey() {
        return Key;
    }
    public void setKey(T key) {
        Key = key;
    }
    
}
