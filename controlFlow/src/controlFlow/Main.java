package controlFlow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Howdy, World");
		
//		System.out.println("Numbers");
//		AsciiChars.printNumbers();
//		System.out.println("Lowercase letters:");
//		AsciiChars.printLowerCase();
//		System.out.println("Uppercase letters:");
//		AsciiChars.printUpperCase();
		
		
// PLEASE IGNORE ALL OF THIS - THE PROCESS ISN'T PRETTY LOL 
//
//				System.out.println("Do you have a red car? (y/n)");
//				String userSecondResponse = userInput.nextLine();
//				
//				System.out.println("What is the name of your favorite pet?");
//				String namePet = userInput.nextLine();
//				
//				System.out.println("What is the age of your favorite pet?");
//				String agePet = userInput.nextLine();
//				
//				System.out.println("What is your lucky number?");
//				String userThirdResponse = userInput.nextLine();
//				
//				System.out.println("Do you have a favorite quarter-back? If so, what is their jersey number?");
//				String userFourthResponse = userInput.nextLine();
//				
//				System.out.println("What two digit year is your car? The bourgeois would like to know.");
//				String userFifthResponse = userInput.nextLine();
//				
//				System.out.println("What is the name of your favorite actor or actress? Extra points if yours isn't a Scientologist.");
//				String userSixthResponse = userInput.nextLine();
//				
//				System.out.println("Enter a random number between 1 and 50.");
//				String userSeventhResponse = userInput.nextLine();
				
		
	ArrayList<String> questions = new ArrayList<>();
	
	questions.add("Do you have a red car? (y/n)?");
	questions.add("What two digit year is your car? The bourgeois would like to know.");
	questions.add("What is the name of your favorite pet?");
	questions.add("What is the age of your favorite pet?");
	questions.add("Do you have a favorite quarter-back? If so what is their jersey number?");

	questions.add("Enter a random number between 1 - 50.");
	questions.add("What is your lucky number?");
	
	ArrayList<String> answers = new ArrayList<>();
	ArrayList<Integer> jackpot = new ArrayList<>();
	
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your name, humanoid life force:");
		String inputName = userInput.nextLine();
		System.out.printf("Hello, humanoid %s.\n", inputName);
		
		System.out.println("Do you wish to continue to the interactive portion, or are you a chicken? (y/n)");
		String userResponse = userInput.nextLine();
		
		if(userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
			for (String question : questions) {
				System.out.println(question);
				String resp = userInput.nextLine();
				answers.add(resp);
			}
			userInput.close();
			
		} else {
			System.out.printf("Okay %s, please return later to complete the survey, you big chicken.\n", inputName);
			userInput.close();
			System.exit(0);
		}
		jackpot = numGenerator(answers);
		
		System.out.print("Your lotto numbers are:");
		
		
		for(Integer lottoNumber : jackpot) {
				if(jackpot.indexOf(lottoNumber) < jackpot.size()-1) {
				System.out.printf("%d, ",  lottoNumber);			
				} else {
				System.out.printf("and the Magic Ball is: %d",  lottoNumber);
				}
		
		}
	
	}	
	
	private static ArrayList<Integer> numGenerator(ArrayList<String> ansStrings) {
			ArrayList<Integer> numbers = new ArrayList<>();
		
	
			Random random = new Random();
			Integer randOne = random.nextInt(75)+1;
			Integer randTwo = random.nextInt(75)+1;
			Integer randThree = random.nextInt(75)+1;
			
			Integer numZero = 0;
			if(ansStrings.get(0).length() > 2) {
				Character charZero = ansStrings.get(0).charAt(2);
				numZero = Character.getNumericValue(charZero);
			} else {
				Character charZero = ansStrings.get(0).charAt(0);
				numZero = Character.getNumericValue(charZero);
			}
			while(numZero < 1 || numZero > 65) {
				if(numZero < 1) {
					numZero += 23;
				} else if(numZero >65) {
					numZero -= 17;
				}
			}
			numbers.add(numZero);
			
			
			Integer numOne = Integer.parseInt(ansStrings.get(1)) + Integer.parseInt(ansStrings.get(6));
			while(numOne > 65) {
				numOne -= 35;	
			}
			numbers.add(numOne);
			
		
			Integer numTwo = Integer.parseInt(ansStrings.get(5)) - randOne;
			while(numTwo < 1) {
				numTwo += 10;
			}
			numbers.add(numTwo);
			
			
			Integer numThree = Character.getNumericValue(ansStrings.get(2).charAt(0)) + randTwo;
			while(numThree > 65) {
				numThree -= 22;
			}
			numbers.add(numThree);
			
		
			Integer numFour = 0;		
			numFour = Character.getNumericValue(ansStrings.get(4).charAt(0)) + Character.getNumericValue(ansStrings.get(3).charAt(ansStrings.get(3).length()-1));
			while(numZero > 65) {
				numZero -= 33;
			}
			numbers.add(numFour);
			
		
			Collections.sort(numbers);
			
			
			Integer magicNum = Integer.parseInt(ansStrings.get(6)) + randOne - randTwo + randThree;
			while(numThree > 75) {
				numThree -= 51;
			}
			numbers.add(magicNum);
			
	
			return numbers;
		}

	}



		
	
		
		
		
	


