import java.util.*;
// to print numbers from n to 1 n is taken as user input
public class recursion1{
    public static void PrintNumber(int n){
        if(n==0){
            return;
        
        }
        System.out.println(n);
        PrintNumber(n-1);       
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        PrintNumber(n);

    }
}
