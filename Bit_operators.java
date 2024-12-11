//get bit 
import java.util.*;
public class Bit_operators{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println(".(enetr the position to be shifted )");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        int operation=sc.nextInt();
        if(operation==1){
            int notbm=~bitmask;
            int newnumber=notbm&bitmask;
            System.out.println(newnumber);
        
        }elif(operation==0){
            int newnumber=bitmask|n;
            System.out.println(newnumber);
        }else{
            System.out.println("error");
        }
  
    }
}