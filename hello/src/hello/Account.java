package hello;



public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE  = 1000000;
	
	private int balance=0;
	public Account() {
		
	}
	public void setter(int balance) {
		if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE )
			return;
		else {
			this.balance = balance;
		}
	}
	public int getter() {
		return this.balance;
	}

}
