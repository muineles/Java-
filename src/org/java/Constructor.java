package org.java;

public class Constructor extends ConstructorParent { // child
	//declare the constructor after class
	private Constructor() { // we can give public or private
		// declare the this() next to constructor
		this(5); // calls int we can give any numb in ()
System.out.println("first"); //5
	}
	private Constructor (int a) {  // we can give public or private
		this(""); // calls string we can give anything within "" 
		System.out.println("second");	//4
	}
	private Constructor(String a) {  // we can give public or private
		super(2.3f); // calls parent class float
		System.out.println("third"); //3	
	}
public static void main(String[] args) {
	Constructor c = new Constructor();//  we can give any variable inside () related to empty or int or string 	
	// reverse execution
}
}
