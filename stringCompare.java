public class stringCompare {
    public static void main(String argd[]) {
        
        String name1= "tony";
        String name2= "tony";

        
        
        // FOR COMPARING TWO STRINGS -->  [ string1--compareTo(strin2) ]
        
        // s1 > s2 : +ve value
        // s2 > s1 :+ve value
        // s1 = s2 : 0

        
        if (name1.compareTo(name2)==0) {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("not equal");
        }
    }
    
}
