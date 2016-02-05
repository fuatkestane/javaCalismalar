package parametre;

class Insan{
    public Insan(int par){
        System.out.println("İnsan Yapılandırıcısı: "+par);
    }
}

class ZekiInsan extends Insan{
    public ZekiInsan(int par){
        super(par+1);
        System.out.println("ZekiInsan Yaplandırıcısı: "+par);
    }
}

class Hacker extends ZekiInsan{
    public Hacker(int par){
        super(par+1);
        System.out.println("Hacker Yapılandırıcısı: "+par);
    }
}
public class Parametre {

    public static void main(String[] args) {
       Hacker hck=new Hacker(5);
       
    }    
}
