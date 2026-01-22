import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Saisir l'année
        int annee;
        System.out.print("Veuillez saisir une année : ");
        annee = scanner.nextInt();

        //Vérification
        boolean bibissextile = (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);

        //Affichage
        if (bibissextile)
            System.out.println("L'année est bissextile.");
        else
            System.out.println("L'année n'est pas bissextile.");
    }
}