package keyvalpair;
import keyvalpair.Pair;
public class newpair {
    public static void main(String[] args) {
        Pair<String> ps = new Pair<>();
        ps.setKey("1");
        ps.setValue("Hello");
        System.out.println(ps.getKey());
        System.out.println(ps.getValue());
    }
}
