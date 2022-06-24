package com.itkewen.java;

import java.util.*;
class Stundent{
	//��Ա����
	private String name;
	private int age;
	public Stundent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stundent other = (Stundent) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Stundent [name=" + name + ", age=" + age + "]";
	}
	
}
public class MyList {

	public static void main(String[] args) {
       //������list��������Ӷ��󲢱�����ӡ
	  //1.�������϶���
		List<Stundent> list = new ArrayList();
		
		//2.����Ԫ��
		Stundent a1 = new Stundent("ϲ����", 3);
		Stundent a2 = new Stundent("������", 2);
		Stundent a3 = new Stundent("������", 3);
		Stundent a4 = new Stundent("������", 4);
		Stundent a5 = new Stundent("ϲ����", 3);
		Stundent a6 = new Stundent("ϲ����", 3);
		//3.��ѧ��������ӵ�������
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
		//4.�����ӡ
		//System.out.println(list);
	    for (Object obj: list) {
		  //	System.out.println(obj);
	     //ת������
			Stundent stu =(Stundent) obj;
			System.out.println(obj);
		}
	}

}
