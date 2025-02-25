package tp3exosYaip4;

import cycles.VeloElec;

public class Person {
	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = this.address;
	}
	public String toString() {
		return "Person[name = " + name + ",address = " + address + "]";
	}
	public static void main(String[] args) {
		Person V1 = new Person ("mange","Marseille bb");
		System.out.println(V1);
		
	}
}