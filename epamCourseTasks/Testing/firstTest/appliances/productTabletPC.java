package epamCourseTasks.Testing.firstTest.appliances;

public class productTabletPC extends product {
	// TabletPC characteristics
	double	batteryCapacity;
	double 	displayInches;
	double 	memoryROM;
	double 	flashMemory;
	String 	color;

	public productTabletPC() {
		super();
		batteryCapacity 	= 0;
		displayInches		= 0;
		memoryROM 			= 0;
		flashMemory 		= 0;
		color 				= "";
	}

	public productTabletPC(String name, 
				double cost, 
				double batteryCapacity, 
				double displayInches, 
				double memoryROM, 
				double flashMemory,
				String color) {
		super(name, cost);
		this.batteryCapacity 	= batteryCapacity;
		this.displayInches 		= displayInches;
		this.memoryROM 			= memoryROM;
		this.flashMemory 		= flashMemory;
		this.color 				= color;	
	}
	
	public void display() {
		System.out.print("Название: \t"+name+
						"\nСтоимость: \t"+cost+
						"\nЕмкость \nбатареи: \t"+batteryCapacity+
						"\nРазмер \nдисплея: \t"+displayInches+"'"+
						"\nОперативная \nпамять: \t"+memoryROM+
						"\nFlash память: \t"+flashMemory+
						"\nЦвет: \t"+color);
	}
	
//Присваивает значения из строки объекту
	public void getDataFromString(String rawTextLine) {
		super.name 			= "TabletPC";
		super.cost 			= Double.parseDouble(getValueFromString("COST", rawTextLine));
		batteryCapacity 	= Double.parseDouble(getValueFromString("BATTERY_CAPACITY", rawTextLine));
		displayInches		= Double.parseDouble(getValueFromString("DISPLAY_INCHES", rawTextLine));
		memoryROM 			= Double.parseDouble(getValueFromString("MEMORY_ROM", rawTextLine));
		flashMemory			= Double.parseDouble(getValueFromString("FLASH_MEMORY_CAPACITY", rawTextLine));
		color 				= getValueFromString("COLOR", rawTextLine);
	}
	
	//Находит, чему равна искомая характеристика прибора в строке
	public String getValueFromString(String valueName, String rawTextLine) {
		int valueIndex = rawTextLine.indexOf(valueName);
		
		return rawTextLine.substring(	valueIndex + valueName.length() + 1,
										rawTextLine.indexOf(",", valueIndex));
	}
}
