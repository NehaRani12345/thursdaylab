package oopsconcept;
import java.util.Scanner;

public class Employesalaryprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int id;
	String name,designation;
	float salary;
	Scanner sc=new Scanner(System.in);
	Employessalary emp=new Employessalary();
	System.out.print("enter employee id: ");
	id=sc.nextInt();
	sc.nextLine();
	System.out.print("enter employee name: ");
	name=sc.nextLine();
	System.out.print("enter employee designation: ");
	designation=sc.nextLine();
	System.out.print("enter employee salary: ");
	salary=sc.nextFloat();
	System.out.println("=============================");
	emp.emp_details(id, name, designation, salary);
	emp.calculate();
	emp.display();
	sc.close();

}


	}


