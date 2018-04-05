//Mikayla Munroe main dog class file
package people;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  // main method
//static means that an variable can be accessed without an instance created
  public static void main(String[] args) {

    Dog taz = new Dog();
    Dog daisy = new Dog();
    taz.setSize(20);
    daisy.setSize(15);
    taz.setBreed("Dauschund");
    daisy.setBreed("Pug");
    System.out.println(taz.getBreed());
    // casting
    Object o = "str";
    String str = (String) o;
    System.out.println(o + "ing");

    System.out.println(taz.breed.substring(1, 4));
    System.out.println("Let's shout taz's breed. " + taz.breed.toUpperCase());
    System.out.println("AND NOW WE WILL " + "WHISPER".toLowerCase());

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
    System.out.println("num5 divided by num6 is " + num4);
    System.out.println(num2 % num3);
    System.out.println(num3 - num2);
    System.out.println(num1 * num4);
    Scanner scan = new Scanner(System.in);
    /*
     * System.out.println("what is your favorite dog breed?"); String doggy =
     * scan.nextLine(); System.out.println("The best dog according to you is " +
     * doggy);
     */
    scan.close();

    // method call and argument
    Rectangle newRectangle = new Rectangle();
    newRectangle.setWidth(5);
    newRectangle.setHeight(7);
    // calling area method and displays area
    System.out.println(newRectangle.calcArea());
    boolean loop = 4 < 5;
    System.out.println(loop);
    int bla = 1;
    for (bla = 1; bla<4; bla++) {
      System.out.println("i love u for " + bla + " years");
      
    }
    int dogs = 1;
    while (dogs < 6) {
      System.out.println("The number of dogs in my house is " + dogs);
      dogs++;
    }
    Circle myCircle = new Circle();
    myCircle.setRadius(5);
    System.out.println(myCircle.calculateArea());
    myCircle.setX(4);
    myCircle.setY(8);
    System.out.println("The center is " + "(" + myCircle.getX() + ", "
        + myCircle.getY() + ")");
 
  
    int zoo[] = { 3, 5, 23, 7, 9, 55 };
    int sum = 0;  
    for (int i = 1;i<zoo.length;i++)
    {
      sum += zoo[i];
    }
  System.out.println("The sum is " + sum);
 //passes smallest integer in array
  System.out.println(findSmallest(zoo));
  System.out.println(Arrays.asList(zoo).indexOf(7));
 //find index

  //For each loop
  for(int i: zoo) {
    System.out.println(i);
  }
  //looking for index of 3 in the array
  System.out.println("The target is " + findIndex(zoo, 3));
  
 String sentence = "What's up my dude";
 StringBuilder sup = new StringBuilder(sentence);
 sup.reverse();
 System.out.println(sup);
 sup.append(" What's up my dude");
 System.out.println(sup);
 sup.delete(3, 6);
 System.out.println(sup);
  }//end main method

  public static int findIndex(int[] a, int target)
  {
   int i = 0;
    while(a[i]!= target) {
      i++;
    }
    return i;
  }
  
  public static int findSmallest(int zoo[]) {
   int smallest= zoo[0];
   for(int i = 1; i < zoo.length; i++) {
     if (zoo[i]< smallest)
       smallest = zoo[i];
   }
   return smallest;
 }
 
}


/*
 * Definition of a variable: a space in memory for something to be used later
 * Variable names and descriptions Byte: 8-bit. Minimum of -128 and max of 127
 * Short: 16 signed twos complement integer Int: 32-bit type two's compliment
 * Long: 64-bit two's complement integer Float: single-precision 32-bit IEEE 754
 * floating point Double: double-precision 64-bit IEEE 754 floating point
 * Boolean: only has two values, true and false Char: 16-bit Unicode character
 * String:sequence of characters, is an object
 */
