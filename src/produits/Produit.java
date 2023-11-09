package produits;

public abstract class Produit {
	protected String nom;
	protected Unite unite;
	
	public String getNom() {
		return this.nom;
	}
	
	public abstract String descriptionProduit(Produit produit);

}
