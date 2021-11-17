import java.util.Scanner;

public class Modulo {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zahl 1: ");
        int eingabe1 = scanner.nextInt();

        System.out.println("Zahl 2: ");
        int eingabe2 = scanner.nextInt();

        int ergebnis = eingabe1 - (eingabe2*(eingabe1/eingabe2));

        System.out.println(ergebnis);

        scanner.close();
    }

}