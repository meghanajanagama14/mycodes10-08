package com.byteapp;
import java.io.*;
public class FilterDemo {
	public static void main(String[] args) {
		try {
			FilterOutputStream filter=new FilterOutputStream(new FileOutputStream("myfilterdata.txt") );
			//FilterOutputStream filter=new FilterOutputStream(System.out);
			filter.write("filter stream".getBytes());
			filter.flush();
			filter.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		try {
			FileInputStream fin=new FileInputStream("myfilterdata.txt");
			FilterInputStream filterin=new DataInputStream(fin);
			byte[] bt=new byte[fin.available()];
			filterin.read(bt);
			String str=new String(bt);
			System.out.println(str);
		}
		catch(Exception e) {
			
		}
	}

}
