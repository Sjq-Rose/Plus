package com.itkewen.java;

public class MyException {

	public static void main(String[] args) {
//     try {
//    	 show();
//	} catch (Exception e) {
//		System.out.println("���뱨��");
//	}finally {
//		System.out.println("�����һ᲻��ִ��");
//	}
	
	
	try {
		show();
	} catch (Exception e) {
		System.out.println("�д�ֹͣ����");
	}
	
	}
    public static void show() throws Exception{
		int a = 10/0;
		System.out.println(a);
	}
}
