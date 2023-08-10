package com.threadutil;
import java.util.Scanner;


class UserDetails extends Thread {
    
    public void run() {
        getUserDetails();
    }

    public void getUserDetails() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter your name: ");
			String name = scanner.nextLine();
			System.out.print("Enter your email id: ");
			String email = scanner.nextLine();
			System.out.println("User: " + name + ", Email: " + email);
		}
    }
}

class PrintMessage extends Thread {
    private final Thread previousThread;

    public PrintMessage(Thread previousThread) {
        this.previousThread = previousThread;
    }

   
    public void run() {
        try {
            previousThread.join(); 
            Thread.sleep(5000);    
            System.out.println("Hello user!");

            int count = 1;
            while (true) {
                System.out.println("Count: " + count);
                Thread.sleep(2000); 
                count++;
            }
        } catch (InterruptedException e) {
            
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails();
        PrintMessage printMessage = new PrintMessage(userDetails);

        userDetails.start();
        printMessage.start();
    }
}