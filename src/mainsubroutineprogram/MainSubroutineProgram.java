/*                             
 * Julianne Wojdak
 * 13/11/18
 * Methods and Returning Data Back To The Main Program
 */

package mainsubroutineprogram;
import java.util.Scanner;
/**
 *
 * @author JuWoj8013
 */
public class MainSubroutineProgram {

    /**
     * This calculates the average of five numbers
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     * @param num5
     * @param average 
     */
    public static void averageOfNums (int num1, int num2, int num3, int num4, int num5, int average)
    {
     average = (num1 + num2 + num3 + num4 + num5)/5;
     System.out.println("The average is " + average);
    }
    
    /**
     * This calculates the sum of five numbers
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     * @param num5
     * @param sum 
     */
    public static void sumOfNums (int num1, int num2, int num3, int num4, int num5, int sum)
    {
    sum = num1 + num2 + num3 + num4 + num5;
    System.out.println("The sum is " + sum);
    }
    
    /**
     * This finds the missing angle in a triangle
     * @param num1
     * @param num2
     * @param num3
     * @param total 
     */
    public static void missingAngle (int num1, int num2, int num3, int total)
    {
    total = num1 + num2;
    num3 = 180 - total;
    System.out.println("The missing angle is " + num3 + " degrees");
    }
    
    /**
     * This finds the value of a number squared
     * @param num1 
     */
    public static void numSquared (int num1)
    {
    num1 = num1*num1;
    System.out.println("The number squared is " + num1);
    }
    
    /**
     * This finds the area of a circle
     * @param pi
     * @param radius
     * @param area 
     */
    public static void areaOfCirlce (double pi, int radius, double area)
    {
     pi = 3.14;
     area = pi*radius*radius;
     System.out.println("The area is " + area + " cm squared");
    }
    
    /**
     * This finds the perimeter of a square
     * @param num1
     * @param num2
     * @param perimeter 
     */
    public static void perimeterOfSquare (int num1, int num2, int perimeter)
    {
    perimeter = num1 + num1 + num2 + num2;
    System.out.println("The perimeter is " + perimeter + " cm");
    }
    
    /**
     * This finds the value of a number cubed
     * @param num1 
     */
    public static void numCubed (int num1)
    {
    num1 = num1*num1*num1;
    System.out.println("The number cubed is " + num1);
    }
    
    /**
     * This finds the area of a square
     * @param length
     * @param width
     * @param area 
     */
    public static void areaOfSquare (int length, int width, double area)
    {
    area = length*width;
    System.out.println("The area is " + area + " cm squared");
    }
    
    /**
     * This finds the area of a triangle
     * @param base
     * @param height
     * @param area 
     */
     public static void areaOfTriangle (int base, int height, double area)
    {
        area = base*height/2;
        System.out.println("The area is " + area + "cm squared");
    }
     
    /**
     * This finds the volume of a cube
     * @param length
     * @param width
     * @param height
     * @param volume 
     */
    public static void volumeOfCube (int length, int width, int height, int volume)
    {
        volume = length*width*height;
        System.out.println("The volume is " + volume + "cm cubed");
    }
    
    /**
     * This is the main program
     * @param args 
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
       //Variables
        int choice;
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int average;
        int sum;
        int total;
        int radius;
        int length;
        int width;
        int perimeter;
        int base;
        int height;
        int volume;
        double area;
        double pi;
        
        //Home display
        while (true)
        {
        System.out.println("Methods and Returning Data Back To The Main Program");
        System.out.println("");
        
        System.out.println("Choose one of the following");
        System.out.println("1...Find the average of five numbers");
        System.out.println("2...Find the sum of five numbers");
        System.out.println("3...Find the missing angle in a triangle");
        System.out.println("4...Find the value of a number squared");
        System.out.println("5...Find the area of a circle");
        System.out.println("6...Find the perimeter of a square");
        System.out.println("7...Find the value of a number cubed");
        System.out.println("8...Find the area of a square");
        System.out.println("9...Find the area of a triangle");
        System.out.println("10...Find the volume of a cube");
        
        choice = keyedInput.nextInt();
        
        System.out.println("    ");
        
        //User inputed if statements
        if (choice == 1)
        {
        //Input
        System.out.println("Enter your five numbers");
        num1 = keyedInput.nextInt();
        num2 = keyedInput.nextInt();
        num3 = keyedInput.nextInt();
        num4 = keyedInput.nextInt();
        num5 = keyedInput.nextInt();
        
        //Output
        average = 0;
        averageOfNums(num1, num2, num3, num4, num5, average);
        System.out.println("    ");
        }
        
        if (choice == 2)
        {
        //Input
        System.out.println("Enter your five numbers");
        num1 = keyedInput.nextInt();
        num2 = keyedInput.nextInt();
        num3 = keyedInput.nextInt();
        num4 = keyedInput.nextInt();
        num5 = keyedInput.nextInt();
        
        //Output
        sum = 0;
        sumOfNums(num1, num2, num3, num4, num5, sum);
        System.out.println("    ");
        }
        
        if (choice == 3)
        {
        //Input
        System.out.println("Enter the first angle");
        num1 = keyedInput.nextInt();
        System.out.println("Enter the second angle");
        num2 = keyedInput.nextInt();
        
        //Output
        num3 = 0;
        total = 0;
        missingAngle(num1, num2, num3, total);
        System.out.println("    ");
        }
        
        if (choice == 4)
        {
        //Input
        System.out.println("Enter your number");
        num1 = keyedInput.nextInt();
        
        //Output
        numSquared(num1);
        System.out.println("    ");
        }
        
        if (choice == 5)
        {
        //Input
        System.out.println("Enter the radius");
        radius = keyedInput.nextInt();
        
        //Output
        pi = 3.14;
        area = 0;
        areaOfCirlce(pi, radius, area);
        System.out.println("    ");
        }
        
        if (choice == 6)
        {
        //Input
        System.out.println("Enter the length");
        length = keyedInput.nextInt();
        System.out.println("Enter the width");
        width = keyedInput.nextInt();
        
        //Output
        perimeter = 0;
        perimeterOfSquare(length, width, perimeter);
        System.out.println("    ");
        }
        
        if (choice == 7)
        {
        //Input
        System.out.println("Enter your number");
        num1 = keyedInput.nextInt();
        
        //Output
        numCubed(num1);
        System.out.println("    ");
        }
        
        if (choice == 8)
        {
        //Input
        System.out.println("Enter the length");
        length = keyedInput.nextInt();
        System.out.println("Enter the width");
        width = keyedInput.nextInt();
        
        //Output
        area = 0;
        areaOfSquare(length, width, area);
        System.out.println("    ");
        }
        
        if (choice == 9)
        {
        //Input
        System.out.println("Enter the base");
        base = keyedInput.nextInt();
        System.out.println("Enter the height");
        height = keyedInput.nextInt();
        
        //Output
        area = 0;
        areaOfTriangle(base, height, area);
        System.out.println("    ");
        }
        
        if (choice == 10)
        {
        //Input
        System.out.println("Enter the length");
        length = keyedInput.nextInt();
        System.out.println("Enter the width");
        width = keyedInput.nextInt();
        System.out.println("Enter the height");
        height = keyedInput.nextInt();
        
        //Output
        volume = 0;
        volumeOfCube(length, width, height, volume);
        System.out.println("    ");
        }
        
    }
    }
}
