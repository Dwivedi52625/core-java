import java.util.ArrayList;
import java.util.function.Consumer;

class Lamda5 {
    public static void main(String[] args) {
        ArrayList<String> strb = new ArrayList<>();
        strb.add("Kanak");
        strb.add("Tanvi");
        strb.add("Hardik");
        strb.add("Shantanu");
        strb.add("Ankit");

       
        Consumer<String> c= s-> System.out.println(s.charAt(0));
        for (String str : strb) {
            c.accept(str);
        }
       
    }
}
