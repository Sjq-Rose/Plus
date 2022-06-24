package model;
//子账户 子类 信用账户
public class CredieAccount extends Account{
 //透支
	private double celling;
	
	
	public CredieAccount(double celling) {
	super();
	this.celling = celling;
}

	public CredieAccount() {
		super();
	}

	public CredieAccount(long id, String confirmpassword, String name, String personID, String tel, double balance) {
		super(id, confirmpassword, name, personID, tel, balance);
	}
	public void withdraw(double money) {
		if (getBalance()+celling < money) {
			System.out.println("余额不足");
			return;
		}
	setBalance(getBalance()-money);
	}
}
