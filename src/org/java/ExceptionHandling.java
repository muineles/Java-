package org.java;

public class ExceptionHandling {

public static void main(String[] args) {
 String s = "Java";
 
 // if first try is not error the inner catch , finally will be executed and then it will go to outer catch , finally
 try {
	 System.out.println(10);
	 try {
		 System.out.println(s.charAt(2));
	 }catch (Exception e) {
		 System.out.println(e);
	} finally {
		System.out.println("Inner Block");
	}
	 
	 }catch (Exception e) {
		 System.out.println(e);
	}finally {
		System.out.println("Outer Block");
	}
	
}

}
