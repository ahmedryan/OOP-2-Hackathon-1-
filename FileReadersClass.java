package a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class FileReadersClass {

	public ArrayList <PersonalInfoClass> ArrPer = new ArrayList <PersonalInfoClass>();
	public ArrayList <AcademicInfoClass> ArrAcc = new ArrayList <AcademicInfoClass>();
	public ArrayList <StudentClass> ArrStu = new ArrayList <StudentClass>();
	
	public FileReadersClass()
	{
		
	}
	
	public void readfilePersonal()
	{	
		try
		{
			File ifile = new File("C:/Users/ASUS/Desktop/IIT DU/3rd Semester/OOP 2/Personal.txt");
			FileReader fr = new FileReader(ifile);
			BufferedReader br = new BufferedReader(fr);
			
			String [] SSI = new String [6];
			
			String s1;
			while((s1=br.readLine())!=null)
			{
				SSI = s1.split(",");
				
				PersonalInfoClass pic = new PersonalInfoClass(SSI[0],SSI[1],SSI[2],SSI[3],SSI[4],SSI[5]);
				
				StudentClass student = new StudentClass(SSI[5],pic);
				
				ArrPer.add(pic);
				
				ArrStu.add(student);
			}
			
			br.close();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void readfileAcademic()
	{
		try
		{
			File ifile = new File("C:/Users/ASUS/Desktop/IIT DU/3rd Semester/OOP 2/Academic.txt");
			FileReader fr = new FileReader(ifile);
			BufferedReader br = new BufferedReader(fr);
			
			String [] SSI = new String [6]; 
			
			String s1;
			while((s1=br.readLine())!=null)
			{
				SSI = s1.split(",");

				AcademicInfoClass aic = new AcademicInfoClass(SSI[0],SSI[1],SSI[2],SSI[3],SSI[4],SSI[5]);
				
				ArrAcc.add(aic);
				
				for(int i=0; i<ArrStu.size(); i++)
				{
					if(ArrStu.get(i).getRegNo().equals(SSI[0]))
					{
						ArrStu.get(i).setAcinfo(aic);
					}
				}
				
			}
			
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
