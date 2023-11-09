package produits;

public enum Unite {
		LITRE("l"), GRAMME("g"), KILOGRAMME("kg"), CENTILITRE("cl"), MILLILITRE("ml"), PARPIECE("pi�ce");

	String nom;
	
	private Unite(String nom) {
		this.nom=nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}
}
