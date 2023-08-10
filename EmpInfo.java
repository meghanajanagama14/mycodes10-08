package com.byteapp;
import java.io.*;
public class EmpInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStreamWriter writer=new OutputStreamWriter(new FileOutputStream("emp.txt"));
			writer.write("Emp name:peter sam jones");
			writer.write("dept:sales");
			writer.write("desig:manager");
			writer.write("salary:35000");
			writer.flush();
			writer.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		try (InputStreamReader reader = new InputStreamReader(new FileInputStream("emp.txt"))) {
			char[] cstr=new char[80];
			reader.read(cstr);
			System.out.println(cstr);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}

	}

}
