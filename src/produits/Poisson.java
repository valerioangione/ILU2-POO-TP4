package produits;

public class Poisson extends Produit{
	private String date;
	
	public Poisson(String date) {
		super.nom = "poisson";
		super.unite = Unite.PARPIECE;
		this.date = date;
	}

	@Override
	public String descriptionProduit(Produit produit) {
		return (nom + " pêchés " + date);
	}
}
