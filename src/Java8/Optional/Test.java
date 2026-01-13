package Java8.Optional;

import java.util.Optional;


public class Test {
    public static void main(String[] args) {

        Optional<String> name = getName(2);
        if (name.isPresent()) {
            System.out.println(name.get());
        }
        name.ifPresent( System.out::println);

    }

    private static Optional<String> getName(int id){
        String name = null;
        return Optional.ofNullable(name);
    }
}
