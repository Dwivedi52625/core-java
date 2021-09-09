interface TestDemo{
    public void TestLambda(int amt,int rate,int time);
}
class Simp{
    public static void main(String[] args) {
        
    
        TestDemo si=(int amt,int rate,int time)->System.out.println((amt*rate*time)/100);
        si.TestLambda(1000, 11, 2);
    }
}