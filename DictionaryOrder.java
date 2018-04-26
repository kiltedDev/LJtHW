import java.util.Scanner;

public class DictionaryOrder {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    String downsized, name;

    System.out.print( "Make up the name of a programming Language! " );
    name = keyboard.nextLine();
    downsized = name.toLowerCase();

    if (downsized.compareTo("c++") < 0 ) {
      System.out.println( name + " comes BEFORE c++" );
    }
    if (downsized.compareTo("c++") == 0 ) {
      System.out.println( name + "c++ isn't a made-up language" );
    }
    if (downsized.compareTo("c++") > 0 ) {
      System.out.println( name + " comes AFTER c++" );
    }

    if (downsized.compareTo("java") < 0 ) {
      System.out.println( name + " comes BEFORE java" );
    }
    if (downsized.compareTo("java") == 0 ) {
      System.out.println( name + "java isn't a made-up language" );
    }
    if (downsized.compareTo("java") > 0 ) {
      System.out.println( name + " comes AFTER java" );
    }

    if (downsized.compareTo("lisp") < 0 ) {
      System.out.println( name + " comes BEFORE lisp" );
    }
    if (downsized.compareTo("lisp") == 0 ) {
      System.out.println( name + "lisp isn't a made-up language" );
    }
    if (downsized.compareTo("lisp") > 0 ) {
      System.out.println( name + " comes AFTER lisp" );
    }

    if (downsized.compareTo("python") < 0 ) {
      System.out.println( name + " comes BEFORE python" );
    }
    if (downsized.compareTo("python") == 0 ) {
      System.out.println( name + "python isn't a made-up language" );
    }
    if (downsized.compareTo("python") > 0 ) {
      System.out.println( name + " comes AFTER python" );
    }

    if (downsized.compareTo("ruby") < 0 ) {
      System.out.println( name + " comes BEFORE ruby" );
    }
    if (downsized.compareTo("ruby") == 0 ) {
      System.out.println( name + "ruby isn't a made-up language" );
    }
    if (downsized.compareTo("ruby") > 0 ) {
      System.out.println( name + " comes AFTER ruby" );
    }

    if (downsized.compareTo("visualbasic") < 0 ) {
      System.out.println( name + " comes BEFORE visualbasic" );
    }
    if (downsized.compareTo("visualbasic") == 0 ) {
      System.out.println( name + "visualbasic isn't a made-up language" );
    }
    if (downsized.compareTo("visualbasic") > 0 ) {
      System.out.println( name + " comes AFTER visualbasic" );
    }

  }
}
