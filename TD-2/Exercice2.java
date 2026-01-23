import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String chaine;
        while (true) {
            System.out.print("saisir une string : ");
            chaine = input.nextLine();

            //Sortir
            if (chaine.length() == 0) break;

            System.out.println(chaine);
        }
        
        input.close();
    }
}