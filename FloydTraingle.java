import java.util.*;

public class FloydTraingle{
    public static void main(String[]args){
        System.out.println("ENTER THE VALUE");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int number = 1;
//OUTER LOOP 
        for(int i=1; i<=n; i++){
//INNER LOOP
            for(int j=1;j<=i;j++){
            System.out.print(number+" ");
            number++;
            }
            System.out.println();
        }
    }
}