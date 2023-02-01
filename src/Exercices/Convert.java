package Exercices;

import java.util.Scanner;

public class Convert {
	
	

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrez la note s'il vous plaît");
		double score = scanner.nextDouble();
		String note;
		
		if ( (92 < score) && (score <= 100) ) {
			note = "IN";
			System.out.println("La note est " + note);
		} else if ( (89 < score) && (score <=92) ) { 
			note = "A-";
			System.out.println("La note est " + note);
		} else if((86 < score) && (score <= 89)) {
			note = "B+";
			System.out.println("La note est " + note);
		} else if((82 < score) && (score <= 86)) {
			note = "B";
			System.out.println("La note est " + note);
		} else if((79 < score) && (score <= 82)) {
			note = "B-";
			System.out.println("La note est " + note);
		} else if((76 < score) && (score <= 79)) {
			note = "C+";
			System.out.println("La note est " + note);
		} else if((69 < score) && (score <= 76)) {
			note = "C";
			System.out.println("La note est " + note);
		} else if((59 < score) && (score <= 69)) {
			note = "ré";
			System.out.println("La note est " + note);
		} else {
			note = "F";
			System.out.println("La note est " + note);
		}
		

	}

}
