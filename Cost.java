
import java.util.*;
class Cost
{
    String material_Standard;
    double total_Area,total_Cost;
    
    void readDetails()
    {
        Scanner sc=new Scanner(System.in);
        material_Standard=sc.nextLine();
        total_Area=sc.nextDouble();
    }
    void compute()
    {
        if(material_Standard.equalsIgnoreCase("standard")==true)
        {
            total_Cost=1200*total_Area;
        }
        if(material_Standard.equalsIgnoreCase("above standard")==true)
        {
            total_Cost=1500*total_Area;
        }
        if(material_Standard.equalsIgnoreCase("high standard")==true)
        {
            total_Cost=1800*total_Area;
        }
        if(material_Standard.equalsIgnoreCase("high standard & fully automated")==true)
        {
            total_Cost=2500*total_Area;
        }
    }
}