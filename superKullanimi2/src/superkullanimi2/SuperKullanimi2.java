package superkullanimi2;
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
    
    Kutu(){
        gnslk=-1;
        yksklk=-1;
        drnlk=-1;
    }         
    
    Kutu(double len){
        gnslk=yksklk=drnlk=len;
    }
    double hacim(){
        return gnslk*yksklk*drnlk;
    }    
}
class KutuAgirlik extends Kutu{
    double agirlik;
    KutuAgirlik(KutuAgirlik ob){
        super(ob);
        agirlik=ob.agirlik;
    }
    KutuAgirlik(double w,double h,double d,double m){
        super(w,h,d);//üst sınıfın özelliklerini çağırdık.
        agirlik=m;
    }
    KutuAgirlik() { //varsayılan yapılandırıcı
        super();
        agirlik=-1;        
    }

    KutuAgirlik(double len,double m) {
        super(len);
        agirlik=m;
    }    
}
class Shipment extends KutuAgirlik{
    double cost;
    Shipment(Shipment ob){
        super(ob);
        cost=ob.cost;
    }
    Shipment(double w,double h, double d, double m, double c){
        super(w,h,d,m);
        cost=c;
    }

    Shipment() {
        super();
        cost=-1;
    }
    Shipment(double len,double m,double c){
        super(len,m);
        cost=c;
    }
    
}
public class SuperKullanimi2 {
    
    public static void main(String[] args) {
        Shipment ship1=new Shipment(10,20,15,10,3.4);
        Shipment ship2=new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        
        vol=ship1.hacim();
        System.out.println("ship1'in hacmi:" +vol);
        System.out.println("ship1'in ağırlığı:"+ship1.agirlik);
        System.out.println("ship1'in maliyeti:"+ship1.cost);
        
        vol=ship2.hacim();
        System.out.println("ship2'in hacmi:" +vol);
        System.out.println("ship2'in ağırlığı:"+ship2.agirlik);
        System.out.println("ship2'in maliyeti:"+ship2.cost);
    }    
}
