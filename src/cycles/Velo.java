package cycles;

import java.util.Random;

public class Velo {
	private static double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea = new Random();
	
	public double getDefaut_Braquet () {
		return DEFAUT_BRAQUET;
	}
	public void setDefaut_Braquet (double DEFAUT_BRAQUET ) {
		Velo.DEFAUT_BRAQUET = DEFAUT_BRAQUET;
	}
	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	public Velo(double braquet) {
		this.braquet = braquet;
	}
	public Velo() {
		braquet = DEFAUT_BRAQUET;
	}
	public Random getGenAlea() {
		return genAlea;
	}
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	public double getBraquet() {
		return braquet;
	}
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	public double getDiamRoue() {
		return diamRoue;
	}
	public void setDiamRoue (double diamRoue) {
		this.diamRoue = diamRoue;
	}
	@Override
	public String toString() {
		return "Velo [ braquet=" + braquet + ",diamRoue =" + diamRoue +"]"; 
	}
	public double getPuissance (double frequenceCoupsDePedale ) {
		return frequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
	}
	
	public static void main(String[] args) {
		Velo V1 = new Velo(20.0,15.0);
		System.out.println(V1);
		System.out.println(V1.getDiamRoue());
		System.out.println(V1.getBraquet());
		System.out.println(V1.toString());
		System.out.println(V1.getPuissance(90));
	}
}
