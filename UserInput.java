import java.io.*;
import java.util.Scanner;
class UserInput {
    public static void main(String[] args) throws IOException,NumberFormatException {
   File f = new File("menu.txt");
   f.createNewFile();
   Scanner sc = new Scanner(System.in);
   boolean on = true;
   boolean temp =true;
   int item=1;
   while(on){
   System.out.println("select your option :- 1-Insert new price, 2-View purchase, 3-Exit");
   
   int opt=sc.nextInt();
   if(opt==1){
       while(temp){
           System.out.println("insert the "+ item
           +"price");
           int price =sc.nextInt();
           item +=1;
           FileWriter fw=new FileWriter(f, true);
           fw.write(String.valueOf(price)+ " ");
           fw.close();

           System.out.println("Do you want to enter price for more item? yes/no.");
           String yn=sc.next().toLowerCase();
           if(yn.equals("no")){
              temp =false;
       }  
    }
    temp=true;
    }
    else if(opt==2){
        FileReader fr= new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String s;
        int totalPrice=0;
        while ((s=br.readLine()) != null) {
            String[] p=s.split(" ");
            for (String price : p) {
                totalPrice +=Integer.valueOf(price);
            }
        }
        System.out.println("Total price of all item is "+ totalPrice);
        fr.close();
        br.close();
    }
    else{
        on= false;
        System.out.println("exit program.....");
    }
    }   
}
}

