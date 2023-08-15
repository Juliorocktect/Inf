import java.util.ArrayList;
import java.util.List;

/*
 * A1)
 * Bei x++ wird die Variable gleich sich selber gesetzt, aber vorher noch um eins addiert
 * A4)
 * In der Hauptfunktion wird als erstes eine Variable x mit dem datentyp int definiert und in der Zeile
 * dannach wird der varible der wert 10 zugewiesen.
 * dann kommt eine while schleife, welche ausgeführt solange true der Wert ist.
 * solange x größer als 0 ist wird die schleife ausgeführt
 * dann wird x ausgegeben
 * und zum schluss wird x - 3 gerechnet solange die schleife ausgefürht wird
 */ 
public class Main {
  public static void aZwei() {
    for (int i = 0; i <= 100; i++) {
      System.out.println(i);
    }
  }

  public static void aDreiEins() {
    for (int i = 0; i <= 100; i++) {
      if (i % 3 == 0) {
        System.out.println(i + "Ist durch drei teilbar");
      }
    }
  }

  public static void aDreiZwei() {
    for (int i = 0; i <= 100; i++) {
      if (i % 5 == 0 && i % 4 != 0) {
        System.out.println(i + " Ist durch 5 teilbar aber nicht durch 4");
      }
    }
  }

  public static boolean isDivisionPossible(int number, int secondNumber) {
    return (number % secondNumber == 0 && number != secondNumber);
  }

  public static void aDreiDrei() {
    for (int i = 0; i <= 100; i++) {
      boolean stat = true;
      for (int j = 2; j <= 100; j++) {
        if (isDivisionPossible(i, j)) {
          stat = false;
        }
      }
      if (stat) {
        System.out.println(i + " Ist eine Primzahl");
      }
    }
  }
  static void aFuenf(){
    int i = 0;
    while (i <= 100){
      System.out.println(i);
      i++;
    }
    int j = 0;
    while (j <= 100) {
      if (i % 5 == 0 && i % 4 != 0) {
        System.out.println(i + " Ist durch 5 teilbar aber nicht durch 4");
      }
      j++;
    }
    int k = 0;
    while (k <= 100) {
      int l = 2;
      boolean stat = true;
      while (l <= 100) {
        if (isDivisionPossible(k, l)) {
          stat = false;
        }
      }
      if (stat) {
        System.out.println(i + " Ist eine Primzahl");
      }
    }

  }



  public static void main(String[] args) {
    aFuenf();

  }
}
