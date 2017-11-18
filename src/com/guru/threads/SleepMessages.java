package com.guru.threads;

public class SleepMessages {

	public static void main(String[] args) throws InterruptedException{
		String[] message = {
				"It's 2 AM",
				"Time to sleep",
				"Meeting at 8 tomorrow"
		};
		
		for(int i=0; i<message.length; i++){
			Thread.sleep(4000);
			System.out.println(message[i]);
		}
	}

}
