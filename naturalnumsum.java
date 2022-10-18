import java.util.*;

public class naturalnumsum {
    public static void main(String[]args){
        //TAKING INPUT BY SCANNER
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //SOUT FOR PRINT NEXT LINE BEFORE NATURAL NUMBERS
        System.out.println("");
        sc.close();
        
        //USING LOOP FOR GIVING CONDITONS FOR SUM OF NATURAL NUMBERS
        int sum = 0;
        for(int i=0; i<=n ; i++){
            System.out.println(i);
            sum = sum+i;
        }
        System.out.printf("\nThe sum of natural number of = %d"+n,sum);
    }
}
