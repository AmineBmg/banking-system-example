package bs;

public class Bank {
	
	Account acc;
	
	public void createAccount(String id, double balance) {		
			 acc=new Account(id, balance);
			 System.out.println("Account: "+ id +" has been created succesfuly ...");
	}
	
	public void depositOnAccount(String id, double amount) {	
		acc.deposit(amount);
	}
	
	public void withdrawFromAccount(String id, double amount) {
		if (acc.withdrawWithLimit(amount)) {
			System.out.println("the ammount "+ amount +" has been withdraw successfuly ...");
		}
		else {
			System.out.println("Error insufficientBalance...!");

		}
	}
	
}
