package asalsayi;
import java.util.Scanner;

public class AsalSayi 
{
    public static void main(String[] args) 
    {
        int sayi,adet = 0; 
        Scanner input=new Scanner(System.in);
        
        System.out.println("Bir Sayı Giriniz:");
        sayi=input.nextInt();
        
        for (int i = 2; i <= sayi; i++) 
        {
            if (sayi%i==0) 
            {
                adet++;
            }
        }
        if (adet==1) 
        {
            System.out.println("Sayı Asaldır.");
        }
        else
        {
            System.out.println("Sayı Asal Değildir.");
        }         
    }    
}
