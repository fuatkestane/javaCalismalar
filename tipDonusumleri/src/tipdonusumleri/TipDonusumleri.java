package tipdonusumleri;
public class TipDonusumleri 
{
    public static void main(String[] args) 
    {
        byte b;
        int i=257;
        double d= 323.142;
        
        System.out.println("\n Conversion of int to byte.");
        b=(byte)i;
        
        System.out.println("i and b" + i+ " " +b);
        i=(int)d;
        
        System.out.println("d and i" + d +" " +i);
        System.out.println("\n Conversion of int to byte.");
        b=(byte)d;
        
        System.out.println("d and b" + d +" " +b);
    }    
}
