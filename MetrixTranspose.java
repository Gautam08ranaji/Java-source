// THIS CODE IS WRIITEN BY GAUTAM RANA

import java.util.*;
 
public class MetrixTranspose {
   public static void main(String args[]) {

    // SCANNER
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
 
    //   MATRIX 
      int matrix[][] = new int[n][m];
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }



      
      System.out.println("The transpose is : ");
    
      // TO PRINT MATRIX IN TRANSPOSE
      for(int j=0; j<m ;j++) {

        // LOOP FOR APPLYING CONDITIONS
          for(int i=0; i<n; i++) {
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();

        //   SCANNER CLOSE
          sc.close();
      }
   }
}
