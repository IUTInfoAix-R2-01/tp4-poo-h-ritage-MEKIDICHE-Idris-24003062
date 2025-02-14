package tp3exosYaip4;

public class Student extends Person{
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		this.name = name;
		this.address = address;
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
}
