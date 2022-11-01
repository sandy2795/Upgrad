package PolymorphismEg;

public class Main {
	public static void main(String[] args) {
		Student s = new Student("Student_s",200,2);
		ResearchStudent rs = new ResearchStudent("ResearchStudent_rs",300,3,"Software Engineering");
		Professor p = new Professor("Professor_p",100);

		Person[] personArray= {s, rs, p};
		printDetails(personArray);

	}
	public static void printDetails(Person[] persons) {
		for(Person person:persons) {
			System.out.println(person.getDetails());
			System.out.println("Salary-->"+person.computeSalary());
		}
	}

}
