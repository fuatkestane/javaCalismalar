package diziler;
public class Diziler 
{
    public static void main(String[] args) 
    {
        //Tek boyutlu diziler
        int month_days[];
        month_days = new int[12];
        
        month_days[0]=31;
        month_days[1]=28;
        month_days[2]=30;
        month_days[3]=31;
        month_days[4]=30;
        month_days[5]=31;
        month_days[6]=30;
        month_days[7]=31;
        month_days[8]=30;
        month_days[9]=31;
        month_days[10]=30;
        month_days[11]=31;
        
        System.out.println("April has " + month_days[3] + " days.");
        
        //Çift boyutlu diziler
        int twoD[][]=new int[4][5];
        int k=0;
        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                twoD[i][j]=k;
                k++;
            }
        }        
        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                System.out.println(twoD[i][j]+ " ");
                System.out.println();
            }
        }        
    }    
}
