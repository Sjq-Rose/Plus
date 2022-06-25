package model;

import service.UserService;

public class Bank {
//管理银行账户的数组
	private Account[] acts = new Account[10];
//记录账户数量
	private int index = 0;
//构造
	public Bank() {

		super();
	}
//开户
	public Account rerister(long id,String password, String confirmpassword, String name, String personID, String tel, double balance,int type) {
//账户的引用
		Account act = null;
//判断两次密码是否一致
		if(!password.equals(confirmpassword)) {
			System.out.println("两次密码不一致");
			return null;
		}else {
			//0:存储账户 1：信用账户 2：贷款账户
			if (type==0) {
				act = new SavingAccount(id, confirmpassword, name, personID, tel, 0, type);
			}
		    if (type==1) {
				act = new Account(id, confirmpassword, name, personID, tel, 0,type);
			}
		    if (type==2) {
			//	act = 
			}
//           判断数组里面是否有空位
		    if (index == acts.length) {
				//调用数组扩容里面的方法，传现在的数组，接收返回来的新数组
		    	acts = expand(acts);
			}
		   //将账户信息放在数组里面
		    acts[index]=act;
		    index++;
		    return act;
		
		}
	}		
	//账户数组扩容
		public Account[] expand(Account[] act) {
			Account[] act1 = new Account[act.length*2];
			//将原来数组的值赋值给新数组
			System.arraycopy(act, 0, act1, 0, act.length);
	     	return act1;
		}
		
			

 	
	//登陆	
	public Account login(Long id, String password) {
		int find = searchIdPassword(index, id, password); //当前用户数组下标
		if(find >= 0) {						//判断账户密码是否正确
//			System.out.println("登录成功");
			return acts[find];         //返回当前对象
		}
//		else {
//			System.out.println("用户名密码错误");
//		}

		return null;			//如果账户密码错误返回空
	}

	//用户存款
	public Account deposit(Long id, double money) {
		int find = searchId(index, id);//当前用户数组下标
		if(find >= 0) {							//判断账户是否存在
			acts[find].desposite(money);      //调用Account类的存款方法
//			System.out.println("存款成功");
			return acts[find];             //返回当前对象
//			accounts[find].setBalance(accounts[find].getBalance()+money);
		}
//		else {
//			System.out.println("用户不存在");
//		}


		return null;			//如果账户不存在返回空
	}

	//用户取款
	public Account withdraw(Long id, String password, double money) {
		int find = searchIdPassword(index, id, password);//当前用户数组下标
		if(find >= 0) {									//判断账户密码是否正确

			acts[find].withdraw(money);				//调用当前对象的取款方法
//			System.out.println("取款成功");
			return acts[find];						//返回当前对象

		}
		return null;
	}
	//设置透支额度
	public Account updateCeiling(Long id, String password, double money) {
		int find = searchIdPassword(index, id, password);//获取当前用户数组下标
		if((find >= 0) && (acts[find].getType()) == 1){  //判断账户号码和密码是否正确，账户类型是否为信用账户
			((CredieAccount)acts[find]).setCelling(((CredieAccount)acts[find]).getCelling() + money); //调用set方法设置透支额度
			return acts[find];
		}
		return null;
	}


	//  转账功能
	//  参数：from转出账户，passwordFrom 转出账号的密码，to转入账户，money转账的金额
	public boolean transfer(Long from, String passwordFrom, Long to, double money) {
		int find = searchIdPassword(index, from, passwordFrom); //转账账户数组下标
		int find2 = searchId(index, to);              //收款账户数组下标
		if(find >= 0 && find2 >= 0 && acts[find].getBalance() >= money) {  //判断转账账户密码、收款账户是否匹配，判断转账用户余额是否足够
			acts[find].withdraw(money);//转账用户转账操作==取款
			acts[find2].desposite(money);//收款用户 == 存款
			return true;

		}

		return false;
	}

	//统计银行所有账户余额总数
	public double balanceSum() {
		double sum = 0;     //初始化所有账户余额
		for(int i = 0; i < index; i++) {  //遍历数组
			sum += acts[i].getBalance();//求和(账户余额)
		}
		return sum;
	}

	//统计所有信用账户透支额度总数
	public double ceilingSum() {
		double sum = 0;  //初始化所有透支额度和
		for(int i = 0; i < index; i++) {  //遍历
			if(acts[i].getType() == 1) {  //判断账户类型是否为信用账户
				sum += ((CredieAccount)acts[i]).getCelling(); //求和
			}
		}
		return sum;
	}
	//搜索Id与密码返回数组下标位置
	public int searchIdPassword(int index, Long id, String password) {
		for(int i = 0; i < index; i++) {
			if(id.equals(acts[i].getId()) && password.equals(acts[i].getPassword())){  //比较账户和密码是否匹配
				return i ;				//匹配则返回账户数组下标
			}

		}
		return -1;						//不匹配则返回-1
	}
	//搜索Id
	public int searchId(int index, Long id) {
		for(int i = 0; i < index; i++) {
			if(id.equals(acts[i].getId())){   //比较账户是否匹配
				return i ;						//匹配则返回账户数组下标
			}

		}
		return -1;					//不匹配则返回-1
	}
}





