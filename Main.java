import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // TODO: Problem 1
Scanner numInput = new Scanner(System.in);
System.out.println("type 1st int");
int first = numInput.nextInt();
System.out.println("type 2nd int");
int second = numInput.nextInt();
if (second == 0) {
  System.out.println("CANNOT DIVID BY 0");
  return;
}

double ratio = (double) first / second;
if (ratio > 1 && ratio <= 8) {
  System.out.println("Ratio OK");
}

    // TODO: Problem 2
System.out.println("type an int a");
int a = numInput.nextInt();
System.out.println("type an int b");
int b = numInput.nextInt();

int factor = a % b;
if (factor == 0) {
  System.out.println("Is a factor");
} else if (b == 0) {
  System.out.println("erorr");
}
    // TODO: Problem 3

    System.out.println("type an INTEGER"); 
    int integer = numInput.nextInt();
    if (integer >= 50 && integer <= 59) {
      System.out.println("Your number is " + integer);
    } else System.out.println("THAT SNOT IN THE FIFTIES!");
    integer = 55; 
    System.out.println("YOUR NUMER IS " + integer); 
  }
  


  // TODO: In-class assignment
  public static boolean rectEqual(Rectangle r1, Rectangle r2) {
    boolean equalWidth = r1.getWidth() == r2.getWidth();
    boolean equalLength = r1.getLength() == r2.getLength();
    return equalWidth && equalLength;
  }
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise.  Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.

}
