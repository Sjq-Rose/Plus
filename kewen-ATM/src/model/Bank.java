package model;

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
				act = new SavingAccount(id, password, name, personID, tel, balance);
			}
		    if (type==1) {
				act = new Account(id, password, name, personID, tel, balance);
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
		
			
		}
 	
	//��½	
		
		
		
		
		
		
		
		

}