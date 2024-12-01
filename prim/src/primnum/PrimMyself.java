package primnum;
public class PrimMyself {
    public static void main(String[] args) {
        int count=0;
        int useNum=2;
        while (count<50) {
            double useRes=Math.sqrt(useNum);
            boolean x=true;
            for (int co=(int)useRes;co>1;co--){
                if (useNum%co==0){
                        x=false;
                    }
                }
            if(x==true) {
                System.out.print(useNum+" \t ");
                count++;
                if(count%10==0){
                    System.out.println();}
                }
            useNum++;}
    }
}
