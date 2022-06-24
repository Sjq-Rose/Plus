package com.itkewen.java;

import java.io.File;

public class MyFile {

	public static void main(String[] args) {
        File file = new File("lib/1.txt");
        
        //1.获取绝对路径
        String path1 = file.getAbsolutePath();
        System.out.println(path1);
        
        //2.相对路径
        String path2= file.getPath();
        System.out.println(path2);
        
        //3.获取名字
        String filename = file.getName();
        System.out.println(filename);
        
        //获取当前lib下的文件（夹）数组返回
        File file2 = new File("lib");
        String[] name = file2.list();
        
        for (String str : name) {
			System.out.println(str);
		}
	System.out.println("===================");
	////获取当前lib下的文件（夹）file对象数组
	File[]  fileN = file2.listFiles();
	for (File fn : fileN) {
		System.out.println(fn);
		
	}
	}

}
