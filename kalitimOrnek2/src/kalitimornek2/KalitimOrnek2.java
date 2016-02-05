package kalitimornek2;

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
    KutuAgirlik(double w,double h, double d, double m){
        gnslk=w;
        yksklk=h;
        drnlk=d;
        agirlik=m;        
    }
}
public class KalitimOrnek2 {

    public static void main(String[] args) {
        /*
        KutuAgirlik mybox1=new KutuAgirlik(10, 20, 15, 34.3);
        KutuAgirlik mybox2=new KutuAgirlik(2, 3, 4, 0.076);
        double vol;
        
        vol=mybox1.hacim();
        System.out.println("mybox1'in Hacmi: " +vol);
        System.out.println("mybox1'in Ağırlığı: " +mybox1.agirlik);
        
        vol=mybox2.hacim();
        System.out.println("mybox2'nin Hacmi: " +vol);
        System.out.println("mybox2'nin Ağırlığı: " +mybox2.agirlik);
        */
        
        KutuAgirlik kutu1 = new KutuAgirlik(3, 5, 7, 8.37);
        Kutu mybox = new Kutu();
        
        double vol;
        vol=kutu1.hacim();
        System.out.println("kutu1'in hacmi: " +vol);
        System.out.println("kutu1'in ağılığı: " +kutu1.agirlik);
        System.out.println();
        
        mybox=kutu1;
        vol=mybox.hacim();
        System.out.println("mybox'un hacmi: " +vol);
        //System.out.println("mybox'un ağırlığı: " +mybox.agirlik);
        //agirlik ozelliği alt sınıfın özelliği olduğu için alt sınıftan üst sınıf ozelliği kullanılamıyor.
    }    
}
