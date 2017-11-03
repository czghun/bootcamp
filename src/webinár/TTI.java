package webinár;

import java.util.Scanner;

public class TTI {

  public static void main(String[] args) {
    BMIcalculation();
  }

  public static void BMIcalculation() {
    float weight = 0;
    boolean optimalvalue = true;

    System.out.print("Kérem adja meg a tömegét kilogrammban(kg): ");
    Scanner s = new Scanner(System.in);

    do {
      try {
        weight = s.nextFloat();
        if (weight <= 0) {
          throw new NegativeErrorException();
        }
      } catch (NegativeErrorException e) {
        System.out.println(e.toString());
        optimalvalue = false;
      }
    } while (!optimalvalue);

    System.out.print("\nKérem adja meg a magasságát centiméterben(cm): ");
    float height = 0;

    do {
      height = s.nextFloat();
      try {

        if (height <= 0) {
          throw new NegativeErrorException();
        }
      } catch (NegativeErrorException e) {
        System.out.println(e.toString());
        optimalvalue = false;
      }
    } while (!optimalvalue);

    float bmi = (100 * 100 * weight) / (height * height);

    if (bmi <= 0) {
      System.out.println("Próbálj valós értéket megadni!");
    } else {
      System.out.print("\nA testtömeg indexed:  " + bmi + " \nAz index alapján ");
      BMIwrite(bmi);
    }

  }

  private static void BMIwrite(float bmi) {
    if (bmi < 16) {
      System.out.println("súlyosan sovány vagy!");
    } else if (bmi < 16.99) {
      System.out.println("mérsékelten sovány vagy!");
    } else if (bmi < 18.49) {
      System.out.println("enyén sovány vagy!");
    } else if (bmi < 24.99) {
      System.out.println("normális a testtömeged!");
    } else if (bmi < 29.99) {
      System.out.println("túlsúlyos vagy!");
    } else if (bmi < 34.99) {
      System.out.println("I. fokú elhízottsági kategóriába esel!");
    } else if (bmi < 39.99) {
      System.out.println("II. fokú elhízottsági kategóriába esel!");
    } else {
      System.out.println("III. fokú (súlyos) elhízottsági kategóriába esel!");
    }
  }

}
