package tp3exosYaip4;

public class Dog extends Mammal{
	public Dog(String name) {
		super(name);
	}
	
	public void greets() {
        System.out.println("Woof");
    }
	public void greets(Dog another) {
        System.out.println("Woooof");
    }

	@Override
	public String toString() {
		return "Dog : " + super.toString();
	}
	public static void main(String[] args) {
		Dog dog1 = new Dog ("michel");
		Dog dog2 = new Dog ("miclael");
		dog1.greets();
		dog1.greets(dog2);
		System.out.println(dog1.toString());
	}

}

