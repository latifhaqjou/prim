package primnum;

public class PrimNumberTeacher {
    public static void main(String[] args) {
        int count=0;
        int number=2;
        while (count<50) {
            boolean isPrim=true;
            for(int i=2;i*i<=number;i++){
                if(number%i==0){
                isPrim=false;
                break;}
            }
          
        if(isPrim){
            System.out.print(number+ "\t");
            count++;
            if(count%10==0){
                System.out.println();
            }
        }
        number++;
    }

}}
