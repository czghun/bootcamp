package webinár;

public class NegativeErrorException extends Exception {

  public NegativeErrorException() {
    // System.out.println("Sajnos nulla vagy negatív értéket nem fogadhatok
    // el!");
  }

  public String toString() {
    return "A megadott érték nem lehet nulla vagy negatív értékű!\n";
  }
}
