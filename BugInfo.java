package com.byteapp;
import java.io.*;
import java.util.Scanner;
public class BugInfo {
    public static void main(String[] args) {
        try {
        	FileOutputStream fs=new FileOutputStream("c://myfiles//myfile1.txt");
        	Scanner s1=new Scanner(System.in);
        	System.out.println("Enter Developer Name: ");
        	String developername=s1.nextLine();
        	System.out.println("Enter BugNo: ");
        	String bugno=s1.nextLine();
        	System.out.println("Enter BugDesc: ");
        	String bugdescription=s1.nextLine();
        	
           byte[] bt=developername.getBytes();
           byte[] bt1=bugno.getBytes();
           byte[] bt2=bugdescription.getBytes();
           
           fs.write(bt);
           fs.write(bt1);
           fs.write(bt2);
           fs.flush();
           fs.close();
        }
        catch(IOException e) {
        	
        }
    }

    
}
