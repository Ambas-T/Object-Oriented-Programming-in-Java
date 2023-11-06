package Fundamental.polymorphism;

class Animal {
    void sound() {
        System.out.println("The animal makes a sound");
    }
    
   
}

class Pig extends Animal {
    void sound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("The dog says: bow wow");
    }
    
}

