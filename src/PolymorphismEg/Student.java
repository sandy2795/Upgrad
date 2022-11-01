package PolymorphismEg;

public class Student implements Person {
	protected final String name;
	protected final int rollNo;
	protected final int year;
	protected static final int annualFee = 10000;
	protected static final int annualSalary = 15000;
	
	public Student(String name,int rollNo,int year) {
		this.name = name;
		this.rollNo = rollNo;
		this.year = year;
	}
	public String getDetails() {
		return "Roll Number: "+this.rollNo +"\t Student Name:"+this.name +"\t Fee: "+this.computeFee();
	}
	
	protected float computeFee() {
		return Student.annualFee * year;
	}
	
	public float computeFees(int annualFees){
	    return Student.annualFee * this.year;
	  }
	
	public float computeSalary() {
		return Student.annualSalary * this.year;
	}

}
