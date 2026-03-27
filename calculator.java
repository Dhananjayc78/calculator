package Dj;
import java.util.*;

public class calculator {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int a;
		System.out.println("                        %... Welcome to Universal calculator.....%           ");
		
		System.out.println("please scelect right case for calculation...!");
		System.out.print("case-1:- Addtion \ncase-2:-Subtration \ncase-3:-Multiplication\ncase-4:-division\ncase-5:-Area of Square\ncase-6:-Area of rectangel\ncase-7:-Area of triangle\ncase-8:- Area of circle\ncase-9:-Parallelogram \ncase-10:-Trapezoid"
					
				);
		
		
		
		
		a=sc.nextInt();
		switch(a) {	
		
		
		case 1: float b,c,sum,diff,mul,div;
		System.out.println("Enter 1st number ");
		b=sc.nextFloat();
		System.out.println("Enter 2nd number ");
		c=sc.nextFloat();
		sum=b+c;
		System.out.println(" Addtion of two number is  "+sum);
		break;
		
		case 2:System.out.println("Enter 1st number ");
		b=sc.nextFloat();
		System.out.println("Enter 2nd number ");
		c=sc.nextFloat();
		diff=b-c;
		System.out.println(" Addtion of two number is  "+diff);
		break;
		
		
		case 3:System.out.println("Enter 1st number ");
		b=sc.nextFloat();
		System.out.println("Enter 2nd number ");
		c=sc.nextFloat();
		mul=b*c;
		System.out.println(" Addtion of two number is  "+mul);
		break;
		
		
		case 4:System.out.println("Enter 1st number ");
		b=sc.nextFloat();
		System.out.println("Enter 2nd number ");
		c=sc.nextFloat();
		div=b/c;
		System.out.println(" Addtion of two number is  "+div);
		break;
		
		case 5:System.out.println("Enter Side of square ");
		b=sc.nextFloat();
		float d=b*b;
		System.out.println("Area of square is " + d);
		
		

		case 6:System.out.println("Enter length of rectangle  ");
		b=sc.nextFloat();
		System.out.println("Enter width of rectangle ");
		c=sc.nextFloat();
		float e=b*c;
		System.out.println(" Area of rectangle  is  "+ e);
		break;
		
		case 7:System.out.println("Enter base of triangle ");
		b=sc.nextFloat();
		
		System.out.println("Enter height of triangle ");
		c=sc.nextFloat();
		 double f= 0.50*b*c;
		System.out.println(" Area of rectangle  is  "+ f);
		break;
		
		case 8:System.out.println("Enter radius of circle   ");
		b=sc.nextFloat();
		double g=0.50*b*b;
		System.out.println(" Area of circle   is  "+ g);
		break;
		


		case 9:System.out.println("Enter base of parallelogram");
		b=sc.nextFloat();
		
		System.out.println("Enter height of parallelogram");
		c=sc.nextFloat();
		 double h= b*c;
		System.out.println(" Area of rectangle  is  "+ h);
		break;
		
		case 10:System.out.println("Enter 1 st base of trapezoid");
		b=sc.nextFloat();
		
		System.out.println("Enter 2nd base of trapezoid");
		c=sc.nextFloat();
		System.out.println(" height (the perpendicular distance between the two bases");
		float j =sc.nextFloat();
	
		 double i= 0.50*(b+c)*j;
		System.out.println(" Area of rectangle  is  "+ i);
		break;
		

		}
		
	}

}
