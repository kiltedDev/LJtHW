import java.io.File;
import java.util.Scanner;

public class CaesarCipher {
  /**
    *Returns the characer shifted by the given number of letters.
    */
  public static char shiftLetter( char c, int n) {
    int u = c;

    if ( ! Character.isLetter(c) ) {
      return c;
    }

    u = u + n;
    if ( Character.isUpperCase(c) && u > 'Z' || Character.isLowerCase(c) && u > 'z') {
      u -= 26;
    }
    if ( Character.isUpperCase(c) && u < 'A' || Character.isLowerCase(c) && u < 'a') {
      u += 26;
    }

    return (char)u;
  }

  public static void main( String[] args)  throws Exception {
    String plaintext = "", cipher = "";
    int shift;

    Scanner keyboard = new Scanner(System.in);
    Scanner fileLooker = new Scanner(new File("some-other-words.txt"));
    while (fileLooker.hasNextLine()) {
      plaintext += fileLooker.nextLine();
    }

    System.out.println(plaintext);
    System.out.print("Shift (0-25): ");
    shift = keyboard.nextInt();

    for ( int i = 0; i<plaintext.length(); i++) {
      cipher += shiftLetter( plaintext.charAt(i), shift );
    }
    System.out.println( cipher );
  }
}
