package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class BankAccountServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("welcome to bank server");
			ServerSocket ss = new ServerSocket(3333);  
			Socket soc = ss.accept();
			System.out.println("Connection Established");
			BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String AccNumServerEnd = br.readLine();
			String pinseverend = br.readLine();
			
			System.out.println(AccNumServerEnd);
			System.out.println(pinseverend);
			
			ss.close();
			soc.close();
			br.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}

