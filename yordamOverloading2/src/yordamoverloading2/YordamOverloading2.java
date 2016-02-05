package yordamoverloading2;
public class YordamOverloading2 {     
    public int toplamaYap(int a, int b)
    {
        int sonuc = a + b;
        System.out.println("Sonuç - 1:" + sonuc);
        return sonuc;
    }
    
    public void toplamaYap(int a, double b)
    {
        double sonuc = a + b;
        System.out.println("Sonu. - 2:" + sonuc);
    }
    
    public double toplamaYap(double a, double b)
    {
        double sonuc = a + b;
        System.out.println("Sonu. - 3:" + sonuc);
        return sonuc;
    }
    public static void main(String[] args) 
    {
        YordamOverloading2 mod2 = new YordamOverloading2();
        mod2.toplamaYap(3, 5);
        mod2.toplamaYap(3, 5.5);
        mod2.toplamaYap(2.5, 5.5);
    }    
}
