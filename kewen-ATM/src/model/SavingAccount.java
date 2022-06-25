package model;
//子账户 储蓄账户类
public class SavingAccount extends Account {

	public SavingAccount() {

		super();
	}

	public SavingAccount(long id, String password, String name, String personID, String tel, double balance, int type) {
		super(id, password, name, personID, tel, balance, type);
	}
	@Override
	public String toString() {
		return "SavingAccount{}";
	}
}
