package stringasm;

public class joinstring {
    public static void main(String[] args) {
        String str1,str2;
        str1="Hello";
        str2=" How are you";
      //  String join= str1+str2; string are join using "+" sign
        //System.out.println(join);
        String result = str1.concat(str2);
        System.out.println(result);
    }
    
}
