package tp3exosYaip4;

public class Cat extends Mammal{
	public Cat(String name) {
		super(name);
	}
	
	public void greets() {
        System.out.println("Meow");
    }

	@Override
	public String toString() {
		return "cat : " + super.toString();
	}
	public static void main(String[] args) {
		Cat V2 = new Cat ("michel");
		V2.
		System.out.println(V2.toString());
	}

}
