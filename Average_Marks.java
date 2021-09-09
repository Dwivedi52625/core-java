class Average_Marks {
    int a,b,c,sum;
    double avg;
    
    void get(int sub1,int sub2,int sub3)
    {
        a=sub1;
        b=sub2;
        c=sub3;
        
    }
    void display()
    {
        avg=(a+b+c)/3;
        sum=a+b+c;
    System.out.println(a+"sub1");
    System.out.println(b+"sub2");
    System.out.println(c+"sub3");
    
    System.out.println(avg+"average");
    System.out.println(sum+"total");
        
    }

    
    
}
class data{
    public static void main(String[] args) {
        Average_Marks s1=new Average_Marks();
        s1.get(69, 79, 89 );
        s1.display();
        
    }
}
