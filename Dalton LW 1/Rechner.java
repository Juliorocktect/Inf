import java.util.Random;
import java.util.Scanner;

public class Rechner {
  public static void main(String[] args) {
    Random rnd = new Random();
    int random = rnd.nextInt(99);
    int randomZwei = rnd.nextInt(99);
    System.out.println(random);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Addire" + random + "+" + randomZwei);
    int response = scanner.nextInt();
    if (random+randomZwei == response){
      System.out.println("Richtig");
    }
    else {
      System.out.println("Falsch");
    }
    scanner.close();
  }
}
