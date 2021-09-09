package exception_handel;

import java.util.Scanner;

class Insufficientbalance_Exception extends Exception{
    Insufficientbalance_Exception()
    {
        super("you don't have sufficient balance");
    }
   
}
class Illegalbanktransaction_Exception extends Exception{

    public void Illegalbanktransaction() {
        System.out.println("you don't have enough balance or you are trying to withdraw -ve balance");
    }
}
class saving_account {
  private long id=1234;
  static double balance=5000.0;
  static double amount;
  static double newbalance;
  void withdraw() throws Illegalbanktransaction_Exception, Insufficientbalance_Exception
  {
   System.out.println("enter the amount you want to withdraw");
   Scanner sc = new Scanner(System.in);
   amount=sc.nextDouble();
   
   if (amount>balance )
        {
           throw new Illegalbanktransaction_Exception();
          
       }
       else if(newbalance != 0){
           throw new Insufficientbalance_Exception();
       }
       else{
        newbalance=balance-amount;
   System.out.println(newbalance); 
  }
}
  void deposite()
  {double amt;
    double total;
   System.out.println("enter the amount you want to deposite in your account");
   Scanner se = new Scanner(System.in);
   amt=se.nextDouble();
   if(amount>balance){
    total=balance+amt;
   System.out.println(total); 
  }
  else{
      total=newbalance+amt;
      System.out.println(total);
  }
  
}
class test extends saving_account{
 public static void main(String[] args)throws Illegalbanktransaction_Exception, Insufficientbalance_Exception {
     try { if (amount>balance )
        {  
            System.out.println("entered amount can't be resolved");
           
        }
         
     }
     finally{
         saving_account sa = new saving_account();
         Illegalbanktransaction_Exception ex = new Illegalbanktransaction_Exception();
         sa.withdraw();
         
         sa.deposite();
         sa.withdraw();
     }
 }
}}