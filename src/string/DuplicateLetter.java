package string;

public class DuplicateLetter {
    static void main() {

        String s = "abaabcdcde";
        char target = 'a';
        int count = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == target){
                count++;
            }
        }
        System.out.println(count);
    }
}