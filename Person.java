package com.consumer;

public class Person {
	
	 String personName;
     String emailId;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String personName, String emailId) {
		super();
		this.personName = personName;
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", emailId=" + emailId + "]";
	}
     
     
     

}
