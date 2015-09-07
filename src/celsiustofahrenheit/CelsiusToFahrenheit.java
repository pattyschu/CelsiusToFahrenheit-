/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiustofahrenheit;
import java.util.Scanner;

/**
 *
 * @author pattyschu
 * @version Programming Exercises 2.1 Convert Celsius to Fahrenheit 
 */
public class CelsiusToFahrenheit 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a degree in Celsius");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0/5) * celsius + 32;
        
        System.out.println("Celsius " + celsius + " is " + fahrenheit + " in fahrenheit");
        
    }
    
}
