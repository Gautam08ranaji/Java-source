// THIS CODE IS WRIITEN BY GAUTAM RANA

import java.util.*;

public class Calculator {
    public static void main(String args[]){

        // VARIABLES DECLARATION
        double a,b,result;
        
        // scanner
        Scanner sc =new Scanner(System.in);

        // taking first input
        System.out.println("enter the first value ");
        a=sc.nextInt();

        // taking operators
        System.out.println("enter any operator from : + , - , * , / , %  ");
        char operator = sc.next().charAt(0);
        
        // taking second input
        System.out.println("enter the second value ");
        b=sc.nextInt();
        sc.close();


        //for  compare operations

        switch (operator){
            // ADDITION
            case '+': result = a+b;
            break;

            // SUBTRACTION
            case '-': result = a-b;
            break;

            // MULTIPLICATION
            case '*': result = a*b;
            break;

            // DIVISION
            case '/': result = a/b;
            break;

            // REMAINDER
            case '%': result = a%b;
            break;

            // INCORRECT INPUT
            default: System.out.println("INVALID OPERATOR");
            return;

        }

        // takiung values for print

        System.out.printf(" %.2f %c %.2f = %.2f",a,operator,b,result);
        
    }
}

// THANKS FOR READ 
// GAUTAM RANA
// 3/10/22
