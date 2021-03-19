package epamCourseTasks.Testing.firstTest.appliances;

public class productLaptop extends product {
	// Laptop characteristics
	double	batteryCapacity;
	String 	OS;
	double 	memoryROM;
	double 	systemMemory;
	double 	CPU;
	double	displayInches;

	public productLaptop() {
		super();
		batteryCapacity 	= 0;
		OS					= "";
		memoryROM 			= 0;
		systemMemory 		= 0;
		CPU 				= 0;
		displayInches		= 0;
	}

	public productLaptop(String name, 
				double cost, 
				double batteryCapacity, 
				String OS, 
				double memoryROM, 
				double systemMemory,
				double CPU,
				double displayInches) {
		super(name, cost);
		this.batteryCapacity 	= batteryCapacity;
		this.OS 				= OS;
		this.memoryROM 			= memoryROM;
		this.systemMemory 		= systemMemory;
		this.CPU 				= CPU;	
		this.displayInches		= displayInches;
	}
	
	public void display() {
		System.out.print("Название: \t"+name+
						"\nСтоимость: \t"+cost+
						"\nЕмкость \nбатареи: \t"+batteryCapacity+
						"\nОперационная \nсистема: \t"+OS+
						"\nОперативная \nпамять: \t"+memoryROM+
						"\nСистемная \nпамять: \t"+systemMemory+
						"\nЧастота \nпроцессора \n(Ггц): \t"+CPU+
						"\nРазмер \nдисплея: \t"+displayInches+"'");
	}
	
	//Присваивает значения из строки объекту
	public void getDataFromString(String rawTextLine) {
		super.name 			= "Laptop";
		super.cost 			= Double.parseDouble(getValueFromString("COST", rawTextLine));
		batteryCapacity 	= Double.parseDouble(getValueFromString("BATTERY_CAPACITY", rawTextLine));
		OS 					= getValueFromString("OP_SYSTEM", rawTextLine);
		memoryROM 			= Double.parseDouble(getValueFromString("MEMORY_ROM", rawTextLine));
		systemMemory 		= Double.parseDouble(getValueFromString("SYSTEM_MEMORY", rawTextLine));
		CPU 				= Double.parseDouble(getValueFromString("CPU", rawTextLine));
		displayInches		= Double.parseDouble(getValueFromString("DISPLAY_INCHES", rawTextLine));
	}
	
	//Находит, чему равно искомое значение в строке
	public String getValueFromString(String valueName, String rawTextLine) {
		int valueIndex = rawTextLine.indexOf(valueName);
		
		return rawTextLine.substring(	valueIndex + valueName.length() + 1,
										rawTextLine.indexOf(",", valueIndex));
	}	
}
