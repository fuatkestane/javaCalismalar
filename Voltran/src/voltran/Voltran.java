package voltran;

class Govde{
    void BenzinTankKontrolEt(){
        
    }
}

class SolBacak{
    void MaviLazerSilahiAtesle(){
        
    }
}

class SagBacak{
    void KirmiziLazerSilahiAtesle(){
        
    }
}

class SolKol{
    void GucKaynaginiKontrolEt(){
        
    }
}

class SagKol{
    void KalkaniCalistir(){
        
    }
}

class Kafa{
    void TumBirimlereUyariGonder(){
        
    }
    
    void DusmaniTanimla(){
        
    }
}
public class Voltran {
    
    Govde gv=new Govde();
    SolBacak slb=new SolBacak();
    SagBacak sgb=new SagBacak();
    SagKol sgk = new SagKol();
    SolKol slk =new SolKol();
    Kafa kf=new Kafa();
    
    public static void main(String[] args) {
        Voltran vr=new Voltran();
        vr.kf.DusmaniTanimla();
        vr.kf.TumBirimlereUyariGonder();
        vr.sgb.KirmiziLazerSilahiAtesle();
    }    
}
