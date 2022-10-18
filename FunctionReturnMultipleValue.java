import java.util.*;

public class FunctionReturnMultipleValue {
    public static int multipleOfTwoNumbers(int a,int b){
        int sum = a*b;
        return sum;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        sc.close();

        int sum = multipleOfTwoNumbers(a,b);
        System.out.println("the product of two numbers are = "+sum);

    }
}
