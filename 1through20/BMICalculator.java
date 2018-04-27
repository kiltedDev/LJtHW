import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, inches, feet, h, w;

    System.out.println( "Your height? " );
    System.out.print( "Feet: " );
    feet = keyboard.nextDouble();
    System.out.print( "Inches: " );
    inches = keyboard.nextDouble();

    h = inches + (feet*12);

    System.out.print( "Your weight in lbs: " );
    w = keyboard.nextDouble();

    bmi = w / (h*h);

    System.out.println( "Your MBI is: " + bmi );
  }
}

/* The drill asked for a conversion to imperial
measurements, which feels dirty to me.  It does
test my ability to do math with variables on my
own though. */
