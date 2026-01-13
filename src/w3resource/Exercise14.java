package w3resource;

public class Exercise14 {
    static void main() {

        String str1 = "Strphen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "strphen edwin king";

        boolean rs1 = str1.equalsIgnoreCase(str2);
        boolean rs2 = str1.equalsIgnoreCase(str3);

        System.out.println(rs1);
        System.out.println(rs2);
    }
}
