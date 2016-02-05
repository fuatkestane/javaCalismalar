package switchcasebreakkullanimi;
public class SwitchCaseBreakKullanimi 
{  
    public static void main(String[] args) 
    {
        //Etiketsiz Break Kullanımı
        for (int i = 0; i < 100; i++) 
        {
            if (i==9) 
            {
                break;
            }
            System.out.println("i= " +i);
        }   
        System.out.println("Döngüden Çıktı");
        
        //Etiketli Break Kullanımı
        kiril:
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 100; j++) 
            {
                if (j==9) 
                {
                    break kiril;
                }
                System.out.println("j= " +j);
            }
        System.out.println("Döngüden Çıktı");
        System.out.println("i= " +i);
        }       
    }    
}
