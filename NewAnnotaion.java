import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Target({ElementType.Type,ElementType.METHOD,ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
    public String name();
}
class MyClass{
    @Execute(name = "Sequence=2")
    public void myMethod1() {
        int a=10,b=20,c;
        c=a+b;
    }
    @Execute(name = "Sequence=1")
    public void myMethod2() {
        int a=10,b=20,c;
        c=a-b;
    }
    @Execute(name = "Sequence=2")
    public void myMethod3() {
        int a=10,b=20,c;
        c=a*b;
    }
}

class NewAnnotaion {
    public static void main(String[] args) throws Exception,NoSuchMethodException{
        MyClass mac= new MyClass();
        mac.myMethod1();
        mac.myMethod2();
        mac.myMethod3();
        Method mf = mac.getClass().getMethod("Execute");
        Execute ex =mf.getAnnotation(Execute.class);
        System.out.println(ex.name());
    }
}
