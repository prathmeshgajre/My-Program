package accessmodifier.packageB;

import accessmodifier.packageA.BaseClass;

public class SubClass extends BaseClass {
    public void testAccessInSubClass(){

        protectedMethod();
        publicMethod();
    }
}
