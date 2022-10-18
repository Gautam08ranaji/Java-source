import java.util.*;

public class NumPat1{
    public static void main(String[]args){
        System.out.println("ENTER THE VALUE");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
//OUTER LOOP 
        for(int i=n; i>=1; i--){
//INNER LOOP
            for(int j=1;j<=i;j++){
            System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}