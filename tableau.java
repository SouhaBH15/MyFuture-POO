import java.util.Scanner;

public class tableau{
   public static void main (String[] args) {
        double[] moyenne ={10.50,11.50,14};
        System.out.println("affichage elements tableau");
        for(int i=0;i<3;i++){
            System.out.println(moyenne[i]);
        }
        System.out.println(moyenne.length);

         for (int i = 0; i < moyenne.length; i++) {
            System.out.println(moyenne[i]);
        }

        System.out.println("Taille du tableau : " + moyenne.length);

        Scanner sc = new Scanner(System.in);

        double[] notes = new double[3];

        for (int i = 0; i < notes.length; i++) {
            System.out.print("Entrez le reel numero " + (i + 1) + " : ");
            notes[i] = sc.nextDouble();
        }

        System.out.println("Valeurs saisies :");

        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i]);
        }

        sc.close();
}

    }
    

