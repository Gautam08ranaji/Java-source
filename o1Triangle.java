
import java.util.*;

public class o1Triangle{
    public static void main(String[]args){
        System.out.println("ENTER THE VALUE");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    
//OUTER LOOP 
        for(int i=1; i<=n; i++){
//INNER LOOP
            for(int j=1;j<=i;j++){

                //sum of i+j

                if((i+j)%2==0){ //even value
                    System.out.print("1 ");
                }else{//odd value
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}