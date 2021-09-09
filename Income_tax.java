import java.util.Scanner;
class Income_Tax
{
    public static void main(String[] args) {
        double it,tax=0;
        System.out.println("enter your income");
        Scanner sc= new Scanner(System.in);

        if(it<180000)
        {
            System.out.println("your tax is nil");
        }
        else if(it>181001 && it<300000)
        {
            tax=0.1*it;
            System.out.println(tax);
        }
        else if(it>300001 && it<500000)
        {
            tax=0.2*it;
            System.out.println(tax);
        }
        else if(it>500001 && it<1000000)
        {
            tax=0.3*it;
           System.out.println(tax);
        }
    }
}