package PolymorphismEg;

public class ResearchStudent extends Student{
	protected String ResearchArea;
	private static final int annualFee = 10000;
	
	public ResearchStudent(String name,int rollNo,int year,String ResearchArea) {
		super(name,rollNo,year);
		this.ResearchArea  = ResearchArea;
	}
	
	protected float computeFee() {
		return ResearchStudent.annualFee * year * 0.9f;
	}
	

}
