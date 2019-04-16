package a;

public class StudentClass {
	
	private String regNo;
	public AcademicInfoClass acinfo;
	public PersonalInfoClass psinfo;
	private String password="BSSE"+regNo;
	
	public StudentClass()
	{
		
	}
	
	public StudentClass(String regNo, PersonalInfoClass psinfo)
	{
		this.regNo=regNo;
		this.psinfo=psinfo;
	}
	
	public StudentClass(String regNo, AcademicInfoClass acinfo, PersonalInfoClass psinfo)
	{
		this.regNo=regNo;
		this.acinfo=acinfo;
		this.psinfo=psinfo;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public AcademicInfoClass getAcinfo() {
		return acinfo;
	}

	public void setAcinfo(AcademicInfoClass acinfo) {
		this.acinfo = acinfo;
	}

	public PersonalInfoClass getPsinfo() {
		return psinfo;
	}

	public void setPsinfo(PersonalInfoClass psinfo) {
		this.psinfo = psinfo;
	}

}