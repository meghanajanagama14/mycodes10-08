package com.byteapp;
import java.io.*;
public class OutputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             try {
            	 FileOutputStream fs=new FileOutputStream("c://myfiles//myfile.txt");
            	 String str="Hello world";
            	 byte[] bt=str.getBytes();
            	 fs.write(bt);
            	 fs.flush();
            	 fs.close();
            	 }
             catch(IOException ex) {
            	 System.out.print("IO exception");
             }
	}

}
