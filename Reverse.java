package practice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int num = sc.nextInt();
//
        if (num > 0) {
            System.out.println(num+" is positive");
        }else {
            System.out.println(num+" is negative");

        }
    }
}
