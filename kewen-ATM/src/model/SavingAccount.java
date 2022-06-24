package model;
//子账户 储蓄账户类
public class SavingAccount extends Account {

	public SavingAccount() {
		super();
	}

	public SavingAccount(long id, String confirmpassword, String name, String personID, String tel, double balance) {
		super(id, confirmpassword, name, personID, tel, balance);
	}
    

}
