package brooklynDataCenter;
import java.util.*;

public class ExceptionHanling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 1;
	try{
		System.out.println("Enter first num");
		int n1 = input.nextInt();
		System.out.println("ENter second num: ");
		int n2 = input.nextInt();
		int sum = n1/n2;
		System.out.println(sum);
		 x = 2;
	}
	catch(Exception e) {
			System.out.println("you can't do that");
		}
	
	
	while(x == 1);
	}
}



