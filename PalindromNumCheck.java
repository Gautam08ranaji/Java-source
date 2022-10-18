public class PalindromNumCheck {
    public static void main(String[] args) {
        int sum=0,r,temp;
        int n=445;

        temp=n;
        while (n>0) {
            r=n%10; //getting ramainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp==sum) {
            System.out.println(sum+" number is palindrom");
            
        }else{
            System.out.println(sum+" number is not palindrom");
        }
        

        }
    }

