public class Car {
	
	String color;
	String type;
	
	{
		color = "red";
		type = "Celica";
	}
	
	String getDescription() {
		String desc = "This is a " + color + " " + type;
		return desc;
	}
	
	void customize(String newColor, String newType) 
	{
		color = newColor;
		type = newType + " " + type;
		System.out.println (getDescription());
	}
}
