import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
    String info() default "private_info";

    String value();
}

class Anotation2 {
  @Info(value = "Mandatory_input")
  public Integer getid(int id){
      return id;
}  
@Info(value = "Optional_input")
public String authorname(String name){
    return name;
}
@Info(value = "Optional_input")
public String getsupname(String supname){
    return supname;
}
@Info(value = "Mandatory_input")
public Integer getversion(int number){
    return number;
}  
}
class main{
    public static void main(String[] args) throws Exception{
        Anotation2 ann= new Anotation2();
        ann.getid(231001);
        ann.authorname("Kanak");
        ann.getsupname("DWIVEDI");
        ann.getversion(11);
        Method me = ann.getClass().getMethod("Info");
        Info info= me.getAnnotation(Info.class);
        System.out.println(info.value());

    }
}
