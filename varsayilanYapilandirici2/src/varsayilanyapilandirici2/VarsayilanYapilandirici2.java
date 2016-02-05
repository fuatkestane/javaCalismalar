package varsayilanyapilandirici2;
class Araba
{
    int kapiSayisi;
    int vitesSayisi;    
    public Araba(int adet)
    {
        kapiSayisi=adet;
    }    
    public Araba(int adet, int sayi)
    {
        kapiSayisi=adet;
        vitesSayisi=sayi;
    }            
}
public class VarsayilanYapilandirici2 
{   
    public static void main(String[] args) 
    {
        Araba ar1 = new Araba(5);
        Araba ar2 = new Araba(2,5);
    }    
}
