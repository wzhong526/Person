package person;

public class FacultyMember extends Employee{
	private String office_hours, rank;
	 public FacultyMember(){
	 }
	 public FacultyMember(String office_hours, String rank){
	 this.office_hours = office_hours;
	 this.rank = rank;
	 }
	 public String getOffice_hours(){
	 return office_hours;
	 }
	 public void setOffice_hours(String office_hours){
	 this.office_hours = office_hours;
	 }
	 public String getRank(){
	 return rank;
	 }
	 public void setRank(String rank){
	 this.rank = rank;
	 }
}