package exception_handel;

import java.util.Scanner;

public class unsupportedException {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the divident");
        a=sc.nextInt();
        System.out.println("enter the divisior");
        b=sc.nextInt();
        if(b==0){
        try {
            int c=a/b;
            System.out.println("Arithmetic_Exception is ouccured"+ c);
        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println("Denomenator can't be 0");
            e.printStackTrace();
        } catch (UnsupportedOperationException ex){
            System.out.println("Arithmetic_Exception handeled");
            System.out.println("enter the divisior");
            b=sc.nextInt();
            int d = a/b;
            System.out.println("your answer is"+d);
        }
    
     
        
        System.out.println("exception has been handeled");
    } 
    
}
}
