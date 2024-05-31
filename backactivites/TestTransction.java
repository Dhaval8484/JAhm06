package backactivites;

public class TestTransction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account();
		acc.setAccname("Dhaval Surti");
		acc.setEmail("abc@gmail.com");
		acc.setBalance(5000);
		
		Transction tcs = new Transction();
		tcs.deposite(acc, 3000);
		
		System.out.println(acc);
		
		tcs.withdraw(acc, 1000);
		
		System.out.println(acc);

	}

}
