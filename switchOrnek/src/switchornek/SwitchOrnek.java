package switchornek;
public class SwitchOrnek 
{
    public static void main(String[] args) 
    {    
        byte x=10;
        switch(x)
        {
            case 10: System.out.println("Sayımız 10'dur");
            case 20: System.out.println("Sayımız 20'dir");
                break;
            case 30: System.out.println("Sayımız 30'dur");
                break;
            default: System.out.println("Geçersiz");
        }
    }    
}
