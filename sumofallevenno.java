package javaproject.anudip; 
import java.util.Scanner;

public class sumofallevenno {
	private static Scanner sc;

	public static void main(String[] args) 
	{
		int number, i, evenSum = 0;
		sc = new Scanner(System.in);
		
		System.out.println(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		for(i = 2; i <= number; i = i + 2)
		{
			evenSum = evenSum + i; 
		}
		System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
	}
}	 

	


