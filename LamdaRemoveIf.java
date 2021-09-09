import java.util.*;

public class LamdaRemoveIf {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Kanak");
        str.add("Manu");
        str.add("Kanchan");
        str.add("Tanu");
        
            str.removeIf(n-> n.length() %2==1);
            System.out.println(str);
        
        
    }
}
