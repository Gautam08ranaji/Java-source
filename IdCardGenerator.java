import java.util.Scanner;

public class IdCardGenerator {
    public static void main(String[] args) {

//      DECLARING VARIABLES
        String Name,BG;
        int Age;

//        TAKING SCANNER
        Scanner sc = new Scanner(System.in);

//        TAKING NAME AS INPUT
        System.out.println("ENTER YOUR NAME");
        Name = sc.nextLine();

//        TAKING AGE AS INPUT
        System.out.println(" Enter your Age ");
        Age =sc.nextInt();

//        TAKING BLOOD GROUP AS INPUT
        System.out.println(" Enter your blood group ");
        BG =sc.next();

        System.out.println("------------------------------------------");
        System.out.println(" Name "+Name);
        System.out.println(" AGE "+Age);
        System.out.println(" BLOOD GROUP "+BG);
        System.out.println("------------------------------------------");

//        CHECKING CONDITIONS FOR DIVIDE GROUPS

        if (Age>=20) {
            System.out.println("Your group is RED");
        } else if (Age>=15) {
            System.out.println("your group is BLUE");

        } else if (Age>=10) {
            System.out.println("your group is YELLOW");
        }
        else {
            System.out.println("age can,t be less then 10 please try again");
        }
        System.out.println("------------------------------------------");
        sc.close();


    }
}
