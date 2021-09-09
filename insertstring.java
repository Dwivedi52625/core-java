package stringasm;

public class insertstring {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("it is used to _ at a specified position");
        
        stringBuffer.replace(14,15, "into the string");
        System.err.println(stringBuffer);
            
        
    }
    
}
