package model;

import service.UserService;

public class Bank {
//���������˻�������
	private Account[] acts = new Account[10];
//��¼�˻�����
	private int index = 0;
//����
	public Bank() {

		super();
	}
//����
	public Account rerister(long id,String password, String confirmpassword, String name, String personID, String tel, double balance,int type) {
//�˻�������
		Account act = null;
//�ж����������Ƿ�һ��
		if(!password.equals(confirmpassword)) {
			System.out.println("�������벻һ��");
			return null;
		}else {
			//0:�洢�˻� 1�������˻� 2�������˻�
			if (type==0) {
				act = new SavingAccount(id, confirmpassword, name, personID, tel, 0, type);
			}
		    if (type==1) {
				act = new Account(id, confirmpassword, name, personID, tel, 0,type);
			}
		    if (type==2) {
			//	act = 
			}
//           �ж����������Ƿ��п�λ
		    if (index == acts.length) {
				//����������������ķ����������ڵ����飬���շ�������������
		    	acts = expand(acts);
			}
		   //���˻���Ϣ������������
		    acts[index]=act;
		    index++;
		    return act;
		
		}
	}		
	//�˻���������
		public Account[] expand(Account[] act) {
			Account[] act1 = new Account[act.length*2];
			//��ԭ�������ֵ��ֵ��������
			System.arraycopy(act, 0, act1, 0, act.length);
	     	return act1;
		}
		
			

 	
	//��½	
	public Account login(Long id, String password) {
		int find = searchIdPassword(index, id, password); //��ǰ�û������±�
		if(find >= 0) {						//�ж��˻������Ƿ���ȷ
//			System.out.println("��¼�ɹ�");
			return acts[find];         //���ص�ǰ����
		}
//		else {
//			System.out.println("�û����������");
//		}

		return null;			//����˻�������󷵻ؿ�
	}

	//�û����
	public Account deposit(Long id, double money) {
		int find = searchId(index, id);//��ǰ�û������±�
		if(find >= 0) {							//�ж��˻��Ƿ����
			acts[find].desposite(money);      //����Account��Ĵ���
//			System.out.println("���ɹ�");
			return acts[find];             //���ص�ǰ����
//			accounts[find].setBalance(accounts[find].getBalance()+money);
		}
//		else {
//			System.out.println("�û�������");
//		}


		return null;			//����˻������ڷ��ؿ�
	}

	//�û�ȡ��
	public Account withdraw(Long id, String password, double money) {
		int find = searchIdPassword(index, id, password);//��ǰ�û������±�
		if(find >= 0) {									//�ж��˻������Ƿ���ȷ

			acts[find].withdraw(money);				//���õ�ǰ�����ȡ���
//			System.out.println("ȡ��ɹ�");
			return acts[find];						//���ص�ǰ����

		}
		return null;
	}
	//����͸֧���
	public Account updateCeiling(Long id, String password, double money) {
		int find = searchIdPassword(index, id, password);//��ȡ��ǰ�û������±�
		if((find >= 0) && (acts[find].getType()) == 1){  //�ж��˻�����������Ƿ���ȷ���˻������Ƿ�Ϊ�����˻�
			((CredieAccount)acts[find]).setCelling(((CredieAccount)acts[find]).getCelling() + money); //����set��������͸֧���
			return acts[find];
		}
		return null;
	}


	//  ת�˹���
	//  ������fromת���˻���passwordFrom ת���˺ŵ����룬toת���˻���moneyת�˵Ľ��
	public boolean transfer(Long from, String passwordFrom, Long to, double money) {
		int find = searchIdPassword(index, from, passwordFrom); //ת���˻������±�
		int find2 = searchId(index, to);              //�տ��˻������±�
		if(find >= 0 && find2 >= 0 && acts[find].getBalance() >= money) {  //�ж�ת���˻����롢�տ��˻��Ƿ�ƥ�䣬�ж�ת���û�����Ƿ��㹻
			acts[find].withdraw(money);//ת���û�ת�˲���==ȡ��
			acts[find2].desposite(money);//�տ��û� == ���
			return true;

		}

		return false;
	}

	//ͳ�����������˻��������
	public double balanceSum() {
		double sum = 0;     //��ʼ�������˻����
		for(int i = 0; i < index; i++) {  //��������
			sum += acts[i].getBalance();//���(�˻����)
		}
		return sum;
	}

	//ͳ�����������˻�͸֧�������
	public double ceilingSum() {
		double sum = 0;  //��ʼ������͸֧��Ⱥ�
		for(int i = 0; i < index; i++) {  //����
			if(acts[i].getType() == 1) {  //�ж��˻������Ƿ�Ϊ�����˻�
				sum += ((CredieAccount)acts[i]).getCelling(); //���
			}
		}
		return sum;
	}
	//����Id�����뷵�������±�λ��
	public int searchIdPassword(int index, Long id, String password) {
		for(int i = 0; i < index; i++) {
			if(id.equals(acts[i].getId()) && password.equals(acts[i].getPassword())){  //�Ƚ��˻��������Ƿ�ƥ��
				return i ;				//ƥ���򷵻��˻������±�
			}

		}
		return -1;						//��ƥ���򷵻�-1
	}
	//����Id
	public int searchId(int index, Long id) {
		for(int i = 0; i < index; i++) {
			if(id.equals(acts[i].getId())){   //�Ƚ��˻��Ƿ�ƥ��
				return i ;						//ƥ���򷵻��˻������±�
			}

		}
		return -1;					//��ƥ���򷵻�-1
	}
}





