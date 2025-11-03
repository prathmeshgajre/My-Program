package stringmethods;

public class ModificationAndReplacement {
    static void main() {

        String str = "Java is better than python";

        //concat()
        System.out.println(str.concat(" language."));

        //replace()
        System.out.println(str.replace("better","best"));

        //replaceAll()
        System.out.println(str.replaceAll("a","*"));

        //replaceFirst
        System.out.println(str.replaceFirst("Java","JavaScript"));

        //split()
        String[] words = str.split(" ");
        for (String w : words){
            System.out.println(w);
        }
    }
}
