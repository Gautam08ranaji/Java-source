import java.util.*;

public class factorialfunction {
    public static void FactorialNum(int n){


        // for negative values
        if (n<0) {
            System.out.println("invalid value");
            return;
        }
        int  factorial = 1;
        for(int i=n;i>=1;i--){
            
            factorial = factorial * i;

        }
        System.out.println(factorial);
        return;
    }
    
    public static void main(String args[]){
        System.out.println("enter the value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        FactorialNum(n);
    }

}
