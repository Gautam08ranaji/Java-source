package practice;

public class Fibonacci {
    public static void main(String[] args) {
        int n=0;
        int m=1;
        int temp;
        System.out.print(n+" "+m+" ");
        for (int i = 2; i < 10; i++) {
             temp = n + m;
            System.out.print(temp+" " );
            n=m;
            m=temp;

        }


    }
}
