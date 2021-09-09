package exception_handel;

import java.util.Scanner;

class exception_handeling
{
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
        }      
        
        System.out.println("exception has been handeled");
    }
    else{
        int d=a/b;
        System.out.println("your answer is" +d);
    }
}
}