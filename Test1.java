package CollectionFW;

import java.util.HashSet;

public class Test1 {
public static void main(String[] args) {
    HashSet<Object> h= new HashSet<>();
    h.add(20);
    h.add("dumbell");
    h.add(30);
    h.add("barbell");
    h.add(40);
    h.add("cabel");
    h.add(50);
    h.add("Plates");
    h.add(60);
    h.add("machine");
    System.out.println(h);
    System.out.println(h.add(20)); 
}
}
