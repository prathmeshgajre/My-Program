package inheritance.hierarchicalinheritance;

class Game{
    void play(){
        System.out.println("Playing game.");
    }
}

class Cricket extends Game{
    void bat(){
        System.out.println("Playing cricket.");
    }
}

class FootBall extends Game{
    void kick(){
        System.out.println("Playing football.");
    }
}

public class HierarchicalInheritance10 {
    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.play();
        cricket.bat();

        FootBall footBall = new FootBall();
        footBall.play();
        footBall.kick();
    }
}
