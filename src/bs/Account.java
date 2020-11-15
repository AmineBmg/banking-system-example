package bs;

public class Account {
	
	private  String custumerID;
	private  double balance; //mandatory
	private double limitOnAccount; //limit on account.
	
	public Account(String id, double intial) {
		this.custumerID= id;
		this.balance=intial;
	}
		
	public double getBalance() {
		return this.balance;
	}
	
	public void setLimit(double limit) {
		this.limitOnAccount = limit;
	}
	
	public double getLimit() {
		return limitOnAccount;
	}
	
	
	//deposit feature
	public void deposit(double amount) {
		balance +=amount;
		System.out.println(" Amount: "+ amount +" added to the account: "+custumerID +"\n Total "+ getBalance()+amount);
	}
		
	
	//withdraw without limit
	public boolean withdraw(double amount) {
		if(isSufficient(amount)) {
			balance = balance - amount;
			return true;
		}	
		return false;
	}

	public boolean isSufficient(double amount) {
		return balance >= amount+ limitOnAccount;
	}
	

	
}
