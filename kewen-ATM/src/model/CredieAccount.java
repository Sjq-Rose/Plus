package model;
//���˻� ���� �����˻�
public class CredieAccount extends Account{
 //͸֧
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
			System.out.println("����");
			return;
		}
	setBalance(getBalance()-money);
	}
}
