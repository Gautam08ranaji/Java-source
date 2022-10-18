// import java.util.*;

public class Stringbuilder {
    public static void main(String[]args){

        StringBuilder sb = new StringBuilder("ranaJi");
        System.out.println(sb);

        // char At index 0
        System.out.println(sb.charAt(0));

        // SET charAt index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        sb.setCharAt(0,'R');
        System.out.println(sb);
        
        // INSERT character at index0
        sb.insert(0, 'G');
        System.out.println(sb);

        // DELETE AT INDEX
        sb.delete(0, 1);
        System.out.println(sb);

        // APPEND = ADD AN CHAR AT THE LAST 

        StringBuilder sc= new StringBuilder("H");
        sc.append("e"); //str = str + 'e' = 'He'
        sc.append("l"); //str = str + 'l' = 'Hel'
        sc.append("l"); //str = str + 'l' = 'Hell'
        sc.append("o"); //str = str + 'o' = 'Hello'
        System.out.println(sc);

        //for length
        System.out.println(sc.length());

        // for(int i=sc.length(); i>=0; i--){
            System.out.println(sc);
            
        // }
    }
}
