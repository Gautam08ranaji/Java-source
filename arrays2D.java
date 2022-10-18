import java.util.*;

// import javax.naming.NamingException;

public class arrays2D {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows =sc.nextInt();
        int col =sc.nextInt();

        int [][]Numbers= new int  [rows][col];

        // input
        // rows

        for(int i=0; i<rows;i++){
            for(int j=0; j<col;j++){
                Numbers [i][j]=sc.nextInt();
                
                
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(Numbers[i][j]+ " ");
            }
            System.out.println();
            sc.close();
        }
    }
}
