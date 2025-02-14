package cycles;

public class VeloElec extends Velo{
	private static double DEFAUT_FACTEUR_PUISSANCEMOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
		facteurPuissanceMoteur = coupleMoteur;
	}
	public VeloElec(double diamRoue, double coupleMoteur) {
		super(diamRoue);
		facteurPuissanceMoteur = coupleMoteur;
	}
	public VeloElec() {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	public double getDEFAUT_FACTEUR_PUISSANCEMOTEUR () {
		return DEFAUT_FACTEUR_PUISSANCEMOTEUR;
	}
	public void setDEFAUT_FACTEUR_PUISSANCEMOTEUR (double DEFAUT_FACTEUR_PUISSANCEMOTEUR ) {
		this.DEFAUT_FACTEUR_PUISSANCEMOTEUR = DEFAUT_FACTEUR_PUISSANCEMOTEUR;
	}
	public double getfacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	public void setfacteurPuissanceMoteur(double coupleMoteur) {
		facteurPuissanceMoteur = coupleMoteur;
	}
	@Override
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	@Override
	public double getPuissance(double FrequenceCoupDePedale) {
		return super.getPuissance(FrequenceCoupDePedale)*facteurPuissanceMoteur;
	}
	public static void main(String[] args) {
		VeloElec V1 = new VeloElec (20,10);
		System.out.println(V1);
		System.out.println(V1.getPuissance(20));
		System.out.println(V1.toString());
	}
}
