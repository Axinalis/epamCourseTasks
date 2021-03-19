package epamCourseTasks.Testing.firstTest;

import epamCourseTasks.Testing.firstTest.appliances.*;
import java.io.*;
import java.util.Scanner;

public class Program {
	static int numberOfProducts = 24;
	static product shop[] = new product[numberOfProducts];

	public static void main(String[] args) {
		try {
			getDataFromFile();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.exit(1);
		}
		//Поиск в диапазоне стоимостей
		searchMinMax(50, 100);
		
		//Поиск самого дешевого товара
		searchMin();
		
		//Поиск всех чайников
		searchName("Kettle");
		
	}

	private static void getDataFromFile() throws Exception {
		File inputFile = new File(
				"C:\\Users\\Антон\\eclipse-workspace\\Epam1\\src\\epamCourseTasks\\Testing\\firstTest",
				"appliances.txt");
		FileReader inputFileStream = new FileReader(inputFile);
		Scanner scan = new Scanner(inputFileStream);
		String bufferStr;
		String productName;

		int i = 0;
		while (scan.hasNextLine()) {
			bufferStr = scan.nextLine();
			if (bufferStr.length() > 2) {
				productName = bufferStr.substring(0, bufferStr.indexOf(':') - 1);
				switch (productName) {
				case "Iron":
					shop[i] = new productIron();
					break;
				case "Laptop":
					shop[i] = new productLaptop();
					break;
				case "Oven":
					shop[i] = new productOven();
					break;
				case "Refrigerator":
					shop[i] = new productRefrigerator();
					break;
				case "Speakers":
					shop[i] = new productSpeakers();
					break;
				case "TabletPC":
					shop[i] = new productTabletPC();
					break;
				case "VacuumCleaner":
					shop[i] = new productVacuumCleaner();
					break;
				case "Kettle":
					shop[i] = new productKettle();
					break;
				}
				shop[i].getDataFromString(bufferStr);
				i++;
			}
		}
		inputFileStream.close();
		scan.close();
	}

	public static void searchMinMax(double min, double max) {
		System.out.println("Товары с ценой от " + min + " до " + max + ":\n");
		System.out.println("___________________________________\n");

		for (int i = 0; i < numberOfProducts; i++) {
			if (shop[i].getCost() >= min && shop[i].getCost() <= max) {
				shop[i].display();
				System.out.println("\n");
			}
		}

		System.out.println("\\__________________________________/\n");
	}

	public static void searchMin() {
		double minimum = shop[0].getCost();
		int index = 0;

		for (int i = 0; i < numberOfProducts; i++) {
			if (shop[i].getCost() < minimum) {
				minimum = shop[i].getCost();
				index = i;
			}
		}

		System.out.println("Самый дешевый товар:\n");
		System.out.println("___________________________________\n");
		shop[index].display();
		System.out.println("\n\\__________________________________/\n");
	}

	public static void searchName(String productName) {
		System.out.println("Товары по запросу "+productName+":\n");
		System.out.println("___________________________________\n");
		
		for (int i = 0; i < numberOfProducts; i++) {
			if (shop[i].getName() == productName) {
				shop[i].display();
				System.out.println("\n");
			}
		}

		System.out.println("\n\\__________________________________/\n");
	}
}
