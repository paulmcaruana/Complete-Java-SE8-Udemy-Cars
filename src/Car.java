public class Car {
	
	String color;
	String type;
	
	{
		color = "red";
		type = "Celica";
	}
	
	// desc = This is a blue convertible Celice
	String getDescription() {
		String desc = "This is a " + color + " " + type;
		return desc;
	}
	
	// Customize Frame: newColor = blue newType = Convertable
	void customize(String newColor, String newType) 
	{
		color = newColor;
		type = newType + " " + type;
		System.out.println (getDescription());
	}
}
