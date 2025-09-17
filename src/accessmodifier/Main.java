package accessmodifier;

import accessmodifier.packageB.Child;
import accessmodifier.packageB.SubClass;

class Main {
    public static void main(String[] args) {

        SubClass obj = new SubClass();
        obj.testAccessInSubClass();

        Child child = new Child();
        child.accessViaInheritance();
    }

}
