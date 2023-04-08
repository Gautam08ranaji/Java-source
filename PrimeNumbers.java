package practice;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to check the prime number");
        int num = sc.nextInt();
        int m = num / 2;
        int flag = 0;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (num % i == 0) {
                    flag = 1;
                }
            }
            if (flag>0){
                    System.out.println(num+" is not prime number");
                }else{
                    System.out.println(num+" is a prime");
                }


        }
    }
}

