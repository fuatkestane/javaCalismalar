package thisanahtar;
class tarihHesaplama
{
    int gun,ay,yil;    
    public void gunEkle(int gun)
    {
        this.gun += gun;
    }    
    public void ekranaYaz()
    {
        System.out.println("Gün: " + gun);
    }
}
public class ThisAnahtar 
{
    public static void main(String[] args) 
    {
        tarihHesaplama th = new tarihHesaplama();
        th.gunEkle(2);
        th.gunEkle(3);
        th.ekranaYaz();
    }    
}
