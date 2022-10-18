
import java.util.*;

public class Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String name =sc.nextLine();
        // System.out.println("your name is "+name);
        
        // CONCATENATION
        String firstName = sc.next();
        String lastName = sc.next();
        String fullName = firstName + " " + lastName; // <--- firstName + lastName = CONCATENATION
        System.out.println(fullName);
        
        // count LENGTH ---> .length()
        
        System.out.println(fullName.length());
        
        // charAt
        
        for(int i=0; i<=fullName.length(); i++){
            System.out.println(fullName.charAt(i));
            sc.close();
        }
    }
}
