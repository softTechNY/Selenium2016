package practiceJavaProgram;

public class TestCircle2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	System.out.println("Before creating objects");
	System.out.prontln("The number of Circle objects is " +
			Circle2.numberOfObjects);
	// Create c1
	Circle2 c1 = new Circle2();
	// Zdisaly c1 Before  c2 is created
	System.out.println("\n After creating c1");
	System.out.println("c1: radious(" + c1.radius +
			") and number of CIrcle objects ("+
			c1.numberOfObjects + ")");
	// Modify c1
	c1.radius = 9;
	// Dispay c1  and c2 After c2 was created
	System.out.println("\n After creating  c2 and modifying c1");
	System.out.println("c1: radius(" + c2.radius+
			");

	}

}
