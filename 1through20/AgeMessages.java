import java.util.Scanner;

public class AgeMessages {
  public static void main( String [] args) {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.print( "How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "You are:" );
    if ( age < 13 ) {
      System.out.println( "\ttoo young to create a facebook account" );
    }

    if ( age < 16 ) {
      System.out.println( "\ttoo young to get a driver's license" );
    }

    if ( age < 18 ) {
      System.out.println( "\ttoo young to get a tattoo" );
    }

    if ( age < 21 ) {
      System.out.println( "\ttoo young to get a whiskey" );
    }

    if ( age < 36 ) {
      System.out.println( "\ttoo young run for President of the U.S." );
      System.out.println( "\t\t(How sad!)" );
    }

    if ( age >= 65 ) {
      System.out.println( "\told enough to retire" );
    }

    if ( age >= 13 ) {
      System.out.println( "\told enough to create a facebook account" );
    }

    if ( age >= 16 ) {
      System.out.println( "\told enough to get a driver's license" );
    }

    if ( age >= 18 ) {
      System.out.println( "\told enough to get a tattoo" );
    }

    if ( age >= 21 ) {
      System.out.println( "\told enough to get a whiskey" );
    }

    if ( age >= 36 ) {
      System.out.println( "\told enough run for President of the U.S." );
    }

    if ( age < 65 ) {
      System.out.println( "\ttoo young to retire" );
    }
  }
}

//This is me not cheating and just using else statements...
