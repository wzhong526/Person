package person;

public class StaffMember extends Employee{
	private String title;
	public StaffMember(){
	 }
	 public StaffMember(String title){
	 this.title = title;
	 }
	 public String getTitle(){
	 return title;
	 }
	public void setTitle(String title){
	 this.title = title;
	 }
}