package practiceJavaProgram;

public class ConstructorCall extends Light {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 System.out.println("Creating Light Object no. 1.");
	 Light light1 = new Light();
	 System.out.println("Creating Light object no. 2.");
	 Light light2 = new Light(240, true);
	 System.out.println("Creating Light object no. 3.");
	 Light light3 = new Light(220, true, "attic");

	}

}
