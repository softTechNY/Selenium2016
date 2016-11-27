package brooklynDataCenter;

public class Warehouse2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	final Biglight tableLight = new Biglight(); // (5) Final local variable
	tableLight.noOfWatts = 100;	// (6) ok. changing final reference
	// tableLight = new Light();		// Not ok. changing final reference.
	
	//final Biglight streetLight;		// not initialized
	// streetLight.noOfWatts = 2200;	//not okay
	String[] myArray = new String[3];
	myArray[0] = "i am as an mentor for today";
	myArray[1] = "thaks for joining";
	myArray[2] = "how are you?";
	for (String myValue : myArray) {
		System.out.println(myValue);
		
		
		
	}
		
	

	}

}
