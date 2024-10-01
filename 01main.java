import java.util.*;


public class 01main {
    public static void main(String[]args){

        System.out.print("my first day with java");
        System.out.print("today i am learning about output in java");
        System.out.println("today i am learning about java ");
        System.out.println("i am also thinking about learning dsa in java");
        System.out.print("i fount java a littl etougher than python as it's showing a lot of error in my commands\nmay be due to the fact that i am more familiar in python than java as java has more complex syntax");

        //variables
        String name="nikolas tesla";//string variable
        int a=8;//a way of giving integer variable
        double decimal=25.54;//a decimal variable
       // there are two type of variable in java
       //primitive:-byte,short,char,boolean,int,long,float,double{these primitive ones are the one that ar ethe once  to be remembered}
       //non primitive:-string array class object interface{these non primitive are the one that can be made by the programer also }
       int b=25;
       int sum=a+b;
       int difference=a-b;
       int multiply=a*b;
    
       System.out.println(a);
       System.out.println(b);
       System.out.println(sum);
       System.out.println(difference);
       System.out.println(multiply);
       System.out.println(name);
       
       //taking the input of just a word
       Scanner sc =new Scanner(System.in);
       String naam =sc.next();//this will only take one word as input tah means if you want to take input as like "albert einestein" it will only take albert and forget the einestein

       System.out.println(naam);

       Scanner st = new Scanner(System.in);
       String name1=sc.nextLine();//this willtake input as whole line
       //nextInt() it is used for taking integers as an input
       //nextFloat is used to take decimal type as input 
       System.out.println(name1);

       System.out.println();

           }
}

    

