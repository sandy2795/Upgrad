package PolymorphismEg;

public class Professor implements Person {
	private String name;
	private int empNo;
	private static final float startingSalary=50000;
	
	public Professor(String name,int empNo) {
		this.empNo = empNo;
		this.name = name;
	}
	
	public String getDetails() {
		return "Employee Number: "+this.empNo + "\t Professor Name:"+this.name;
	}
	
	public float computeSalary() {
		return this.startingSalary;
	}

}
