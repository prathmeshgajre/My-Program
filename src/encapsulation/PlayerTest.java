package encapsulation;

public class PlayerTest {
    static void main() {
        Player pl = new Player("Sachin",21,"Cricket");
        String plName = pl.getPName();
        int plAge = pl.getPAge();
        String plGameType = pl.getGameType();

        System.out.println(plName);
        System.out.println(plAge);
        System.out.println(plGameType);
    }
}
