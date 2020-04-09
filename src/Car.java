public class Car {
	String color = "Green";
	String type;
	
	
	{	//initialization block
		color = "Red";
	}
	
	Car() { //constructor
		color = "Blue";
	}
	
	void start() {
		System.out.println("Get Started!");
	}

	void printDescription() {
		System.out.println("This is a " + color + " " + type);
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.printDescription();
	}
}

// In the above code, when the main() method is called the String color and type would be initialized first(both null) then
// the inline initialization of String Color giving us green.
// 
// Then it will go to the initialization block giving us color as red (because it is after the instance variables) and finally the constructor giving us blue