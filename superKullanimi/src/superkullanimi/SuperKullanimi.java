package superkullanimi;

class A{
    int i;
    void show(int deger){
        i=deger;
        System.out.println(i);
    }
   
}

class B extends A{
    int i;
    B(int a, int b)
    {
        super.i=a;
        i=b;
    }
    void show(){
        System.out.println("SuperClass içindeji i:" +super.i);
        System.out.println("SubClass içindeki i:" +i);
    }
}

public class SuperKullanimi {

    public static void main(String[] args) {
     B subOb=new B(1, 2);
     subOb.show();
     
     A a=new A();
     a.show(65);
    }    
}
