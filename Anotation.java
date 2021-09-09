import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Documented
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{
String name() default "Kannu";

}

class myBase {
    @Test(name = "Kanak")
    public void add() {
        int a=10,b=20;
        int c=a+b;
        System.out.println(c);
    }
  
    
}
class main{
    public static void main(String[] args) throws Exception{
        myBase an = new myBase();
        an.add();
       Method method= an.getClass().getMethod("add");
       Test annotation = method.getAnnotation(Test.class);
       System.out.println(annotation.name());
    
        
    }
}