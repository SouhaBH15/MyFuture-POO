
public class Produit {
    private String reference;
    private String designation;
    private double prixHT;
    private int quantiteStock;

    // Constructeur
    public Produit(String reference, String designation,
                   double prixHT, int quantiteStock) {
        this.reference = reference;
        this.designation = designation;
        this.prixHT = prixHT;
        this.quantiteStock = quantiteStock;
    }

    // Getters
    public String getReference() {
        return reference;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    // Setters
    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    // Calculer la valeur du stock
    public double calculerValeurStock() {
        return prixHT * quantiteStock;
    }

    // Appliquer une remise
    public void appliquerRemise(double pourcentage) {
        if (pourcentage < 0 || pourcentage > 100) {
            System.out.println("Pourcentage invalide !");
            return;
        }

        prixHT = prixHT - (prixHT * pourcentage / 100);
    }

    // Afficher les informations
    public void afficher() {
        System.out.println("Référence       : " + reference);
        System.out.println("Désignation     : " + designation);
        System.out.println("Prix HT         : " + prixHT);
        System.out.println("Quantité        : " + quantiteStock);
        System.out.println("Valeur du stock : " + calculerValeurStock());
    }
}
