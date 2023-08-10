package com.threadutil;

 class Cab{
	
}

class Cab1 implements Runnable
{
	
	CabDriver cab;
	String Drivername;
	public Cab1(CabDriver cab,String Drivername)
	{ 
		this.cab=cab;
		this.Drivername=Drivername;
	}
	public void run() 
	{ 
		synchronized(cab)
		{
			 try
			 { 
				 System.out.println("cab driver  "+this.Drivername);
				 cab.wait();
				 System.out.println("cab is driven by "+this.Drivername);
			 }
			 catch(InterruptedException e)
			 {
				 System.out.println(e);
			 }
		}
	}
}

class Cab2 implements Runnable
{ 
    CabDriver cab;
	Cab2(CabDriver cab)
	{ 
		this.cab=cab;
	}
	public void run()
	{
		synchronized(cab)
		{
			try {
				Thread.sleep(2000);
				 cab.notify();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class CabDriver 
{ 
	 public static void main(String args[])
	 {
		CabDriver c=new CabDriver();
		 Cab1 c1=new Cab1(c,"Peter");
		 Cab2 c2=new Cab2(c);
		 Thread t1=new Thread(c1);
		 Thread t2=new Thread(c2);
		 t1.start();
		 t2.start();
		 
	 }
}