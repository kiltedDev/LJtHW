import java.util.Scanner;

public class RudeQuestions {
  public static void main ( String[] args ) {
    String name, offendedness;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello.  What is your name? " );
    name = keyboard.next();
    /* The system does not explode here
    either.  A string can easily be 12 unless
    further constraints are placed on it. */

    System.out.print("Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();
    /* This blows up when a string or decimal is entered. */

    System.out.println( "So, you're " + age + ", eh?  That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();
    /*This accepts an integer just fine.  An
     integer is just a double with a zero value
     past the decimal. */
    /* This blows up when a string is entered.*/

    System.out.println( weight + "! Good on you!!" );
    System.out.print( "Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();
    // This also blows up with a string.

    System.out.print( name + ", have I offended you with my questions?" )
    offendedness = keyboard.next();

    System.out.println( "I'm glad you said " + offendedness + ", " + name + ", that was my goal all along." )

    System.out.print( "Hopefully that's " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );
  }
}
