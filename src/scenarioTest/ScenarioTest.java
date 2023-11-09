package scenarioTest;
import personnages.Gaulois;
import produits.Poisson;
import produits.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal[] marche = new IEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		marche[0]=etalSanglier;
		marche[0].occuperEtal(new Gaulois("Ordralfab�tix",12), new Poisson("lundi"),10);
	
	}
	
}
