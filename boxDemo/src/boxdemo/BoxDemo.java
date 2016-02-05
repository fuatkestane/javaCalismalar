package boxdemo;

class Box
{
    double width;
    double height;
    double depth;
    
    public Box(double genislik,double yukseklik,double derinlik)
    {
        width=genislik;
        height=yukseklik;
        depth=derinlik;
    }
    
    double hacim(double width, double height,double depth)
    {
        System.out.println("Kutunun Hacmi"+vol);
        return width*depth*height;
    }
}
public class BoxDemo 
{
    public static void main(String[] args) 
    {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(5,9,6);
        double vol;
        
        vol=mybox1.hacim(10, 20, 15);
        vol=mybox2.hacim(5,9,6);
                
    }    
}
