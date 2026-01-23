import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Saisie et affichage
        System.out.print("saisir une string: ");
        String chaine = scanner.nextLine();
        System.out.println(chaine);

        scanner.close();
    }
}