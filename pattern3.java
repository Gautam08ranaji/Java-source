import java.util.*;
public class pattern3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of pattern to be printed in the row");
        int row=sc.nextInt();
        
        sc.close();

        for(int i=row; i>=1;i-- ){
            for(int j=1; j<=i; j++){

                System.out.print("*");  
            }
            System.out.println();
        }

    } 
}
