package com.itkewen.java;

import java.io.File;

public class MyFile {

	public static void main(String[] args) {
        File file = new File("lib/1.txt");
        
        //1.��ȡ����·��
        String path1 = file.getAbsolutePath();
        System.out.println(path1);
        
        //2.���·��
        String path2= file.getPath();
        System.out.println(path2);
        
        //3.��ȡ����
        String filename = file.getName();
        System.out.println(filename);
        
        //��ȡ��ǰlib�µ��ļ����У����鷵��
        File file2 = new File("lib");
        String[] name = file2.list();
        
        for (String str : name) {
			System.out.println(str);
		}
	System.out.println("===================");
	////��ȡ��ǰlib�µ��ļ����У�file��������
	File[]  fileN = file2.listFiles();
	for (File fn : fileN) {
		System.out.println(fn);
		
	}
	}

}
