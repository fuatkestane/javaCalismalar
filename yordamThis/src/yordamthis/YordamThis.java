package yordamthis;
class Yumurta
{
    int toplamYumurtaSayisi=0;    
    Yumurta sepeteKoy()
    {
        toplamYumurtaSayisi ++;
        return this;
    }
    
    void Goster()
    {
        System.out.println("Toplam Yumurta Sayısı:" + toplamYumurtaSayisi);
    }
}
public class YordamThis 
{    
    public static void main(String[] args) 
    {
        Yumurta y = new Yumurta();
        y.sepeteKoy().sepeteKoy().sepeteKoy().Goster();
    }    
}
