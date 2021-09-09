import java.util.HashMap;
public class Lamda7 {
    public static void main(String[] args) {
        HashMap<String,String> hs = new HashMap<>();
        hs.put("Dwivedi", "Kanak");
        hs.put("Dubey", "Tanvi");
        StringBuilder str = new StringBuilder();
        str.append(" Dwivedi ");
        str.append(" Kanak ");
        str.append(" Dubey ");
        str.append(" Tanvi ");
        System.out.println(str);
        System.out.println(hs.entrySet());
        System.out.println(hs);
    }
}
