package Fundamental.nestedClasses.staticClasses;

class OuterClass {
    static int staticVar = 10;
    int instanceVar = 20;

    static class StaticNestedClass {
        void display() {
        	// Can access static members
            System.out.println(staticVar);  
            
            // Error: cannot access non-static members directly
            // System.out.println(instanceVar);  
            
        }
    }
}

