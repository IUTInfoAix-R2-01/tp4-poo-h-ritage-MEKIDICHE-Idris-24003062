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
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String toString() {
		return "Strudent[Person[name = " + name + ",address" + address + ",program" + program + ",year" + year + "fee" + fee "]";

	}
}
