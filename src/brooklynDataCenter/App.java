package brooklynDataCenter;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Bob");
		person1.greet();
		
		Info info1 = new Machine();
		info1.showInfo();
		Info info2 = person1;
		info2.showInfo();

	}

}
