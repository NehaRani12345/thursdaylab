package javaproject.anudip;
import java.util.Scanner;

public class Perfectnobetween1to50 {

	public static void main(String[] args) {
		 
		  int num, sum = 0;
		    int i;
		    for (num = 1; num < 50; num++) {
		        for (int j = 1; j <= num - 1; j++) {   
		            if (num % j == 0) {
		                sum = sum + j;
		            }
		        }
		        if (sum == num) {
		            System.out.println(sum);
		        }
		        sum = 0;                              
		    }
	}
}

	

		


	


