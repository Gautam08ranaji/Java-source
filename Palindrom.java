package practice;

public class Palindrom {
    public static void main(String[] args) {
        int n = 1654561;
        int rem=0;
        int sum = 0;
        int temp=n;

        while (n>0){
           rem= n%10;
           sum=(sum*10)+rem;
           n=n/10;
        }
        if (temp == sum) {
            System.out.println("palindrom");
        }else {
            System.out.println("not");
        }
    }
}
