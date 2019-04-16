package a;

public class PersonalInfoClass{

	private String name;
	private String FN;
	private String MN;
	private String DOB;
	private String homeTown;
	private String regNo;
	
	public PersonalInfoClass()
	{
		
	}
	
	public PersonalInfoClass(String name,String FN,String MN,String DOB,String hometown,String regNo)
	{
		this.name=name;
		this.FN=FN;
		this.MN=MN;
		this.DOB=DOB;
		this.homeTown=hometown;
		this.regNo=regNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFN() {
		return FN;
	}
	public void setFN(String fN) {
		FN = fN;
	}
	public String getMN() {
		return MN;
	}
	public void setMN(String mN) {
		MN = mN;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public String getRegNo() {
		return regNo;
	}

}
