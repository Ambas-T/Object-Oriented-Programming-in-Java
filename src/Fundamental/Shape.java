package Fundamental;

abstract class Shape {
    int x, y;

    abstract void draw();  // abstract method
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

