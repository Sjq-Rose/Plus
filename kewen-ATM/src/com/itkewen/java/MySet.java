package com.itkewen.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class MySet {

	public static void main(String[] args) {
       //无序的，不可重复的
		//1.创建集合对象
		Set set = new HashSet<>();
//        set.add(5);
//        set.add(4);
//        set.add(3);
//        set.add(2);
//        set.add(1);
//        System.out.println(set);
		
		//创建学生对象
		Stundent s1 = new Stundent("喜洋洋", 3);
		Stundent s2 = new Stundent("懒洋洋", 1);
		Stundent s3 = new Stundent("美羊羊", 3);
		Stundent s4 = new Stundent("沸羊羊", 2);
		Stundent s5 = new Stundent("喜洋洋", 3);
		Stundent s6 = new Stundent("喜洋洋", 3);
		//3.将学生对象添加到集合中
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		
//		for (Object obj : set) {
//			System.out.println(obj);
//		}
		//4.通过迭代器遍历
		Iterator it = set.iterator();
		 while (it.hasNext()) {
			Stundent obj = (Stundent) it.next();
			System.out.println(obj);
		 }
	}

}
