package model;

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
				act = new SavingAccount(id, password, name, personID, tel, balance);
			}
		    if (type==1) {
				act = new Account(id, password, name, personID, tel, balance);
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
		
			
		}
 	
	//登陆	
		
		
		
		
		
		
		
		

}