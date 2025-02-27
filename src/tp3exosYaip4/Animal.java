package tp3exosYaip4;

public class Animal {
	private String name;
	public Animal (String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Animal: " + name;
	}
	public static void main(String[] args) {
		Animal V1 = new Animal ("michel");
		System.out.println(V1);
		
	}
}
