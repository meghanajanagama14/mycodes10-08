package com.threadutil;
import java.util.Scanner;
class MThreads extends Thread { 
	public void run() {
		Scanner Obj1 = new Scanner(System.in);
		System.out.println("Enter username"); 
		String userName = Obj1.nextLine(); 
		 
		Scanner Obj2 = new Scanner(System.in); 
		System.out.println("Enter email"); 
		String email = Obj1.nextLine();
		System.out.println("Email is: " +email);
	}
}
class MyThread1 extends Thread {
	 public void run() { 
	int principal=12000; 
	int rate=3; 
	int time =4; 
	int interest= principal * rate*time; 
	System.out.println(interest); } } 
public class MyThreads { 
	public static void main(String[] args) { 
	MThreads t1 =new MThreads();
	t1.start(); 
	MyThread1 t2= new MyThread1(); 
	t2.start(); }}
               