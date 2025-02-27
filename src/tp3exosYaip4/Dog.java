package tp3exosYaip4;

public class Dog extends Mammal{
	public Dog(String name) {
		super(name);
	}
	
	public void greets() {
        System.out.println("Woof");
    }
	public void greets(Dog another)) {
        System.out.println("Woooof");
    }

	@Override
	public String toString() {
		return "Dog : " + super.toString();
	}
	public static void main(String[] args) {
		Dog V2 = new Dog ("michel");
		System.out.println(V2.toString());
	}

}
}
