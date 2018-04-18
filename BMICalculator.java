import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi;

    System.out.print( "your height in meters: " );
    m = keyboard.nextDouble();

    System.out.print( "Your mass in kg: " );
    kg = keyboard.nextDouble();

    bmi = kg / (m*m);

    System.out.println( "Your MBI is: " + bmi );
  }
}
