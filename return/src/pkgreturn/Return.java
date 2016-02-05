package pkgreturn;
public class Return 
{
    public static void main(String[] args) 
    {
        
    }    
    public double toplamaYap(double a, double b)
    {
        double sonuc = a + b;
        return sonuc;
    }    
    public void birSeyYapma(double a)
    {
        if (a==0) 
        {
            return;
        }
        else
        {
            System.out.println("--> " + a);
        }
    }
}
