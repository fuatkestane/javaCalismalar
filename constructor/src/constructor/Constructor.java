package constructor;
class kahveFincani
{
    public kahveFincani()
    {
        System.out.println("Kahve Fincanı...");
    }
}
public class Constructor 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < 5; i++) 
        {
            new kahveFincani();
        }
    }
    
}
