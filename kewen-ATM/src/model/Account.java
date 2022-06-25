package model;
//账户类
public class Account {
	private long id;//账号
	private String password;//密码
	private String name;//姓名
	private String personID;//身份证
	private String tel;//电话号码
	private double balance;//余额
	private int type;//账户类型
	public Account() {

		super();
	}
	//test
	public Account(long id, String password, String name, String personID, String tel, double balance, int type) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.personID = personID;
		this.tel = tel;
		this.balance = balance;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonID() {
		return personID;
	}

	public void setPersonID(String personID) {
		this.personID = personID;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", password='" + password + '\'' +
				", name='" + name + '\'' +
				", personID='" + personID + '\'' +
				", tel='" + tel + '\'' +
				", balance=" + balance +
				", type=" + type +
				'}';
	}

	//存款
	public void desposite(double money) {
		if ( money <= 0) {
			System.out.println("存款金额不能小于等于0");
			return;
		}
        balance+=money;
	}
       //取款
	public void withdraw(double money) {
		if (balance < money) {
			System.out.println("余额不足");
			return;
			
		}
	balance-=money;
	}
	}



