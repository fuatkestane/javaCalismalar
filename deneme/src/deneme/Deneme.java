package deneme;

import java.util.ArrayList;

public class Deneme 
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ahmet");
        list.add("Ozan");
        list.add("Eda");
        list.add("Ahu");
        for (int i = 0; i < list.size(); i=i+2) 
        {
            list.remove(i);
        }

        list.stream().forEach((str) -> {
            System.out.println(str);
        });
    }
}
