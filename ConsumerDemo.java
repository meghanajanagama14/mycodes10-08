package com.consumer;
import java.util.function.Consumer;
public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Consumer<Integer> c=(a)->System.out.println(a);
           c.accept(10);
	}

}
