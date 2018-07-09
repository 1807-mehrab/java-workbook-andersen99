import java.util.*;
import java.util.Scanner;
public class Main{
public static void main(String[] args){
	Account userAccount = new Account(1000.00, "1234");
	Transaction newSession = new Transaction();
	Scanner read = new Scanner(System.in);
	Command com = new Command();
	String entryPin = new String();
	do {
		System.out.println("Please enter your 4 digit PIN:");
		entryPin = read.nextLine();
	}while(!(newSession.checkPin(userAccount, entryPin)));
	String selection = new String();
	do {
		System.out.println("Please enter a valid command");
		selection = read.nextLine();
		com.processCommand(userAccount, selection, newSession);
	}while(!(selection.equals("quit"))); 
}
}