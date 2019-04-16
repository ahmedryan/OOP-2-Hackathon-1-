package a;

import java.util.Scanner;

public class OperationClass {
	
	Scanner scan = new Scanner(System.in);
	FileReadersClass frc = new FileReadersClass();
	FileWritersClass fwc = new FileWritersClass();
	
	public void completeReading()
	{
		frc.readfileAcademic();
		frc.readfilePersonal();
	}
	
	public void printAllStudentInfo()
	{
		completeReading();
		
		for(int i=0; i<frc.ArrStu.size(); i++)
		{
			System.out.print(frc.ArrStu.get(i).getRegNo()+" ");
			System.out.print(frc.ArrStu.get(i).getPsinfo().getName()+" ");
			System.out.print(frc.ArrStu.get(i).getAcinfo().getSession()+" ");
			System.out.print(frc.ArrStu.get(i).getAcinfo().getSemester()+" ");
			System.out.print(frc.ArrStu.get(i).getAcinfo().getYear()+" ");
			System.out.print(frc.ArrStu.get(i).getAcinfo().getCgpa()+" ");
			System.out.print(frc.ArrStu.get(i).getAcinfo().getClassroom()+" ");
			System.out.print(frc.ArrStu.get(i).getPsinfo().getFN()+" ");
			System.out.print(frc.ArrStu.get(i).getPsinfo().getMN()+" ");
			System.out.print(frc.ArrStu.get(i).getPsinfo().getDOB()+" ");
			System.out.println(frc.ArrStu.get(i).getPsinfo().getHomeTown()+" ");
		}	
	}
	
	public int searchIndex()
	{
		completeReading();
		
		System.out.println("Enter the Registration Number: ");
		String regNo = scan.nextLine();
		
		for(int i=0; i<frc.ArrStu.size(); i++)
		{
			if(regNo.equals(frc.ArrStu.get(i).getRegNo())) return i;
		}
		
		return -1;
		
	}
	
	public void printStudentInfo()
	{
		completeReading();
		
		int i = searchIndex();
		
		System.out.print(frc.ArrStu.get(i).getRegNo()+" ");
		System.out.print(frc.ArrStu.get(i).getPsinfo().getName()+" ");
		System.out.print(frc.ArrStu.get(i).getAcinfo().getSession()+" ");
		System.out.print(frc.ArrStu.get(i).getAcinfo().getSemester()+" ");
		System.out.print(frc.ArrStu.get(i).getAcinfo().getYear()+" ");
		System.out.print(frc.ArrStu.get(i).getAcinfo().getCgpa()+" ");
		System.out.print(frc.ArrStu.get(i).getAcinfo().getClassroom()+" ");
		System.out.print(frc.ArrStu.get(i).getPsinfo().getFN()+" ");
		System.out.print(frc.ArrStu.get(i).getPsinfo().getMN()+" ");
		System.out.print(frc.ArrStu.get(i).getPsinfo().getDOB()+" ");
		System.out.println(frc.ArrStu.get(i).getPsinfo().getHomeTown()+" ");
	}
	
	public StudentClass insertStudent()
	{
		completeReading();
		
		System.out.println("Enter Student's Registration No: ");
		String reg = scan.nextLine();
		
		int flag=0;
		for(int i=0; i<frc.ArrStu.size(); i++)
		{
			if(reg.equals(frc.ArrStu.get(i).getRegNo())) flag=1;
		}
		
		if(flag==0) 
		{	
			System.out.println("Enter Student's Name: ");
			String name=scan.nextLine();
			System.out.println("Enter Student's FN: ");
			String FN=scan.nextLine();
			System.out.println("Enter Student's MN: ");
			String MN=scan.nextLine();
			System.out.println("Enter Student's DOB: ");
			String DOB=scan.next();
			System.out.println("Enter Student's hometown: ");
			String hometown=scan.next();
			
			System.out.println("Enter Student's session: ");
			String session=scan.next();
			System.out.println("Enter Student's semester: ");
			String semester=scan.next();
			System.out.println("Enter Student's year: ");
			String year=scan.next();
			System.out.println("Enter Student's cgpa: ");
			String cgpa=scan.next();
			System.out.println("Enter Student's classroom: ");
			String classroom=scan.next();
			
			AcademicInfoClass aic = new AcademicInfoClass(reg,session,semester,year,cgpa,classroom);
			PersonalInfoClass pic = new PersonalInfoClass(name,FN,MN,DOB,hometown,reg);
			StudentClass sc = new StudentClass(reg,aic,pic);
			
			return sc;
		}
		
		else 
		{
			return null;
		}
		
	}
	
	public void updateInfo()
	{
		int index=searchIndex();
		
		if(index==-1) System.out.println("Registration Number not Found");
		else
		{
			frc.ArrStu.get(index);
		}
	}
	
	
}
