import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Saisie des coefficients et de x
        double a, b, c, x, resultat;

        System.out.print("Entrez la valeur du coefficient a : ");
        a = scanner.nextDouble();

        System.out.print("Entrez la valeur du coefficient b : ");
        b = scanner.nextDouble();

        System.out.print("Entrez la valeur du coefficient c : ");
        c = scanner.nextDouble();

        System.out.print("Entrez la valeur de x : ");
        x = scanner.nextDouble();

        //Affichage du résultat
        resultat = a * x * x + b * x + c;
        System.out.print("Le résultat du polynôme vaut : ");
        System.out.println(resultat);

        scanner.close();
    }
}