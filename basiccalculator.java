import java.util.*;
public static void main(String args[]){
    while (true) { 
        System.out.println("1. Enter 1 for addition operation on the numbers.");
        System.out.println("2. Enter 2 for subtraction operation on the numbers. number 1 - number 2");
        System.out.println("3. Enter 3 for multiplication operation on the numbers.");
        System.out.println("4. Enter 4 for division function operation on the numbers.number 1 divided by number 2");
        System.out.println("5. Enter 5 for exit");
        System.out.println("Enter your choice\t:-");
        
    
    
    
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
    
        if (choice==5){
            System.out.println("the program ended");
            break;
        }
        System.out.println("Enter number 1"); 
        int num1=sc.nextInt();
        System.out.println("Enter number 2");
        int num2= sc.nextInt();

        switch (choice) {
            case 1: int sum=num1+num2;
            System.out.println("The sum of the two entered numbers is "+sum);    
            break;
            case 2: int diff= num1-num2;
            System.out.println("The difference of the two entered numbers is number 1 - number2 "+diff);
            break;
            case 3: int mul= num1*num2;
            System.out.println("THe multipication product of the two numbers is "+mul);
            break;
            case 4: int div=num1/num2;
            int remain=num1%num2;
            System.out.println("THe quotient of the two numbers division is "+div+"and the remainder of the the two numbers division product is"+remain);
            break;
            case 5:
            break;
            default:
            System.out.println("ENter a valid choice");
        }
        sc.close();
    }

}


