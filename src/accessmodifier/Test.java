package accessmodifier;

public class Test {
    Test(){
        System.out.println("Constructor is private.");
    }
    private void msg(){
        System.out.println("Method is private");
    }
    private int data = 30;
    private class Test1{
        Test1(){
            System.out.println("Inner class constructor");
        }
        void add(){
            System.out.println("Inner class method");
        }


    }
    protected void m1(){
        System.out.println("Method is protected");
    }
}
