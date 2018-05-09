import java.util.Scanner;

public class ItemNotFound {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);

    String[] heroes = {
      "Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon",
      "Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
      "Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
      "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus"
    },
    olympians = {
      "Apollo", "Aphrodite", "Ares", "Artemis",
      "Athena", "Demeter", "Dionysus", "Hades",
      "Hephaestus", "Hera", "Hermes", "Hestia",
      "Poseidon", "Zeus"
    };
    String godGuess, guess;
    int sighting;
    boolean found;

    System.out.println("Pop Quiz!");
    System.out.print("Name any *mortal* hero from Greek mythology: ");
    guess = keyboard.next();

    found = false;
    for ( String hero : heroes ) {
      if (guess.equals(hero) ) {
        System.out.println("That's one of them!");
        found = true;
      }
    }

    if (found == false) {
      System.out.println("No, "+guess+" wasn't a Greek mortal hero.");
    }

    System.out.print("Name any *Olympian* god from Greek mythology: ");
    godGuess = keyboard.next();

    sighting = 0;
    for ( String god : olympians ) {
      if (godGuess.equals(god) ) {
        System.out.println("That's one of them!");
        sighting++;
      }
    }

    if (sighting < 1 ) {
      System.out.println("No, "+godGuess+" wasn't an Olympian god.");
    }
  }
}
