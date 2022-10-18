import java.util.*;

public class Oddeven {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        if (x%2==0) {
            System.out.println("EVEN number");
        } else {
            System.out.println("ODD number");
        }
    }
}
