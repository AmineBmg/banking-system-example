package bs;

public class Account {
	
	private  String ID;
	private  double balance; //mandatory
	private double limit; //limit on account.
	
	public Account(String id, double intial) {
		this.ID= id;
		this.balance=intial;
	}
		
	public double getBalance() {
		return this.balance;
	}
	
	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	public double getLimit() {
		return limit;
	}
	
	
	//deposit feature
	public void deposit(double amount) {
		balance +=amount;
		System.out.println(" Amount: "+ amount +" added to the account: "+ID +"\n Total "+ getBalance()+amount);
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
		return balance >= amount+ limit;
	}
	

	
}
