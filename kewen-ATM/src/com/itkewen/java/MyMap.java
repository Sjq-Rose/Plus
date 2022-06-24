package com.itkewen.java;
import java.security.Key;
import java.util.*;
public class MyMap {

	public static void main(String[] args) {
      //需求：向map集合中添加3个学生对象，并遍历打印
		Map<Integer,Stundent> map = new HashMap<Integer,Stundent>();
      //创建学生对象
	  Stundent s1 = new Stundent("小明",20);
	  Stundent s2= new Stundent("小红",21);
	  Stundent s3= new Stundent("小花",19);
	  map.put(1, s1);
	  map.put(2,s2);
	  map.put(3,s3);
	  
//	  Stundent stu1 = (Stundent) map.put(3, s3);
//	  System.out.println("key:"+2+",value:"+stu1);
	  //通过迭代器
	  //a.获取集合中所有的键，返回一个Set集合
	  Set<Integer> ks  =map.keySet();
	  //遍历所有的键，获取到所有的键
	  Iterator<Integer> it = ks.iterator();
	  while (it.hasNext()) {
        Integer key = it.next();
        Stundent value = (Stundent) map.get(key);
        System.out.println("key:"+key+",value:"+value);
	}
	}

}
