package person;

public class Student extends Person {
	private final String class_status;
	 public Student(String class_status){
	 this.class_status = class_status;
	 }
	 public String getclass_status(){
	 return class_status;
	 }
}