package brooklynDataCenter;

public class Light {
	// Fields :
	int noOfWatts;
	boolean indicator;	// on or off
	String location;	// placement

	
	// Static variable
	static int counter;		// no. of Light objects created.
	// Explicit default constructor
	Light(int noOWatts, boolean indicator, String location) {
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		++counter;		// increment counter.
	}
		
		// Static method
		public static void writeCount() {
			System.out.println("Number of lights: " + counter);
		
			}
	}


