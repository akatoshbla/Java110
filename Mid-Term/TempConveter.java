//by: David Midterm

import java.util.Scanner;

public class TempConveter {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a temperature in degrees Celsius: ");
double celsiusinput = input.nextDouble();
System.out.println("The temperature " + celsiusinput + " C is " + celsiusToFahrenheit(celsiusinput) + " F");
}

public static double celsiusToFahrenheit(double celsius) {
double fahrenheit = (9.0 / 5) * celsius + 32;
return fahrenheit;
}
}