import java.util.*;

public class arrays2Dex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();

        int Numbers[][]=new int[rows][col];

        // input
        // rows
        for(int i=0; i<rows;i++){
            // coloumn
            for(int j=0;j<col;j++){
                Numbers[i][j]=sc.nextInt();

            }
        }
        //  for output
        int x=sc.nextInt();
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){

                // for compare with x

                if(Numbers[i][j]==x){
                        System.out.println("the address of x is (" +i+ " ," +j+" )" );
                        sc.close();
                }
            }
        }


    }
    
}

