import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Saisie des coefficients
        double a, b, c;

        System.out.print("Entrez la valeur du coefficient a : ");
        a = scanner.nextDouble();

        System.out.print("Entrez la valeur du coefficient b : ");
        b = scanner.nextDouble();
        
        System.out.print("Entrez la valeur du coefficient c : ");
        c = scanner.nextDouble();

        //Discriminant
        double delta = b * b - 4 * a * c;

        //Vérifier la valeur du discriminant
        if (delta == 0) {
            //Une seule solution
            double x0 = -b / (2 * a);

            System.out.println("Le polynôme admet une unique racine x0.");
            System.out.print("x0 = ");
            System.out.println(x0);
        } else if (delta > 0) {
            //Deux solution x1 et x2
            double x1, x2;
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);

            System.out.println("Le polynôme admet deux racines réelles x1 et x2.");
            System.out.print("x1 = ");
            System.out.println(x1);
            System.out.print("x2 = ");
            System.out.println(x2);
        } else {
            //Aucune solution réelle
            System.out.println("Le polynôme n'admet pas de racine réelle.");
        }

        scanner.close();
    }
}