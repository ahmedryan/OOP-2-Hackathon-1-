package a;

public class AcademicInfoClass {
	
	private String regNo;
	private String session;
	private String semester;
	private String year;
	private String cgpa;
	private String classroom;
	
	public AcademicInfoClass(String regNo, String session, String semester, String year, String cgpa, String classroom) 
	{
		this.regNo = regNo;
		this.session = session;
		this.semester = semester;
		this.year = year;
		this.cgpa = cgpa;
		this.classroom = classroom;
	}
	public String getRegNo() {
		return regNo;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCgpa() {
		return cgpa;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

}
