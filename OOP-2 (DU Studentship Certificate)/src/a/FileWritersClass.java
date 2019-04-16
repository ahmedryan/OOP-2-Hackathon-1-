package a;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWritersClass {
	
	public void writeIntoFile()
	{
		try
		{	
			File ofile1 = new File("C:/Users/ASUS/Desktop/IIT DU/3rd Semester/OOP 2/Personal.txt");
			FileWriter fw1 = new FileWriter(ofile1, true);
			BufferedWriter bw1= new BufferedWriter(fw1);

			File ofile2 = new File("C:/Users/ASUS/Desktop/IIT DU/3rd Semester/OOP 2/Academic.txt");
			FileWriter fw2 = new FileWriter(ofile2, true);
			BufferedWriter bw2= new BufferedWriter(fw2);
			
			OperationClass oc = new OperationClass();
			StudentClass sc = oc.insertStudent();
			
			if(sc!=null)
			{
				String s2 = System.lineSeparator() + sc.getRegNo() + "," + sc.acinfo.getSession() + "," + sc.acinfo.getSemester() + "," + sc.acinfo.getYear() + "," + sc.acinfo.getCgpa() + ","  + sc.acinfo.getClassroom();
				String s1 = System.lineSeparator() + sc.psinfo.getName() + "," + sc.psinfo.getFN() + "," + sc.psinfo.getMN() + "," + sc.psinfo.getDOB() + "," + sc.psinfo.getHomeTown() + "," + sc.getRegNo();
				//bw.append(s2);
				//bw.write(s1);
				bw1.write(s1);
				bw2.append(s2);
			}
			
			bw1.close();
			bw2.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
