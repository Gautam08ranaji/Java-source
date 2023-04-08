package practice;

public class RandomValueGenerator {
    static int min=100;
    static int max=500;
    public static void main(String[] args) {
        System.out.println();
        int a=(int)(Math.random()*(max-min+1)+min);
        System.out.println(a);
    }
}
