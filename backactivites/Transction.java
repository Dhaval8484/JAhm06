package backactivites;

public class Transction implements Bank {
	
	public void deposite(Account acc, int amt)
	{
		int newbal = acc.getBalance() + amt;
		acc.setBalance(newbal);
		
		System.out.println("Balance Deposited");
	}
	
	public void withdraw(Account acc, int amt)
	{
		int newbal = acc.getBalance() - amt;
		acc.setBalance(newbal);
		
		System.out.println("Balance Updated");
	}
}
