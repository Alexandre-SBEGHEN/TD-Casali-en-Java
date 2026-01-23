import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Saisie de l'entier
        int nombre;
        System.out.print("Veuillez saisir un entier : ");
        nombre = scanner.nextInt();

        //Vérification de la divisibilité
        boolean div3 = (nombre % 3 == 0);
        boolean div5 = (nombre % 5 == 0);

        //Affichage
        System.out.print("Le nombre ");
        System.out.print(nombre);
        System.out.print(" ");
        if (div3 && div5)
            System.out.println("est divisible par 3 et par 5.");
        else if (!div3 && !div5)
            System.out.println("n'est pas divisible par 3 et n'est pas divisible par 5.");
        else if (div3)
            System.out.println("est divisible par 3 mais n'est pas divisible par 5.");
        else
            System.out.println("est divisible par 5 mais n'est pas divisible par 3.");

        scanner.close();
    }
}