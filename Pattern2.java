import java.util.*;
public class Pattern2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of pattern to be printed in the row");
        int row=sc.nextInt();
        System.out.println("entr the no of pattern to be pattern in te coloumn");
        int coloun =sc.nextInt();
        sc.close();

        for(int i=1; i<=row;i++ ){
            for(int j=1; j<=coloun; j++){

                if( i==1 || j==1|| i==row || j==coloun){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    } 
}
