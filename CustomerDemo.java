package com.consumer;
import java.util.*;
public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> itemList=new ArrayList<>();
		itemList.add(new Customer("erric","X","London",348));
		itemList.add(new Customer("peter","y","paris",150));
		itemList.add(new Customer("joe","z","US",65));
		
		itemList.sort((i,j)->i.getCustomerName().compareTo(j.getCustomerName()));;
		
		itemList.forEach(System.out::println);
		
		itemList.removeIf((i)->i.getPlanAmount()>200);
		itemList.forEach(System.out::println);

	}

}
