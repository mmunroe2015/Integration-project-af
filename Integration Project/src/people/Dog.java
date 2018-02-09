//Mikayla Munroe
package people;

import java.util.Scanner;

public class Dog {
	double size;
	String breed;
	//main method

	public static void main(String[] args) {
	
	Dog taz = new Dog();
	Dog daisy = new Dog();
	taz.size = 20;
	daisy.size = 15;
	taz.breed = "Dauschund";
	daisy.breed = "Pug";
	System.out.println(taz.breed);
	
 System.out.println(taz.breed.substring(1, 4));
  
	int num1;
	int num2;
  int num3;
  double num4;
  double num5;
  double num6;
  
  num2 = 5;
  num3 = 7;
  num5 = 16.2;
  num6 = 8.1;
  num1 = num2 + num3;
  System.out.println("num2 plus num3 is " + num1);
  num4 = num5 / num6;
  System.out.println(num4);
  System.out.println(num2 % num3);
  System.out.println(num3 - num2);
  Scanner scan = new Scanner(System.in);
  System.out.println("what is your favorite dog breed?");
  String doggy = scan.nextLine();
  System.out.println("The best dog according to you is " + doggy);
  scan.close();
 

 Rectangle newRectangle = new Rectangle();
newRectangle.setWidth(5);
newRectangle.setHeight(7);
newRectangle.calcArea();



    
  
 
  
  
  }
	}	
	


	





	
	
	/*Definition of a variable: a space in memory for something to be used later
	 * Variable names and descriptions
	 *Byte: 8-bit. Minimum of -128 and max of 127
	 *Short: 16 signed twos complement integer
	 *Int: 32-bit type two's compliment
	 *Long: 64-bit two's complement integer
	 *Float: single-precision 32-bit IEEE 754 floating  point
	 *Double: double-precision 64-bit IEEE 754 floating point
	 *Boolean: only has two values, true and false
	 *Char: 16-bit Unicode character
	 *String:sequence of characters, is an object */  


