package epamCourseTasks.Testing.firstTest.appliances;

public class product {
	String name;
	double cost;
	public product(){
		name="NULL";
		cost=0;
	}
	public product(String name, double cost){
		this.name=name;
		this.cost=cost;
	}
	
	public void getDataFromString(String rawTextLine) {
	}
	
	public void display() {		
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getCost() {
		return this.cost;
	}
}
