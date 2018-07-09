public interface Transactable{
	public boolean withdraw(Account userAccount, double amount);
	public void deposit(Account userAccount, double amount);
	public void checkBalance(Account userAccount);
	public boolean checkPin(Account userAccount, String entryPin);
}