import java.util.Scanner;
public class loginPage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sp=" ";
        System.out.println("Enter the Username");
        String uname = sc.nextLine();
        if((uname.contains(sp)) || uname.length()<4){
            System.out.println("Invalid Username");
            return;
        }

        System.out.println("Enter the Password");
        String upass = sc.nextLine();
        if((upass.contains(sp)) || upass.length()<8){
            System.out.println("Invalid Password");
            return;
        }

        System.out.println(uname+" you are Registered Successfully");

        System.out.println("Enter the Username");
        String lname = sc.nextLine();
        System.out.println("Enter the Password");
        String lpass = sc.nextLine();
        for(int i=1;i<=2;i++)
        {
        if(uname.equals(lname) && upass.equals(lpass)){
            System.out.println("Welcome "+lname+" you have Logged-in Successfully");
        }
        else{
            System.out.println("Username or password Mismatch");
            System.out.println("Enter the Username");
            String usname = sc.nextLine();
            System.out.println("Enter the Password");
        String uspass = sc.nextLine();
    }
    }
}
}