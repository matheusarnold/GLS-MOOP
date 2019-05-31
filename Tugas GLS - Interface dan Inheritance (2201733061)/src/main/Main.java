package main;

import java.util.Scanner;
import jobs.*;
import characters.*;

public class Main {
	public Main() {
		
	}
	
	public static void Fail() {		
		System.out.printf("tidak bisa melakukan hal ini");
		System.out.println("");
	}
	
	public static void main (String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int number = 0;
		int i;
		int j;
		
		String Doing;
		String [] tampung;
		String Activity;
		String RandomNumber;
		String [] List;
		String LowerCase;
		String UpperCase;
		String Answer;
		
		do {
			do {	
				System.out.println("1. Chef" );
				System.out.println("2. Worker");
				System.out.println("3. Driver");
				System.out.println("4. PainterChef");
				System.out.println("5. Master");
				System.out.println("6. Newbie");
				System.out.println("Input[Activity & Number[1-6] ]: ");
				System.out.println("*Activity Includes: Work , Paint, Drive, Cook");
				System.out.println("*Between the input Activity and Number there must be a space. Example : -> Work 1 <-");
				System.out.println("");
				System.out.printf(">>");
				
				Doing = scan.nextLine();
				LowerCase = Doing.toLowerCase();
				tampung = LowerCase.split(" ");
				Activity = tampung[0];
				RandomNumber = tampung[1];
				List = RandomNumber.split("&");
			}
			
			while (!Activity.equals("info") && !Activity.equals("cook") && !Activity.equals("work") && !Activity.equals("paint") && !Activity.equals("drive"));
			
			if (Activity.equalsIgnoreCase("info")) {
				for (i = 0; i < List.length; i++) {
					if (List[i].equals("1")) {
						BaseCharacter People = new Chef();
						People.getInfo();
					}
					else if (List[i].equals("2")) {	
						BaseCharacter People = new Worker();
						People.getInfo();
					}
					else if (List[i].equals("3")) {	
						BaseCharacter People = new Driver();
						People.getInfo();
					}
					else if (List[i].equals("4")) {
						BaseCharacter People = new PainterChef();
						People.getInfo();
					}
					else if (List[i].equals("5")) {
						BaseCharacter People = new Master();
						People.getInfo();
					}
					else if (List[i].equals("6")) {	
						BaseCharacter People = new Newbie();
						People.getInfo();
					}
				}
			}
			
			if (Activity.equalsIgnoreCase("work")) {
				for (i = 0; i < List.length; i++) {
					if (List[i].equals("1")) {
						BaseCharacter chef = new Chef();
						System.out.printf("Chef "); Fail();
					}
					else if (List[i].equals("2")) {
						BaseCharacter worker = new Worker();
						worker.Work();
					}
					else if (List[i].equals("3")) {
						BaseCharacter Driver = new Driver();
						System.out.printf("Driver ");Fail();
					}
					else if (List[i].equals("4")) {
						BaseCharacter painterchef = new PainterChef();
						System.out.printf("painterchef "); Fail();
					}
					else if (List[i].equals("5")) {
						BaseCharacter Master = new Master();
						Master.master();
					}
					else if (List[i].equals("6")) {
						BaseCharacter newbie = new Newbie();
						System.out.printf("Newbie ");Fail();
					}
				}
			}

			if (Activity.equalsIgnoreCase("cook")) {
				for (i = 0; i < List.length; i++) {
					if (List[i].equals("1")) {
						BaseCharacter chef = new Chef();
						chef.Cook();
					}
					else if (List[i].equals("2")) {	
						BaseCharacter worker = new Worker();
						System.out.printf("Worker "); Fail();
					}
					else if (List[i].equals("3")) {	
						BaseCharacter driver = new Driver();
						System.out.printf("Driver ");Fail();
					}
					else if (List[i].equals("4")) {	
						BaseCharacter people = new PainterChef();
						people.painterchef();
					}
					else if (List[i].equals("5")) {	
						BaseCharacter Master = new Master();
						Master.master();
					}
					else if (List[i].equals("6")) {
						BaseCharacter newbie = new Newbie();
						System.out.printf("Newbie ");Fail();
					}
				}
			}
			
			if (Activity.equalsIgnoreCase("drive")) {
				for (i = 0; i < List.length; i++) {
					if (List[i].equals("1")) {
						BaseCharacter chef = new Chef();
						System.out.printf("Chef "); Fail();
					}
					else if (List[i].equals("2")) {		
						BaseCharacter worker = new Worker();
						System.out.println("Worker ");Fail();
					}
					else if (List[i].equals("3")) {		
						BaseCharacter driver = new Driver();
						driver.Drive();
					}
					else if (List[i].equals("4")) {		
						BaseCharacter painterchef = new PainterChef();
						System.out.printf("PainterChef "); Fail();
					}
					else if (List[i].equals("5")) {		
						BaseCharacter Master = new Master();
						Master.master();
					}
					else if (List[i].equals("6")) {
						BaseCharacter newbie = new Newbie();
						System.out.printf("Newbie ");Fail();
					}
				}
			}
			
			if (Activity.equalsIgnoreCase("paint")) {
				for (i = 0; i < List.length; i++) {
					if (List[i].equals("1")) {			
						BaseCharacter chef = new Chef();
						System.out.printf("Chef "); Fail();
					}
					else if (List[i].equals("2")) {
						BaseCharacter worker = new Worker();
						System.out.printf("Worker ");Fail();
					}		
					else if (List[i].equals("3")) {
						BaseCharacter Driver = new Driver();
						System.out.printf("Driver ");Fail();
					}
					else if (List[i].equals("4")) {
						BaseCharacter painterchef = new PainterChef();
						painterchef.painterchef();		
					}
					else if (List[i].equals("5")) {			
						BaseCharacter Master = new Master();
						Master.master();
					}
					else if (List[i].equals("6")) {		
						BaseCharacter newbie = new Newbie();
						System.out.printf("Newbie ");Fail();
					}	
				}
			}
			
			for (j = 0; j < 1; j++) {
				System.out.println("");
			}
					
			do {
				System.out.println("Do you want to continue? : Y or N");
				System.out.printf(">>");
				Answer = scan.nextLine();
				UpperCase = Answer.toUpperCase();
				
				for (j = 0; j < 2; j++) {
					System.out.println("");
				}
			}
			
			while (!UpperCase.equals("Y") && !UpperCase.equals("N"));		
		}
		
		while (!UpperCase.equals("N"));
	}
}
