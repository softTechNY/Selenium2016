package randomTest;

import java.util.Scanner;

public class BigAndSmallnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int smallest = 0;
		int large = 0;
		int num;
		
		System.out.println(" Enter the number");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0; i<n; i++)
		{
			num = input.nextInt();
			if(num > large)
			{
				large = num;
			}
			System.out.println("The largest is: "+ large);
			}

	}

}
