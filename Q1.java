package April27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		try
		{
			System.out.println("Enter Two Numbers");
			int x=s.nextInt();
		    int y= s.nextInt();
		    int z= x/y;
		    System.out.println(" z="+ z);
		
		}
		catch(ArithmeticException a1)
		{
			System.out.println("number cannot be divided by zero ");
		}
		catch(InputMismatchException mi)
		{
			System.out.println("plz enter integer only");
		}
		catch(Exception ex)
		{
			System.out.println("Something Went Wrong");
			
		}	

	}

}

