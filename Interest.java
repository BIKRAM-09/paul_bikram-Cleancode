
import java.util.*;
class Interest
{
    double principal,rate,time;
    double simple_interest,compound_interest;
    void readDetails()
    {
        Scanner sc=new Scanner(System.in);
        principal=sc.nextDouble();
        rate=sc.nextDouble();
        time=sc.nextDouble();
    }
    void compute()
    {
        simple_interest=(principal*rate*time)/100;
        compound_interest=principal*Math.pow((1+rate),time);
    }
}



