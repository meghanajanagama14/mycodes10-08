package com.byteapp;
import java.io.*;

public class BufferEx {
	public static void main(String[] args) {
		//InputStream in=System.in;
		try {
			FileOutputStream fs=new FileOutputStream("bufferdata.txt");
			BufferedOutputStream bot=new BufferedOutputStream(fs);
			bot.write("Developer Name: Meghana,".getBytes());
			bot.write("Bug No : 65,".getBytes());
			bot.write("Bug Description : Exception".getBytes());
			
			bot.flush();
			bot.close();
			
			FileInputStream fin=new FileInputStream("bufferdata.txt");
			try (BufferedInputStream bin = new BufferedInputStream(fin)) {
				byte[] bt=new byte[bin.available()];
				bin.read(bt);
				System.out.println(new String(bt));
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}

}