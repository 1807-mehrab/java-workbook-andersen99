public class Account{
	private double balance;
	private String pin;
	
	public Account(double newBalance,String pin) {
		balance = newBalance;
		this.pin = pin;
	}
	public double getBalance(){
		return balance;
	}
	public String getPin() {
		return pin;
	}
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
}