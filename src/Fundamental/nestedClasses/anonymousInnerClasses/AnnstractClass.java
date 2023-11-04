package Fundamental.nestedClasses.anonymousInnerClasses;

abstract class AbstractClass {
    abstract void display();
}

class SomeClass {
    void someMethod() {
        AbstractClass obj = new AbstractClass() {
            void display() {
                System.out.println("Anonymous inner class implementation");
            }
        };
        obj.display();
    }
}
