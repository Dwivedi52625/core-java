import java.util.ArrayList;
import java.util.thread;
import java.util.function.Consumer;
class Demo extends Thread{
    ArrayList<Integer> lst;
    Demo(ArrayList<Integer> lst){
        this.lst= lst;
    }
    public void run(){
        print(lst);
    }
    Consumer<Integer> cc =s-> System.out.println(s);
    void print(ArrayList<Integer> ar){
        for (Integer i : ar) {
         cc.accept(i);   
        }
    }
}

public class Lamda8 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(52);
        ar.add(87);
        ar.add(69);
        ar.add(45);
        ar.add(78);
        ar.add(23);
        Demo t=new Demo(ar);
        t.start();
    }
}

