package scannerornek;
import java.util.Scanner;

public class ScannerOrnek 
{   
    public static void main(String[] args) {
       
        String dizi[]=new String[3];
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1)+ ".ismi Giriniz:");
            dizi[i]=s.nextLine();//girilen isimler diziye aktarıldı.
        }
        yazdir(dizi);
    }
    static void yazdir(String dizi[]){
        System.out.println("İsimler:");
        for (String i:dizi) {
            System.out.println(i);
        }
    }    
}
