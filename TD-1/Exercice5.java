import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Saisie de la taille et du poids
        double P, T;
        System.out.print("Entrez votre poids (kg) : ");
        P = scanner.nextDouble();
        System.out.print("Entrez votre taille (m) : ");
        T = scanner.nextDouble();

        //Calcul et affichage de l'IMC
        double IMC = P / (T * T);
        System.out.print("Votre IMC est de ");
        System.out.println(IMC);

        //Afficher le commentaire
        if (IMC < 25)
            System.out.println("Tout va bien.");
        else if (IMC < 30)
            System.out.println("Attention, il y a une tendance à l'obésité.");
        else
            System.out.println("Il y a une obésité certaine.");
            
    }
}