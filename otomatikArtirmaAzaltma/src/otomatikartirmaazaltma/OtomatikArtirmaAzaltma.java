package otomatikartirmaazaltma;
public class OtomatikArtirmaAzaltma 
{
    static void ekranaYaz(String s)
    {
        System.out.println(s);
    }   
    public static void main(String[] args) {
        int i=1;
        ekranaYaz("i:"+ i);
        ekranaYaz("++i:"+ ++i);
        ekranaYaz("i++:"+ i++);
        ekranaYaz("i:"+ i);
        ekranaYaz("--i:"+ --i);
        ekranaYaz("i--:"+ i--);
        ekranaYaz("i:"+ i);
    }    
}
