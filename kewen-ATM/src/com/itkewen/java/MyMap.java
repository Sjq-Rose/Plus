package com.itkewen.java;
import java.security.Key;
import java.util.*;
public class MyMap {

	public static void main(String[] args) {
      //������map���������3��ѧ�����󣬲�������ӡ
		Map<Integer,Stundent> map = new HashMap<Integer,Stundent>();
      //����ѧ������
	  Stundent s1 = new Stundent("С��",20);
	  Stundent s2= new Stundent("С��",21);
	  Stundent s3= new Stundent("С��",19);
	  map.put(1, s1);
	  map.put(2,s2);
	  map.put(3,s3);
	  
//	  Stundent stu1 = (Stundent) map.put(3, s3);
//	  System.out.println("key:"+2+",value:"+stu1);
	  //ͨ��������
	  //a.��ȡ���������еļ�������һ��Set����
	  Set<Integer> ks  =map.keySet();
	  //�������еļ�����ȡ�����еļ�
	  Iterator<Integer> it = ks.iterator();
	  while (it.hasNext()) {
        Integer key = it.next();
        Stundent value = (Stundent) map.get(key);
        System.out.println("key:"+key+",value:"+value);
	}
	}

}
