package yordamoverloading;
class muzikDosyasi
{
    String m_tur = "Müzik Dosyası";    
}
class resimDosyasi
{
    String r_tur = "Resim Dosyası";
}
class textDosyasi
{
    String t_tur = "Tex Dosyası";
}      

public class YordamOverloading 
{    
    public void dosyaAc(muzikDosyasi md)
    {
        System.out.println("Tur= " + md.m_tur);
    }
    public void dosyaAc(resimDosyasi rd)
    {
        System.out.println("Tur= " + rd.r_tur);
    }
    public void dosyaAc(textDosyasi td)
    {
        System.out.println("Tur= " + td.t_tur);
    }
    public static void main(String[] args) 
    {
       YordamOverloading mod1=new YordamOverloading();
       muzikDosyasi md=new muzikDosyasi();
       resimDosyasi rd=new resimDosyasi();
       textDosyasi td=new textDosyasi();       
       
       mod1.dosyaAc(md);
       mod1.dosyaAc(rd);
       mod1.dosyaAc(td);
    }    
}
