import java.util.*;

public class IfElsecondition {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        
        if (age>=18) {
            System.out.println("you are adult");
        } else {
            System.out.println("not adult");
        }

        
    }
}
