import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner le prix : ");
        double prix = sc.nextDouble();

        System.out.print("Donner la quantité : ");
        int qte = sc.nextInt();

        Produit p = new Produit("P01", "Clavier", prix, qte);

        System.out.println("La valeur du stock est : " + p.calculerValeurStock());

        System.out.print("Donner le pourcentage de remise : ");
        double remise = sc.nextDouble();

        p.appliquerRemise(remise);

        System.out.println("Nouveau prix HT : " + p.getPrixHT());
        System.out.println("Nouvelle valeur du stock : " + p.calculerValeurStock());
        sc.close();
    }
}