package practice;
import java.util.*;
public class xyz {

        public static void main(String args[]) {
            // scanner
            Scanner sc = new Scanner (System.in);
            String str = sc.nextLine();

            //  creating a string
            String result = "";
            //  applying conditon
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == 'e') {
                    result += 'i';
                } else {
                    result += str.charAt(i);
                }
            }
            System.out.println(result);
            sc.close();
        }
    }