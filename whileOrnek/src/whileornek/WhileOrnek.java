package whileornek;
public class WhileOrnek 
{
    public static void main(String[] args) 
    {
      int i=10, j=0, k=0;
      while (i>j)
      {
          System.out.println("i J'den büyüktür");
          i-=2;
          j+=2;
          k++;        
      }
      System.out.println("Artik büyük degil.");
      System.out.println("döngü " +k+ "kere döndü");
    }    
}
