import java.util.function.*;
import java.util.Date;
public class LamdaFuctionUse {
    public static void main(String[] args) {
        Predicate<Integer> p= i->i%2==0;
        System.out.println(p.test(10));
        Function<String,Integer> f= j->j.length();
        System.out.println(f.apply("Kanak Dwivedi"));
        Function<Integer,Integer> f1= k-> k*k;
        Function<Integer,Integer> f2= k-> k*k*k;
        System.out.println(f1.andThen(f2).apply(9));
        System.out.println(f1.compose(f2).apply(9));
        Consumer<String> c= l->System.out.println(l);
        c.accept("Shiv");
        Supplier<Date> s=()-> new Date();
        System.out.println(s.get());

    }
}
