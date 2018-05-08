public class ArrayIntro {
  public static void main( String[] args ) {
    String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
    String[] moons = {"Luna", "Phobos", "Deimos", "Io", "Europa", "Ganymede", "Callisto", "Iapetus", "Titan", "Dione", "Hyperion", "Rhea", "Titania", "Oberon", "Triton"};

    for (String p : planets ) {
      System.out.println( p + "\t" + p.toUpperCase() );
    }

    System.out.println("\n\n");
    
    for (String m : moons ) {
      System.out.println( m + "\t" + m.toLowerCase() );
    }
  }
}
