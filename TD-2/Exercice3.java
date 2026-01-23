import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Saisir le degré du polynôme
        System.out.print("Saisir le degré du polynôme : ");
        int N = input.nextInt();

        //Créer le tableau
        float[] coefs = new float[N + 1];

        //Remplir les valeurs
        for (int i = 0; i < coefs.length; ++i) {
            System.out.print("Saisir le coefficient a" + i + " : ");
            float ai = input.nextFloat();
            coefs[i] = ai;
        }

        //Saisir X
        System.out.print("Saisir la valeur de X : ");
        float X = input.nextFloat();

        //Calculer le polynôme et afficher le résultat
        float resultat = 0;
        for (int i = 0; i < coefs.length; ++i) {
            //Avec la fonction puissance
            resultat += coefs[i] * Math.pow(X, i);

            //Sans la fonction puissance
            // float XPuissanceI = 1;
            // for (int j = 0; j < i; ++j)
            //     XPuissanceI *= X;
            // resultat += coefs[i] * XPuissanceI;
        }

        System.out.println("Le polynôme vaut : " + resultat);

        input.close();
    }
}