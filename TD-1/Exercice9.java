import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Saisie des strings
        String mot1, mot2;
        System.out.print("Veuillez saisir le premier mot : ");
        mot1 = scanner.nextLine();
        System.out.print("Veuillez saisir le second mot : ");
        mot2 = scanner.nextLine();

        //Affichage avant
        System.out.println();
        System.out.println("-- Avant la permutation --");
        System.out.print("Le premier mot vaut : ");
        System.out.println(mot1);
        System.out.print("Le second mot vaut : ");
        System.out.println(mot2);

        //Permutation
        String temp = mot2;
        mot2 = mot1;
        mot1 = temp;

        //Affichage après
        System.out.println();
        System.out.println("-- Après la permutation --");
        System.out.print("Le premier mot vaut : ");
        System.out.println(mot1);
        System.out.print("Le second mot vaut : ");
        System.out.println(mot2);
    }
}