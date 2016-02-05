package kalitim;

class A{
    int i,j;
    void showij(){
        System.out.println("i ve j:" +i + " " +j);
    }
}

class B extends A{
    int k;
    void showk(){
        System.out.println("k:" +k);
    }
    void sum(){
        System.out.println("i+j+k:" +(i+j+k));
    }
}
public class Kalitim {

    public static void main(String[] args) {
        A objA= new A();
        B objB=new B();
        
        objA.i=10;
        objA.j=20;
        
        System.out.println("Üst sınıf object(SuperOB) içerik");
        objA.showij();
        System.out.println();
        
        objB.i=7;
        objB.j=8;
        objB.k=9;
        System.out.println("Üst sınıf object(SuperOB) içerik");
        objB.showij();
        objB.showk();
        System.out.println();
        System.out.println("i,j ve k'nın SubOb toplamı:");
        objB.sum();
        
    }    
}
