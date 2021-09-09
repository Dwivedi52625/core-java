import java.util.Scanner;

public interface Lamda2 {
    boolean printorder();
}
class order{
    int orderprice;
    String status;
    order(int price,String status){
        this.orderprice = price;
        this.status = status;
    }
}

class shop{
    public static void main(String[] args) {
    order obj = new order(2500,"Accepted");
    
    Lamda2 l= ()-> obj.orderprice > 1000 && (obj.status =="Accepted" || obj.status == "completed");
    System.out.println((l.printorder()? "Order placed":"order not placed"));
        
    }
}
