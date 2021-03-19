package epamCourseTasks.Testing.firstTest.appliances;

public class productOven extends product {
	// Oven characteristics
	double 	powerConsumption;
	double 	weight;
	double 	capacity;
	double 	depth;
	double 	height;
	double	width;

	public productOven() {
		super();
		powerConsumption 	= 0;
		weight 				= 0;
		capacity 			= 0;
		depth 				= 0;
		height 				= 0;
		width				= 0;
	}

	public productOven(String name, 
				double cost, 
				double powerConsumption, 
				double weight, 
				double capacity, 
				double depth,
				double height,
				double width) {
		super(name, cost);
		this.powerConsumption 	= powerConsumption;
		this.weight 			= weight;
		this.capacity 			= capacity;
		this.depth 				= depth;
		this.height 			= height;
		this.width				= width;
	}
	
	public void display() {
		System.out.print("Название: \t"+name+
						"\nСтоимость: \t"+cost+
						"\nЭнерго-\nпотребление: \t"+powerConsumption+
						"\nВес: \t"+weight+
						"\nВместимость: \t"+capacity+
						"\nГлубина: \t"+depth+
						"\nВысота: \t"+height+
						"\nШирина: \t"+width);
	}
	
	//Присваивает значения из строки объекту
	public void getDataFromString(String rawTextLine) {
		super.name 			= "Oven";
		super.cost 			= Double.parseDouble(getValueFromString("COST", rawTextLine));
		powerConsumption 	= Double.parseDouble(getValueFromString("POWER_CONSUMPTION", rawTextLine));
		weight 				= Double.parseDouble(getValueFromString("WEIGHT", rawTextLine));
		capacity 			= Double.parseDouble(getValueFromString("CAPACITY", rawTextLine));
		depth 				= Double.parseDouble(getValueFromString("DEPTH", rawTextLine));
		height 				= Double.parseDouble(getValueFromString("HEIGHT", rawTextLine));
		width 				= Double.parseDouble(getValueFromString("WIDTH", rawTextLine));
	}
	
	//Находит, чему равно искомое значение в строке
	public String getValueFromString(String valueName, String rawTextLine) {
		int valueIndex = rawTextLine.indexOf(valueName);
		
		return rawTextLine.substring(	valueIndex + valueName.length() + 1,
										rawTextLine.indexOf(",", valueIndex));
	}
}
