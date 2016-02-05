package kalitimornek;

class A{
    int i;
    private int j;
    void setij(int x,int y){
        i=x;
        j=y;
    }
}

class B extends A{
    int total;
    void sum(){
        total=i+j;
        
    }
}
public class KalitimOrnek {

    public static void main(String[] args) {
        B subOB=new B();
        subOB.setij(10,12);
        subOB.sum();
        System.out.println("Total Value: " +subOB.total);
    }    
}
