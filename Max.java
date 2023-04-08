package practice;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a,b,c;
        System.out.println("enter the  numbers");
         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();

         int max = Math.max(c,Math.max(a,b));
//         if (b>max){
//             max = b;
//         }  if (c >max) {
//             max = c;
//         }
        System.out.println(max);
    }
}
