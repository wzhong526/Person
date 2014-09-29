package person;

public class Employee extends Person{
	private String office, salary;
	 private MyDate date_hired;
	 public Employee(){
	 }
	 public Employee(String office, String salary, MyDate date_hired){
	 this.office = office;
	 this.salary = salary;
	 this.date_hired = date_hired;
	 }
	 public String office(){
	 return office;
	 }
	 public void setOffice(String office){
	 this.office = office;
	 }
	 public String getSalary(){
	 return salary;
	 }
	 public void setSalary(String salary){
	 this.salary = salary;
	 }
	 public MyDate getMyDate(){
	 return date_hired;
	 }
}