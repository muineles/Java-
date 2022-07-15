package org.java;

public class UDListSetMap { //parent

	//we can give and get any of the details of employee
	private int id;
	private String name;
	private float salary;
	private long phone;
		
	public int getId() {
		return id;
	}
	
	//generate constructor using fields
	public UDListSetMap(int id, String name, float salary, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.phone = phone;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	//create setter and getters
	
}
