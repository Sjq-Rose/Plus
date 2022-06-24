package com.itkewen.java;

public class MyException {

	public static void main(String[] args) {
//     try {
//    	 show();
//	} catch (Exception e) {
//		System.out.println("代码报错");
//	}finally {
//		System.out.println("看看我会不会执行");
//	}
	
	
	try {
		show();
	} catch (Exception e) {
		System.out.println("有错，停止运行");
	}
	
	}
    public static void show() throws Exception{
		int a = 10/0;
		System.out.println(a);
	}
}
