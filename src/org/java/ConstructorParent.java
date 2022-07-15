package org.java;

public class ConstructorParent { // Parent
	
	public ConstructorParent (float f) { // we should give public because this class is called by child class
		this(true); // calls boolean
		System.out.println("fourth"); //2
	}
	private ConstructorParent(boolean b) { // we can give public or private
		
		System.out.println("fifth"); //1
	}
	public static void main(String[] args) {
		ConstructorParent p = new ConstructorParent(1.2f); // we can give any variable inside () related to boolean or float
	}
	}


