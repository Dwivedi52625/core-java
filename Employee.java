import java.util.TreeSet;
import java.util.Comparator;

class Employee{
    int id,salary;
    String name,department;
    public Employee(int id,int salary,String name,String department) {
        this.department=department;
        this.name=name;
        this.id=id;
        this.salary= salary;
    }
    
    public String toString() {
        return id + " : " + name + " : " + salary + " : " + department;
    }
    public String getName() {
        return name;
    }

}
class compairname implements Comparator<Employee>{

    
    public int compare(Employee obj1,Employee obj2) {
        
        return obj1.getName().compareTo(obj2.getName());
    }
      
}
class main{
    public static void main(String[] args) {
        TreeSet<Employee>ts = new TreeSet<>(new compairname());
        ts.add(new Employee(1001,24000,"Kanak","Developement"));
        ts.add(new Employee(1002,23000,"Tanvi","Government"));
        ts.add(new Employee(1003,25000, "Tanu", "Electrician"));
        ts.add(new Employee(1004,26000, "Manu", "Surveying"));
        ts.add(new Employee(1005,27000, "Ankit", "Supporting"));
        ts.add(new Employee(1006,28000, "Hardik", "Testin"));
        ts.add(new Employee(1007,29000, "Sanjay", "Managing"));
        ts.add(new Employee(1008,30000, "Shahid", "Building"));
        ts.add(new Employee(1009,31000, "Naina", "Modeling"));
        ts.add(new Employee(1010,34000, "Mudit", "Gym"));
        System.out.println(ts);

    }
}