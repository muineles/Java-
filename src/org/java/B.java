package org.java;

public class B{

	public static void main(String[] args) {

		A a = new A();
		int result = a.add(30,20);
		
		if (result==50) {
			System.out.println("Valid");
		}else {
			System.out.println("invalid");
		}
		
		
	}

}
