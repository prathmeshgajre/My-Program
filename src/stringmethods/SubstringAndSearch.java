package stringmethods;

public class SubstringAndSearch {
    static void main() {

        String str = "Java Programming";

        //substring()
        System.out.println(str.substring(0));       //Start with beginIndex number
        System.out.println(str.substring(0,4));               //Start with beginIndex to endIndex-1

        //indexOf() / lastIndexOf()
        System.out.println(str.indexOf('P'));       //First occurrence of char or substring
        System.out.println(str.lastIndexOf('a'));   //Last occurrence

        //startsWith() / endsWith()
        System.out.println(str.startsWith("Java"));
        System.out.println(str.endsWith("ing"));

        //contains()
        System.out.println(str.contains("Pro"));

    }
}
