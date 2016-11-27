package practiceJavaProgram;

public class Light {
	// Filds
	private int noOfWatts;
	private boolean indicator;
	private String location; 
	
	// Constructors
	
	Light() {
		noOfWatts = 0;
		indicator = false;
		location ="X";
		System.out.println("Returning form default constructor no 1.");
	}
	Light(int watts, boolean onOffState) {
		noOfWatts = watts;
		indicator = onOffState;
		location = "X";
		System.out.println("returing from non-default constructor no. 2.");
	}
	Light(int noOfWatts, boolean indicator, String location) {
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		System.out.println("Returning from non-default constructor no. 3.");
	}

}
