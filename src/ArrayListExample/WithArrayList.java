package ArrayListExample;

import java.util.*;

public class WithArrayList {

  public static void main (String[] args) {
    ArrayList studentList = new ArrayList();

    studentList.add(new Student("Sujit", 1));
    studentList.add(new Student("Siddharth", 2));
    studentList.add(new Student("Karanpreet", 3));
    
    printStudentList(studentList);
  }

  public static void printStudentList(ArrayList students) {
    for(Object o : students) {
      Student s = (Student) o;
      System.out.println(s.getDetails());
    }
  }
}

class Student {
  private final String name;
  private final int rollNumber;

  public Student(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}