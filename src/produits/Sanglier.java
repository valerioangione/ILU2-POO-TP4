package produits;
import personnages.Gaulois;

public class Sanglier extends Produit{
	private int poids;
	private Gaulois chasseur;
	
	public Sanglier(int poids, Gaulois chasseur) {
		super.nom = "sanglier";
		super.unite = Unite.KILOGRAMME;
		this.poids = poids;
		this.chasseur = chasseur;
	}
	

	@Override
	public String descriptionProduit(Produit produit) {
		return (nom+" de " + poids + " " + unite.toString() + " chassé par " + chasseur);	
	}
}
