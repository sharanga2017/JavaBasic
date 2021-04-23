package org.serguei;

import java.util.Iterator;
import java.util.Scanner;

public class HelloWorld {

	public static String[] questions;

	public static int[] responses;

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		

		String[] questions = getQuestions();
		
		

		int[] responses = getResponses();

		int score = 0;

		for (int i = 0; i < questions.length; i++) {

			System.out.println(questions[i]);

			int response = sc.nextInt();

			if (response == responses[i]) {
				score = score + 1;
			}

		}

		System.out.println("Votre score est " + score);

	}

	public static String[] getQuestions() {
		String questions[] = new String[] { "Q1 : 1+2   1. 3    2. 5     3. 5 ",
				"Q2 : 1+56  1. 3    2. 57    3. 5",
				"Q3 : 1+24  1. 3    2. 25    3. 5", 
				"Q4 : 1+12  1. 3    2. 5     3. 13",
				"Q5 : 1+2   1. 3    2. 5     3. 5" };

		return questions;
	}

	public static int[] getResponses() {

		int[] responses = new int[] { 1, 2, 2, 3, 1 };

		return responses;
	}

}
