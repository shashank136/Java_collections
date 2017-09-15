import java.io.*;

public class ConsoleInput{
	public static void main(String[] args) {
		Console cons = System.console();
		String userTyped;
		String pwdTyped;
		boolean userValid =false;

		do{
			userTyped = cons.readLine("%s", "User name: ");
			pwdTyped = new String(cons.readPassword("%s", "Password: "));
			if (userTyped.equals("oracle")&&pwdTyped.equals("tiger")) {
				userValid = true;				
			}else{
				System.out.println("Wrong user name/Password. Try again. \n");
			}
		}while(!userValid);
	}
}