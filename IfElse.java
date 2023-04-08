package practice;

public class IfElse {

    public static void main(String[] args) {
        int  Salary = 5400;
        if(Salary > 30000){
            Salary += 2000;
        }else if(Salary >20000){
            Salary += 33000;
        }else {
            Salary -= 10000;
        }
        System.out.println(Salary);
    }
}
