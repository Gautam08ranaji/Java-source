public class subStrings {
    public static void main(String args[]){

        String sentence = " My name is Gautam Rana ";

        // to print Rana from sentence
        // substring(beggining index, end index);

        String name = sentence.substring(19,sentence.length());
        System.out.println(name);
    }
}
