package parametrelimetot;
public class ParametreliMetot{  
    
    public static void main(String[] args){
        kokBul(1,0,-9);
    }
    
    public static void kokBul(int a, int b, int c){
        double delta=b*b-4*a*c;
        if (delta>0) {
            double x1=((-b+Math.sqrt(delta)/2*a));
            double x2=((b-Math.sqrt(delta)/2*a));
            System.out.println("2 kök vardır: " + x1 + x2);
        }
        else if (delta==0) {
            double x1=(-b)/(2*a);
            
        }
    }
}
