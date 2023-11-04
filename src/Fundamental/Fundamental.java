package Fundamental;

import java.util.Arrays;
import java.util.List;

/**
 * This is commenting using javadoc format.
 * 
 * This code discuss about the Fundamental Programming Structure in Java
 * 
 * @author Ambasa Teferra
 * @version 1.0
 * @since 10/27/2023
 * 
 */
public class Fundamental {

	// This is commenting out a line

	/*
	 * This is commenting out a block of line
	 */

	/**
	 * Fundamental Programming Structure - Data Types - Primitive Types
	 */

	// Integral Types
	static byte a = 5;
	static short b = 6;
	static int c = 10;
	static long d = 15;

	// Floating-point Types
	static double e = 14.5;
	static float f = 10.5f;

	// Unicode character represention
	static char g = 'A';

	static boolean h = true;

	public static void main(String[] args) {

		int age = 0;
		int day = 3;

		if (age > 18) {
			System.out.println("Adult");
		}

		if (age > 18) {
			System.out.println("Adult");
		} else {
			System.out.println("Minor");
		}

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		// ... other cases ...
		default:
			System.out.println("Invalid day");
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		do {
			System.out.println(i);
			i++;
		} while (i < 5);

		int score = 85;

		if (score >= 90) {
			System.out.println("Grade: A");
		} else if (score >= 80) {
			System.out.println("Grade: B");
		} else if (score >= 70) {
			System.out.println("Grade: C");
		} else if (score >= 60) {
			System.out.println("Grade: D");
		} else {
			System.out.println("Grade: F");
		}

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int num : numbers) {
			if (num == 5) {
				System.out.println("Number 5 found!");
				break; // This will exit the loop as soon as number 5 is found
			}
		}

		for (int j = 0;;) {
			// Infinite loop, as there's no condition to end it
			if (j > 10)
				break; // Some condition to break the loop
			j++;
		}
		for (int k = 0; k < 5;) {
			System.out.println(k);
			k++; // Incrementing inside the loop body
		}
		for (int l = 0, j = 10; l < 5; l++, j -= 2) {
			System.out.println("l: " + l + ", j: " + j);
		}
		for (int m = 0; m < 3; m++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i: " + i + ", j: " + j);
			}
		}

		int[] arr = { 3, 1, 4, 1, 5, 9 };
		Arrays.sort(arr);
		// The array arr now contains {1, 1, 3, 4, 5, 9}
		int[] ages = new int[5];
		Arrays.fill(arr, 42);
		// The array arr now contains {42, 42, 42, 42, 42}
		int[] original = { 1, 2, 3, 4, 5 };
		int[] copy = Arrays.copyOf(original, 3);
		// copy now contains {1, 2, 3}
		Integer[] values = { 1, 2, 3 };
		List<Integer> numberList = Arrays.asList(values);
		int[][] deepArr1 = { { 1, 2 }, { 3, 4 } };
		int[][] deepArr2 = { { 1, 2 }, { 3, 4 } };
		boolean areDeeplyEqual = Arrays.deepEquals(deepArr1, deepArr2);
		// areDeeplyEqual will be true
		int[] heights = {10, 20, 30, 40, 50};
		int len = heights.length;  // len will be 5
		
		  
//		class Car {
//		    String color;
//		    
//		    void drive() {
//		        System.out.println("Car is driving!");
//		    }
//		}
//
//		Car myCar = new Car();
//		myCar.color = "Red";
//		myCar.drive();
		
		class Car {
		    String color;

		    // Constructor
		    Car(String c) {
		        color = c;
		    }
		}

		Car myCar = new Car("Red");
		


		class PublicExample {
		    protected int myVar;
		}
		
		class Parent {
		    protected int myVar;
		}

		class Child extends Parent {
		    void showVar() {
		        System.out.println(myVar);  
		        // Can access 'myVar' because it's protected
		    }
		}
		
		class DefaultExample {
		    int myVar;  // No modifier, so it's default
		}

		class Vehicle {
		    int speed;
		}

		class Car extends Vehicle {
		    int wheels = 4;
		}
		
		class Animal {
		    void sound() {
		        System.out.println("Animal makes a sound");
		    }
		}

		class Dog extends Animal {
		    // Overriding the sound method
		    void sound() {
		        System.out.println("Dog barks");
		    }
		}

		Animal myDog = new Dog();
		myDog.sound(); // Outputs: Dog barks
		
		abstract class Shape {
		    abstract void draw();
		}

		class Circle extends Shape {
		    void draw() {
		        System.out.println("Drawing a circle");
		    }
		}

		System.out.println("Integral Types");
		System.out.println("Byte " + a);
		System.out.println("Short " + b);
		System.out.println("Int " + c);
		System.out.println("long " + d);

		System.out.println("Floating-point Types");
		System.out.println("double " + e);
		System.out.println("float " + f);

		System.out.println("Unicode character represention");
		System.out.println("char " + g);

		System.out.println("Boolean Type");
		System.out.println("Boolean " + h);

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		String str5 = str4;

		System.out.println("Str1 == str2 -> " + str1 == str2);
		System.out.println("Str2 == str3 -> " + str2 == str3);
		System.out.println("Str3 == str4 -> " + str3 == str4);
		System.out.println("Str4 == str5 -> " + str4 == str5);

	}

	public class MyClass {
		// Static variable
		static int allTimeCount = 0;

		// Instance variable
		int count;

		public void doSomething() {
			// Local variable
			int localVariable = 10;
		}
	}

}
