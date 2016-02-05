package scannerclass;
import java.util.Scanner;
public class ScannerClass {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        int giris=s.nextInt();
        long sonuc=hesapla(giris);
        System.out.print("Çarpım Değeri:"+sonuc);        
    }    
    public static long hesapla(int sayi){
        int carpim=1;
        for (int i = 1; i <= sayi; i++) {
            carpim*=i;
        }
        return carpim;
    }
}
