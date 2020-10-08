package cse360assignment02;

public class AddingMachine {
	private int total;
	private String history;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	//Returns total.
	public int getTotal () {
		return total;
	}
	
	//Adds to value to total.
	public void add (int value) {
		this.total += value;
		this.history += " + " + value;
	}
	
	//Subtracts value from total.
	public void subtract (int value) {
		this.total -= value;
		this.history += " - " + value;
	}
	
	//Returns history of total.
	public String toString () {
		return this.history;
	}
	
	//Clears AddingMachine.
	public void clear() {
		this.total = 0;
		this.history = "0";
	}
}
