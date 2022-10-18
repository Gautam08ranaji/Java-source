import java.util.*;

public class Ifelseq3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a==b) {
            System.out.println("a is equals to b");
        }
        else if (a>b)
        {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("a is less than b");
        }
    } 
}