package Fundamental.nestedClasses.localInnerClasses;

class OuterClass {
    int outerVar = 10;

    void someMethod() {
        final int localVar = 5;

        class LocalInnerClass {
            void display() {
            	// Can access outer members
                System.out.println(outerVar);  
                // Can access final/effectively final local variables
                System.out.println(localVar);  
            }
        }
    }
}

