import java.util.*;

public class ScanInputSumQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        sc.close();
        System.out.print("the sum of numbers is: ");

        System.out.println(sum);
    }
} 
