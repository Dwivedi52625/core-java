import java.util.ArrayList;

public class Lamda6 {
    public static void main(String[] args) {
        ArrayList<String> l= new ArrayList<>();
        l.add("kanak");
        l.add("shiv");
        l.add("mahakal");

        l.replaceAll(e->e.toUpperCase());
        System.out.println(l);
        
    }
}
