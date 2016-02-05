package switchornek2;
public class SwitchOrnek2 
{
    public static void main(String[] args) 
    {
        int sayi=2;
        switch(sayi)
        {
            case 1: case 3: case 5: case 7: case 9:
                System.out.println("Sayı Tektir.");
                break; //etiketli break kullanımı
            case 2: case 4: case 6: case 8:
                System.out.println("Sayı Çifttir.");
                break;
            default: 
                System.out.println("Geçersiz");
        }
    }    
}
