class singleton {
    private static singleton cls=null;
    public String str;
    private singleton()
    {
        str="this is a singleton class";
    }
    public static singleton getinstance()
    {
        if(cls==null){
        cls= new singleton();
        }
        return cls;
    }
}
class Test
{
    public static void main(String[] args) {
        singleton a= singleton.getinstance();
        singleton b= singleton.getinstance();
        singleton c= singleton.getinstance();
        System.out.println("String from a is " + a);   
        System.out.println("String from b is " + b);   
        System.out.println("String from c is " + c);

    }
}
