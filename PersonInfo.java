package com.consumer;

import java.util.ArrayList;
import java.util.List;

public class PersonInfo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        
        personList.add(new Person("Abc", "abc@gmail.com"));
        personList.add(new Person("def", "def@gmail.com"));
        personList.add(new Person("ghi", "ghi@gmail.com"));

        
        personList.forEach(PersonInfo::printPersonInfo);
    }

    
    public static void printPersonInfo(Person person) {
        System.out.println("Name: " + person.getPersonName() + ", Email Id: " + person.getEmailId());
    }
}