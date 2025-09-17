package inheritance.multilevelinheritance;

class Book{
    void read(){
        System.out.println("Reading a book.");
    }
}

class TextBook extends Book{
    void study(){
        System.out.println("Studying a textbook.");
    }
}

class MathTextBook extends TextBook{
    void solveProblems(){
        System.out.println("Solving math problems.");
    }
}

public class MultilevelInheritance9 {
    public static void main(String[] args) {
        MathTextBook mathTextBook = new MathTextBook();
        mathTextBook.read();
        mathTextBook.study();
        mathTextBook.solveProblems();
    }
}
