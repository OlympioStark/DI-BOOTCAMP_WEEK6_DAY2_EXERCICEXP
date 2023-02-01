package Exercices;

import java.util.Scanner;

public class Pyramid {
	
	public static void main(String[] args) {

		int numInput;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		numInput = scanner.nextInt();
		
		for (int i = 1; i <= numInput; i++) {
			if (i == 1) {
				System.out.println(i);
			} else {
				String val = String.valueOf(i);
				System.out.println(i + "" + val.repeat(i - 1));
			}
		}
	}

}
