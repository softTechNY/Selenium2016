package practiceJavaProgram;

public class Circle2 {
// the radius of the cirrcle
	double radius;
	// the number of the objects created
	static int numberOfObjects = 0;
	// Cnstruct a circle with radius
	Circle2() {
		radius = 1.0;
		numberOfObjects++;
	}
	// Construct a circle with a specified radius 
	Circle2(double newRadius) {
		radius =newRadius;
		numberOfObjects++;
		
	}
	// Return number of objects 
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	// return the  area of this circle
	double getArea() {
		return radius*radius*Math.PI;
		
	}
}
