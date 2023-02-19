package Login;

import java.util.Scanner;

public class LoginSystem {
	public static void main(String[] args) {
		 int i=0;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter username and password");
			String username=sc.nextLine();
			String password=sc.nextLine();
			boolean valideCredentials = isValideCredentials(username, password);
			if(valideCredentials) {
				break;
			}else
				i++;
		}while(i<3);
		if(i==3) {
			System.out.println("maximum number of logins exceed please try after sometime");
		}
	}
	public  static boolean isValideCredentials(String username, String password) {
		
		if(username.equals("Srinivas@17") && password.equals("pass")) {
			System.out.println("Welcome Home");
			return true;
		}
		else {
			System.out.println("Invalid credentials");
			return false;
		}
	}
}
