package com.callquality;
import java.io.*;
public class CallQualityRecords {

	public void saveCallQuality(CallQuality customer)
	{
		 try {
		FileOutputStream fileout=new FileOutputStream(customer.getCustomerName()+".dat");
		 ObjectOutputStream objectout=new ObjectOutputStream(fileout);
		 objectout.writeObject(customer);
		 objectout.flush();
		 objectout.close();
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println(e);
		 }
		 catch(IOException e1)
		 {
			 System.out.println(e1);
		 }
	}
	public void displayCustomer(String name)
	{
		
		try {
			FileInputStream filein =new FileInputStream(name+".dat");
			try (ObjectInputStream objectin = new ObjectInputStream(filein)) {
				CallQuality customer =(CallQuality)objectin.readObject();
				
				System.out.println("Call Id "+customer.getCallId());
				
				System.out.println(" callDuration"+customer.getCallDuration());
				System.out.println(" callQualityGrade"+customer.getCallQualityGrade());
				System.out.println("Customer Name "+customer.getCustomerName());
			}
			
		}
		catch(FileNotFoundException e1)
		{
			System.out.println(e1);
		}
		catch(IOException e2)
		{
			System.out.println(e2);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallQuality obj1=new CallQuality(1,65,"good","peter");

		CallQualityRecords records=new CallQualityRecords();

records.saveCallQuality(obj1);
records.displayCustomer(obj1.getCustomerName());



	}

}