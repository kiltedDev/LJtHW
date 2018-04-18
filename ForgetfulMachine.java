import java.util.Scanner;

public class ForgetfulMachine {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "What city is the capital of France?" );
    keyboard.next();

    System.out.println( "What is 6 multiplied by 7?" );
    keyboard.nextInt();
    /* this question blows up when I type 3.14159
    Clearly java's looking for an integer not a float */

    System.out.println( "Enter a number between 0.0 and 1.0." );
    keyboard.nextDouble();
    /* This question blows up when I type pie
    Strings do not have number values in Java like they do in Ruby */

    System.out.println( "Is there anything else you would like to say?" );
    keyboard.next();
  }
}
