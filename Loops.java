package practice;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int count = 0,i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
//        for (int i = 1; i <=n ; i +=2) {
//
//            count++;
//            System.out.println(i);
//        }
//        System.out.println(count);
//        while (i<=n){
//            System.out.println(i);
//            count++;
//            i += 2;
//
//
//        }
//        System.out.println(count);
        do {
            count++;
            System.out.println(i);
            i += 2;
        }while (i<n);
        System.out.println(count);
    }
}
