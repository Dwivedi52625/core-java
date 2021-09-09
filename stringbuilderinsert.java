package stringasm;

public class stringbuilderinsert {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("it is used to _ at a specified position");
        
        stringBuilder.replace(14,15, "into the string");
        System.err.println(stringBuilder);
            
    }
}
