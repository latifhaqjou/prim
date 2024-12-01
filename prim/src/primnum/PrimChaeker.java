package primnum;

import java.util.Scanner;

public class PrimChaeker 
{
    public static void main(String[] args)
     {
        Scanner s=new Scanner(System.in);
        boolean x=false;
        System.out.print("enter a number for declearing prime or non prim :");
        int useNum=s.nextInt();
        double useRes=Math.sqrt(useNum);
        for (int conter=(int)useRes;conter>1;conter--)
        {
            if (useNum%conter==0)
            {
                    System.out.println("non prim number");
                    x=true;
                    break;
            }
        }
        if(x==false) {
            System.out.println("prim number");
        }
    }
}
