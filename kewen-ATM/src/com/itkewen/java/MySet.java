package com.itkewen.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class MySet {

	public static void main(String[] args) {
       //����ģ������ظ���
		//1.�������϶���
		Set set = new HashSet<>();
//        set.add(5);
//        set.add(4);
//        set.add(3);
//        set.add(2);
//        set.add(1);
//        System.out.println(set);
		
		//����ѧ������
		Stundent s1 = new Stundent("ϲ����", 3);
		Stundent s2 = new Stundent("������", 1);
		Stundent s3 = new Stundent("������", 3);
		Stundent s4 = new Stundent("������", 2);
		Stundent s5 = new Stundent("ϲ����", 3);
		Stundent s6 = new Stundent("ϲ����", 3);
		//3.��ѧ��������ӵ�������
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		
//		for (Object obj : set) {
//			System.out.println(obj);
//		}
		//4.ͨ������������
		Iterator it = set.iterator();
		 while (it.hasNext()) {
			Stundent obj = (Stundent) it.next();
			System.out.println(obj);
		 }
	}

}
