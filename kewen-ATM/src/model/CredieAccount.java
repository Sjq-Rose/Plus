package model;
//子账户 子类 信用账户
public class CredieAccount extends Account{
 //透支
	private double celling;

	public CredieAccount() {
		super();
	}

	public CredieAccount(long id, String password, String name, String personID, String tel, double balance, int type, double celling) {
		super(id, password, name, personID, tel, balance, type);
		this.celling = celling;
	}


	public double getCelling() {
		return celling;
	}

	public void setCelling(double celling) {
		this.celling = celling;
	}

	@Override
	public String toString() {
		return "CredieAccount{" +
				"celling=" + celling +
				'}';
	}

	public void withdraw(double money) {
		if (getBalance()+celling < money) {
			System.out.println("余额不足");
			return;
		}
	setBalance(getBalance()-money);
	}
}
