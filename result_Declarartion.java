import java.util.Scanner;
import java.util.scanner;
class result_Declarartion {
    public static void main(String[] args) {
        double math,physics,chemystry;
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the marks of math");
        math=sc.nextDouble();

        System.out.println("enter the marks of physics");
        physics=sc.nextDouble();

        System.out.println("enter the marks of chemystry");
        chemystry=sc.nextDouble();

        if(math>=60.0 && physics>=60.0 && chemystry>=60.0)
        {
           System.out.println("Passed");
        }
        else if((math>=60.0 && physics>=60.0) || (physics>=60.0 && chemystry>=60.0) || (math>=60.0 && chemystry>=60.0))
        {
            System.out.println("Pramoted");            
        }
        else
        {
            System.out.println("Failed");
        }
    }
}
