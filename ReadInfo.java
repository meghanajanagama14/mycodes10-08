package com.byteapp;

import java.io.*;
public class ReadInfo{
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("c://myfiles//myfile1.txt");
			byte[] bt=new byte[40];
			byte[] bt1=new byte[40];
			byte[] bt2=new byte[40];
			fin.read(bt);
			fin.read(bt1);
			fin.read(bt2);
			String str=new String(bt);
			System.out.println(str);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}