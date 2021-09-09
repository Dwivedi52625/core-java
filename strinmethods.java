package stringasm;

public class strinmethods {
    public static void main(String[] args) {
        String str="Java Strig pool refers to collection of Strings which are stored in heap memory";
        String n=str.toUpperCase();
        System.out.println(n);
        String m=str.toLowerCase();
        System.out.println(m);
        String o=str.replace("a","$");
        System.out.println(o);
        System.out.println(str.contains("collection"));
        String str1="Java strig pool refers to collection of strings which are stored in heap memory";
        System.out.println(str1.equalsIgnoreCase(str));
        System.out.println(str1.equals(str));
    }
    
}
