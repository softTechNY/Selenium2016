package brooklynDataCenter;

public class Biglight {
	// Final satic variable
	final public static double KWH_PRICE = 3.25;
	
	int noOfWatts;
	
	// Final instance method
	final public void setWatts(int watt) {
		noOfWatts = watt;
	}
	
	public void setKWH() {
		//KWH_PRICE = 4.10;		//	NOT OK, CANNOT BE CHANGERD
	}

}
