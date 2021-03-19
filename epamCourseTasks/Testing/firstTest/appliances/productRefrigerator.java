package epamCourseTasks.Testing.firstTest.appliances;

public class productRefrigerator extends product {
	// Refrigerator characteristics
	double	powerConsumption;
	double 	weight;
	double 	freezerCapacity;
	double 	overallCapacity;
	double 	height;
	double	width;

	public productRefrigerator() {
		super();
		powerConsumption 	= 0;
		weight				= 0;
		freezerCapacity 	= 0;
		overallCapacity 	= 0;
		height 				= 0;
		width				= 0;
	}

	public productRefrigerator(String name, 
						double cost, 
						double powerConsumption, 
						double weight, 
						double freezerCapacity, 
						double overallCapacity,
						double height,
						double width) {
		super(name, cost);
		this.powerConsumption 	= powerConsumption;
		this.weight 			= weight;
		this.freezerCapacity 	= freezerCapacity;
		this.overallCapacity 	= overallCapacity;
		this.height 			= height;	
		this.width				= width;
	}
	
	public void display() {
		System.out.print("Название: \t"+name+
						"\nСтоимость: \t"+cost+
						"\nЭнерго-\nпотребление: \t"+powerConsumption+
						"\nВес: \t"+weight+
						"\nВместимость \nморозильника: \t"+freezerCapacity+
						"\nПолная \nвместисмость: \t"+overallCapacity+
						"\nВысота: \t"+height+
						"\nШирина: \t"+width);
	}
	
//Присваивает значения из строки объекту
	public void getDataFromString(String rawTextLine) {
		super.name 			= "Refrigerator";
		super.cost 			= Double.parseDouble(getValueFromString("COST", rawTextLine));
		powerConsumption 	= Double.parseDouble(getValueFromString("POWER_CONSUMPTION", rawTextLine));
		weight 				= Double.parseDouble(getValueFromString("WEIGHT", rawTextLine));
		freezerCapacity 	= Double.parseDouble(getValueFromString("FREEZER_CAPACITY", rawTextLine));
		overallCapacity		= Double.parseDouble(getValueFromString("OVERALL_CAPACITY", rawTextLine));
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
