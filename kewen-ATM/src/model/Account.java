package model;
//ʵ���� �˻���
public class Account {
	private long id;//�˺�乱码了
	private String confirmpassword;//����
	private String name;//����
	private String personID;//���֤
	private String tel;//�绰����
	private double balance;//���
	public Account() {
		super();
	}
	//test
	public Account(long id, String confirmpassword, String name, String personID, String tel, double balance) {
		super();
		this.id = id;
		this.confirmpassword = confirmpassword;
		this.name = name;
		this.personID = personID;
		this.tel = tel;
		this.balance = balance;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPassword() {
		return confirmpassword;
	}
	public void setPassword(String password) {
		this.confirmpassword = password;
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
	@Override
	public String toString() {
		return "Account [id=" + id + ", confirmpassword=" + confirmpassword + ", name=" + name + ", personID=" + personID + ", tel="
				+ tel + ", balance=" + balance + "]";
	}
	
	//���
	public void desposite(double money) {
		if ( money <= 0) {
			System.out.println("������С�ڵ���0");
			return;
		}
        balance+=money;
	}
       //ȡ��
	public void withdraw(double money) {
		if (balance < money) {
			System.out.println("����");
			return;
			
		}
	balance-=money;
	}
	}


