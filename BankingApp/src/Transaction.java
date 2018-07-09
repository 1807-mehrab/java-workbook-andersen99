public class Transaction implements Transactable{
	public boolean checkPin(Account userAccount,String entryPin){
		if(userAccount.getPin().equals(entryPin)) return true;
		else {
			System.out.println("You have entered an invalid PIN");
			return false;
		}
	}
	public boolean withdraw(Account userAccount, double amount){
		if(userAccount.getBalance() < amount) {
			System.out.println("Insufficient funds in this account");
			return true;
		}
		userAccount.setBalance(userAccount.getBalance() - amount);
		checkBalance(userAccount);
		return false;
	}
	public void deposit(Account userAccount, double amount) {
		userAccount.setBalance(userAccount.getBalance() + amount);
		System.out.println("Thank you for your deposit");
		checkBalance(userAccount);
	}
	public void checkBalance(Account userAccount) {
		System.out.println("Current Balance is $" + userAccount.getBalance());
	}
}