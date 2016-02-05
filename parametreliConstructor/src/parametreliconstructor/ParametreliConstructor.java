package parametreliconstructor;
class kahveFincani
{
    public kahveFincani(int adet)
    {
        System.out.println(adet +" adet Kahve Fincanı");
    }
}
public class ParametreliConstructor 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 5; i++) 
        {
            new kahveFincani(i);
        }
    }    
}
