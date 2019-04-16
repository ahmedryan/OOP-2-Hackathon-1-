package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import a.FileReadersClass;
import a.FileWritersClass;
import a.OperationClass;
import a.StudentClass;

public class MainClass {
	
	public static void main(String[] args) {
	
		OperationClass opc = new OperationClass();
		FileWritersClass fwc = new FileWritersClass();
		FileReadersClass frc = new FileReadersClass();
		
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Log in as: ");
		System.out.println("1.Admin(password hint: iit123)");
		System.out.println("2.User");

		int loginas = scan1.nextInt();
		if(loginas==1)
		{
			System.out.println("Enter Admin Password: ");
			String adminpass = scan2.nextLine();
			
			if(adminpass.equals("iit123"))
			{
				System.out.println("Logged in as ADMIN user");
				System.out.println("1.Update Student Info");
				System.out.println("2.Add Student");
				int adminoption = scan1.nextInt();
				
				if(adminoption==1)
				{
					opc.updateInfo();
				}
				else if(adminoption==2)
				{
					fwc.writeIntoFile();;
				}
				else System.out.println("Invalid Admin Option");
			}
			else
			{
				System.out.println("Incorrect Admin Password");
			}
		}
		else if(loginas==2)
		{
			//Student Login
			System.out.println("Enter Student Registration Number: ");
			String regino = scan2.nextLine();
			int findflag=0;
			int studentarrayindex=-1;
			
			for(int i=0; i<frc.ArrStu.size(); i++)
			{
				if(regino.equals(frc.ArrStu.get(i).getRegNo()))
				{
					studentarrayindex=i;
					findflag=1;
				}
			}
			if(findflag==0)
			{
				System.out.println("Registration Number not found");
				scan1.close();
				scan2.close();
				return;
			}
			
			System.out.println("Enter Student Password: ");
			String studentpass = scan2.nextLine();
			
			if(frc.ArrStu.get(studentarrayindex).getPassword()==studentpass)
			{
				System.out.println("Logged in as Student");
				//Client Requesting for Account Details
				try
				{
					System.out.println("Client is Requesting");
					Socket soc = new Socket("localhost",3333);  
					  
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
					System.out.println("Enter Account Number: ");
					String AccNum = br.readLine();
					PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
					out.println(AccNum);
					System.out.println("Enter Account Pin: ");
					String pin = br.readLine();
					out.println(pin);
					
					//Certificate Text File
					try
					{	
						File ofile1 = new File("C:/Users/ASUS/Desktop/IIT DU/3rd Semester/OOP 2/Certificate.txt");
						FileWriter fw1 = new FileWriter(ofile1, true);
						BufferedWriter bw1= new BufferedWriter(fw1);
						
						OperationClass oc = new OperationClass();
						StudentClass sc = oc.insertStudent();
						
						if(sc!=null)
						{
							String s1 = sc.getPsinfo().getName()+", son of "+sc.psinfo.getFN()+" and "+sc.psinfo.getMN()+" has successfully passed " +sc.getAcinfo().getSemester()+"th semester having a CGPA of"+ sc.getAcinfo().getCgpa() +". As far my concern he/she is not involved in any indisciplinary activities. I wish him/her great luck in the future." + System.lineSeparator();
							bw1.write(s1);	
						}
						
						bw1.close();
						fw1.close();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
					soc.close();
					br.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
			else
			{
				System.out.println("Incorrect Password");
				scan1.close();
				scan2.close();
				return;
			}
			
		}
		else System.out.println("Invalid Login Option");
		
		scan1.close();
		scan2.close();
	}

}
