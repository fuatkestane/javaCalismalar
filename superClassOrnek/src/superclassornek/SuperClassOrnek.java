package superclassornek;

class Kutu{
    double gnslk;
    double yksklk;
    double drnlk;
    
    Kutu(Kutu ob){
        gnslk=ob.gnslk;
        yksklk=ob.yksklk;
        drnlk=ob.drnlk;
    }
    
    Kutu(double w,double h, double d){
        gnslk=w;
        yksklk=h;
        drnlk=d;
    }   
    double hacim(){
        return gnslk*yksklk*drnlk;
    }    
}
class KutuAgirlik extends Kutu
{
    double agirlik;
    KutuAgirlik(KutuAgirlik ob)
    {
        super(ob);
        agirlik=ob.agirlik;
    }
    KutuAgirlik(double w,double h,double d,double m)
    {
        super(w,h,d);//üst sınıfın özelliklerini çağırdık.
        agirlik=m;
    }
       
}
public class SuperClassOrnek 
{   
    public static void main(String[] args) 
    {
        KutuAgirlik kutu = new KutuAgirlik(10,20,15,34.3);       
        
        double vol;        
        vol=kutu.hacim();
        System.out.println("mybox1'in hacmi:" +vol);
        System.out.println("mybox1'in ağırlığı:" +kutu.agirlik);             
    }
}
