package integerKVPair;

import java.util.Date;



public class NewTest {
    public static void main(String[] args) {
        Test<String> jc=new Test<>();
        jc.setKey("Today is");
        jc.setValue(String.valueOf( new java.util.Date()));
        System.out.println(jc.getKey());
        System.out.println(jc.getValue());
        //I can create object of date and call java.util.Date()
        Date temp = new Date();
        jc.setValue(String.valueOf(temp));
        
    }    
}
