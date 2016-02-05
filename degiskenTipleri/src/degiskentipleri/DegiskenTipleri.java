package degiskentipleri;
public class DegiskenTipleri 
{
    public static void main(String[] args)
    {
        byte enbuyukByte= Byte.MAX_VALUE;
        short enbuyukShort = Short.MAX_VALUE;
        int enbuyukInt= Integer.MAX_VALUE;
        long enbuyukLong = Long.MAX_VALUE;
        
        EkranaBas("EnbuyukByte ->" + enbuyukByte);
        EkranaBas("EnbuyukShort ->"+ enbuyukShort);
        EkranaBas("EnbuyukInt ->" + enbuyukInt);
        EkranaBas("EnbuyukLong ->" + enbuyukLong);
        
        float enbuyukFloat =Float.MAX_VALUE;
        double enbuyukDouble = Double.MAX_VALUE;
        EkranaBas("enbuyukFloat ->" + enbuyukFloat);
        EkranaBas("enbuyukDouble ->"+ enbuyukDouble);
        EkranaBas(  "   "  );
        char birChar ='S';
        boolean birBoolean =true;
        
        EkranaBas("birChar ->" + birChar);
        EkranaBas("birBoolean - >"+ birBoolean);
    }
    public static void EkranaBas(String deger)
    {
        System.out.println(deger);        
    }    
}
