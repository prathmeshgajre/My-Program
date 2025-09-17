package accessmodifier.packageB;

import accessmodifier.packageA.Parent;

public class Child extends Parent {
    public void accessViaInheritance(){
        protectedMethod();
    }

    public void accessViaObject(){
        Parent parent = new Parent();

    }
}
