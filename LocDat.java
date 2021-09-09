import java.util.*;
import java.time.*;
public class LocDat {
    public static void main(String[] args) {
        LinkedList<LocalDate> ld = new LinkedList<>();
        ld.add(LocalDate.of(1999,12,23));
        ld.add(LocalDate.of(2000,12,23));
        print(ld);
    }
    public static void print(LinkedList<LocalDate> ld){
        Collections.reverse(ld);
        for(LocalDate item:ld){
            System.out.println("your date of birth is"+ item + "and date of birth is Leapyear "+ item.isLeapYear() );
        }
    }
    
}
