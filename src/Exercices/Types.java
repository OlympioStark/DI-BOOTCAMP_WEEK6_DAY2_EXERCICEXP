package Exercices;

public class Types {
	
	byte age = 10;
	short height = 30000;
	int distanceBetweenTwoSatellites = 1000000000;
	long distanceBetweenTwoGalaxy = 10000000000L;
	float rateOfInterest = 6/5f;
	double rateOfHike = 456/123d;
	char capitalA = 'A';
	boolean isPossible = true;
	
	public void displayInfo () {
		System.out.println("Age is: " + age +
				"\nheight is: " + height +
				"\ndistanceBetweenTwoSatellites is: " + distanceBetweenTwoSatellites +
				"\ndistanceBetweenTwoGalaxy is: " + distanceBetweenTwoGalaxy +
				"\nrateOfInterest is: " + rateOfInterest +
				"\nrateOfHike is: " + rateOfHike +
				"\ncapitalA is: " + capitalA +
				"\nisPossible is: " + isPossible + "\n");
	}

	public static void main(String[] args) {
		
		Types types = new Types();
		types.displayInfo();

	}

}
