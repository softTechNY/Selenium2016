package brooklynDataCenter;

public class Warehouse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Light.writeCount();
		Light light1 = new Light(100, true, "basement");	// create an object
		System.out.println("value of counter: " + Light.counter);	// Access via class name
		Light light2 = new Light(200, false, "garagr");		// Create another object
		light2.writeCount();		// Invoke using reference
		Light light3 = new Light(300, true, "kitchen");		// Create another object
		System.out.println("Value of counter: " + light3.counter);	//	Access via reference
		final int i;

	}

}
