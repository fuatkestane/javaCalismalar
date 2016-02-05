package overloading;

class overloadDemo
{
    void Test()
    {
        System.out.println("Parametresiz");
    }
    
    void Test(int a)
    {
        System.out.println("a: " +a);
    }
    
    void Test(int a, int b)
    {
        System.out.println("A ve B: " +a+" " +b);
    }
    
    double Test(double a)
    {
        System.out.println("double a değeri: " +a);
        return a;
    }
}
public class Overloading 
{
   
    public static void main(String[] args) 
    {
        overloadDemo ob=new overloadDemo();
       
        int i=88;
        
        ob.Test();
        ob.Test(10);
        ob.Test(10,20);
        ob.Test(i);
        ob.Test(123,23);
        
    }
    
}
