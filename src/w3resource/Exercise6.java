package w3resource;

public class Exercise6 {
    static void main() {
        String str1 = "Java Programming";
        String str2 = "java programming";

        int result = str1.compareToIgnoreCase(str2);

        System.out.println(result);

        if (result > 0){
            System.out.println(str1 +" is less than "+str2);
        } else if (result == 0) {
            System.out.println(str1 +" is equal to "+str2);
        }else {
            System.out.println(str1 + " is greater than "+ str2);
        }
    }
}
