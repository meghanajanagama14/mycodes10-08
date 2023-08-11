package com.consumer;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;
public class CallQualityFeed {
	
	ArrayList<CallQualityFeedBack> itemList=new ArrayList<>();
	
	CallQualityFeed()
	{
		itemList.add(new CallQualityFeedBack(1,"309876","good",5));
		itemList.add(new CallQualityFeedBack(2,"987654","Excellent",9));
		itemList.add(new CallQualityFeedBack(3,"678954","bad",2));
		
	}

	public void forEachItem(Consumer<CallQualityFeedBack> f)
	{
		for(CallQualityFeedBack i:itemList)
		{
			f.accept(i);
		}
	}
	public void forEach(Predicate<CallQualityFeedBack> f)
	{
		for(CallQualityFeedBack i:itemList)
		{
			if(f.test(i))
			{
				System.out.println(i+"call quality is good");
			}
			else
			{
				System.out.println(i+"call quality is bad");
			}
		}
	}
	
	public static void main(String[] args) {
		CallQualityFeed fb=new CallQualityFeed();
		fb.forEachItem((e)->System.out.println(e));
		fb.forEach((e)->e.getRating()>3);
		
		
		
	
		
		
		
	}
	
	

}
