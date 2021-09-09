/**
 * Lamda1
 */
public interface Lamda1 {
public void m1(int a , int b);
    
} 
class New{
    public static void main(String[] args) {
        
        Lamda1 i= (a,b)-> System.out.println("The sum is " + (a+b));
        Lamda1 j= (a,b)-> System.out.println("The substraction is " + (a-b));
        Lamda1 k= (a,b)-> System.out.println("The multiplication is " + (a*b));
        Lamda1 l= (a,b)-> System.out.println("The division is " + (a/b));
        i.m1(66,3);
        j.m1(66,3);
        k.m1(66,3);
        l.m1(66,3);
        
    }
}