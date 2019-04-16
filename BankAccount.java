package a;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankAccount {
	
			private  String accNumber;
			private  double balance;
			private  String password; 

			public BankAccount()
			{
				
			}
			
			public double getBalance()
			{
				return this.balance;
			}
				
			public String getAccNum()
			{
				return this.accNumber;
			}
			
			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}
			
			public void setAccNumber(String accNumber) {
				this.accNumber = accNumber;
			}

			public void setBalance(double balance) {
				this.balance = balance;
			}
			
			public void withdraw()
			{	
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter your Password: ");
				String pass = scan.nextLine();

				if(pass==password)
				{
					if(balance>=100)
					{
						balance = balance - 100;
						System.out.println("WITHDRAWAL DONE!\n");	
					}	
					else System.out.println("WITHDRAWAL AMMOUNT IS INVALID!\n");
				}
				else
				{
					System.out.println("Incorrect Password");
				}
				
				System.out.println("Your current balance is: "+balance+'\n');
				scan.close();
			}		 

}
