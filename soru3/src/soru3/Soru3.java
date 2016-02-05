package soru3;
class Gercek
{
    int tam=0;
    int kesir=0;
    public Gercek(int tamKisim,int kesirKisim)
    {
        tam=tamKisim;
        kesir=kesirKisim;     
    } 
    static int Topla(int tam,int kesir)
    {        
        return tam+kesir;
    }    
    void Gor()
    {
        Topla(tam,kesir);
        System.out.println("Kesirli Sayi:"+ tam+"."+kesir);
    }
}
public class Soru3
{
    public static void main(String[] args) 
    {
        Gercek gr=new Gercek(5,443985);
        gr.Gor();
    }    
}
