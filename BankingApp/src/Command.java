import java.util.*;
import java.util.ArrayList;
public class Command{
	ArrayList<String> comList;
	public Command() {
		comList = new ArrayList<String>();
		comList.add("withdraw");
		comList.add("deposit");
		comList.add("quit");
		comList.add("help");
		comList.add("check balance");
	}
	public void processCommand(Account userAccount, String com,Transaction newSession) {
		boolean isInvalid = true;
		for (String command : comList) {
			if(com.equals(command)) isInvalid = false;
		}
		if(isInvalid) System.out.println("Invalid Command, type 'help' for a list of commands");
		else if(com.equals("help")) {
			System.out.println("Here is a list of Commands");
			for (String command : comList) {
				System.out.println(command);
			}
		}
		else if(com.equals("quit"))System.exit(0);
		else {
			Scanner read = new Scanner(System.in);
			double amount;
			if (com.equals("withdraw")){
				do {
					System.out.println("Please enter a withdrawal amount");
					isInvalid = false;
					try {
						amount = Double.parseDouble(read.nextLine());
						if (!isInvalid)isInvalid = newSession.withdraw(userAccount, amount);
					}
					catch(NumberFormatException e) {
						System.out.println("Please enter a number with no letters or symbols");
						isInvalid = true;
					}
				}while(isInvalid);
			}
			else if(com.equals("deposit")) {
				do {
					isInvalid = false;
					System.out.println("Please enter a deposit amount");
					try {
						amount = Double.parseDouble(read.nextLine());
						newSession.deposit(userAccount, amount);
					}
					catch(NumberFormatException e) {
						System.out.println("Please enter a number with no letters or symbols other than");
						isInvalid = true;
					}
				}while(isInvalid);					
			}
			else if(com.equals("check balance")) newSession.checkBalance(userAccount);
		}
	}
}