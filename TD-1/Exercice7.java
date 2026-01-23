import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Saisie des côtés
        double a, b, c;
        System.out.print("Entrez la valeur du côté a : ");
        a = scanner.nextDouble();
        System.out.print("Entrez la valeur du côté b : ");
        b = scanner.nextDouble();
        System.out.print("Entrez la valeur du côté c : ");
        c = scanner.nextDouble();

        //Vérification et affichage
        boolean rectangle = (a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b);

        if (rectangle)
            System.out.println("Le triangle est rectangle.");
        else
            System.out.println("Le triangle n'est pas rectangle.");

        scanner.close();
    }
}