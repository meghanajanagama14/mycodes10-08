package com.consumer;

import java.util.function.Function;
import java.util.ArrayList;
public class RechargeConsumerData {
	
	ArrayList<Recharge> itemList=new ArrayList<>();
	
	RechargeConsumerData()
	{
		itemList.add(new Recharge(1,654,"12-08-2023"));
		itemList.add(new Recharge(2,456,"23-09-2023"));
		itemList.add(new Recharge(3,34,"01-01-2023"));
		
	}
	
	public void rechargeData(Function<Recharge,String> f)
	{
		for(Recharge i:itemList)
		{
			System.out.println(f.apply(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RechargeConsumerData obj=new RechargeConsumerData();
		obj.rechargeData((r)->"customer id: "+r.getCustomerId()+"amount paid: "+r.getAmount());

	}

}
