package inheritance.singleinheritance;

class Writer{
    void write(){
        System.out.println("Writer writes content.");
    }
}

class Author extends Writer{
    void publish(){
        System.out.println("Author publishes books.");
    }
}
public class SingleInheritance10 {
    public static void main(String[] args) {
        Author author = new Author();
        author.write();
        author.publish();
    }
}
