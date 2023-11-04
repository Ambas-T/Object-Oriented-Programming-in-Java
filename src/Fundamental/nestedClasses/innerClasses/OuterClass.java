package Fundamental.nestedClasses.innerClasses;

class OuterClass {
    int outerVar = 10;

    class InnerClass {
        void display() {
        	// Can access members of the outer class
            System.out.println(outerVar);  
        }
    }
}

