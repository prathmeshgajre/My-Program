package stringmethods;

public class ComparisonMethods {
    static void main() {

        String s1 = "Camper";
        String s2 = "camper";
        String s4 = new String("Camper");
        String s5 = new String("Camper");

        //s4 and s5 both different object in memory.
        System.out.println(s4.equals(s5));      //Compare content.
        System.out.println(s4 == s5);           //Compare references and both are different objects.

        //Here s2 is literal and s4 is new object in heap.
        System.out.println(s1.equals(s4));      //Compare content
        System.out.println(s1 == s4);           //Compares reference

        //Using equals() - case-sensitive
        System.out.println(s1.equals(s2));

        //Using equalsIgnoreCase() - case-insensitive
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
