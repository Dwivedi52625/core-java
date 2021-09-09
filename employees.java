class employees{
        
    
    int x=20000;
    int y=5000;
    int z=6000;
    int total;
    public int getsalary() {
        return x;
    } 
        
    
    public void setsalary(int x){
     System.out.println("you salary is"+x);
     this.x= x;
    }
    public int getot() {
        return y;
    }
    public void setot(){
        System.out.println("your over time is"+z);
        this.y=y;
    }
    public int getincen() {
        return z;
    }
    public void setincen(){
        System.out.println("your over time is"+y);
        this.z=z;
    }
    public void ts() {
        total=x+y+z;
        System.out.println("employee total salary is"+total);
    }
}


class manager extends employees{
    public int getincen() {
        return z;
    }
    public void setincen(){
        System.out.println("your over time is"+y);
        this.z=z;
    }
}
class worker extends employees{
    public int getot() {
        return y;
    }
    public void setot(){
        System.out.println("your over time is"+z);
        this.y=y;
    }
}
class emp extends employees{
    public static void main(String[] args) {
        employees s = new employees();
        s.getincen();
        s.getot();
        s.ts();
    }
}
