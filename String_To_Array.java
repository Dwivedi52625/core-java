import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_To_Array {
    public static void main(String[] args) {
    
    String Alphabet="A quick brown fox jumps over the lazy dog";
    String[] ar= Alphabet.split(",");
    List<String> t = Arrays.asList(ar);
    ArrayList<String> al = new ArrayList<>(t);
    Object[] ptr= al.toArray();
    for (Object obj : ptr) {
         System.out.println(obj);
    }
}
}
