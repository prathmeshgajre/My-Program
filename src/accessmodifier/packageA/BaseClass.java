package accessmodifier.packageA;

public class BaseClass {

    private void privateMethod(){
        System.out.println("Private method");
    }

    void defaultMethod(){
        System.out.println("Default method");
    }

    protected void protectedMethod(){
        System.out.println("Protected method");
    }

    public void publicMethod(){
        System.out.println("Public method");
    }

    public void testAccessInSameClass(){
        // All methods are accessible within the same class
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}
