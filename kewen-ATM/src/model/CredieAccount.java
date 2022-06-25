package model;
//���˻� ���� �����˻�
public class CredieAccount extends Account{
 //͸֧
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
			System.out.println("����");
			return;
		}
	setBalance(getBalance()-money);
	}
}
