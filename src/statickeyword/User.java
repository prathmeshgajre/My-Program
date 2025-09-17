package statickeyword;

public class User {

    static int userCount;

    User(){

        System.out.println(userCount++);
    }

    static void main() {
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();
        User u4 = new User();
        User u5 = new User();

    }
}
