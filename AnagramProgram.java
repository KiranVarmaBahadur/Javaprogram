import java.util.*; 

public class AnagramProgram {

    static void Anagramprog(String sOne, String sTwo) {

        sOne = sOne.replaceAll("\\s","");
        sTwo = sOne.replaceAll("\\s","");

        int s1Len = sOne.length();
        int s2Len = sTwo.length();

        char[] chOne = sOne.toLowerCase().toCharArray();
        char[] chTwo = sTwo.toLowerCase().toCharArray();
        
        Arrays.sort(chOne);
        Arrays.sort(chTwo);     
        boolean truefalseflag = Arrays.equals(chOne,chTwo);        

        if (truefalseflag) {
          System.out.println("The two strings " +sOne+ " and " +sTwo+ " are same");
        } else {
          System.out.println("The two strings " +sOne+ " and " +sTwo+ " are different");
        }
    }

    public static void main(String[] args) {
        Anagramprog("Restful", "Fluster");
        Anagramprog("Room", "Dorm");
        Anagramprog("Dormitory", "Dirty Room");
        Anagramprog("Evil!", "Vile");
    }
}
