package soru4;
class Araba
{
    int i=0;
    Araba(int y)
    {
        this.i=y;
        System.out.println("Araba Nesnesi oluşturuluyor."+i);
    }
    
    public void Finalize()
    {
        System.out.println("Yok Oluyor.."+i);
    }
}
public class Soru4 
{
    public static void main(String[] args) 
    {
       /*Garbage Collection: 
        Çöp toplayıcısının amacı, programda kullanılmayan nesneleri silmektir.
        Silinmeyen nesneler referanslı olanlardır. yani kendi başına birşey değil, biryere bağlı olan ve kullanılan nesnedir. 
        Bir nesne bir veya daha sayıdaki referansa bağlı olabilir.
       */        
        Araba ar = new Araba(1);
        new Araba(2);
        System.gc(); 
        
    }    
}
