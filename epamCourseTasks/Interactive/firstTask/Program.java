package epamCourseTasks.Interactive.firstTask;

import static java.lang.System.out;

import static java.lang.Math.*;

public class Program {
	public static void main(String[] args) {
		int n = 29;
		// 1 Задание
		out.println(task1(n) + " - Первая цифра квадрата числа " + n);
		// 5 задание
		out.println(task5(6));
		// 6 задание
		task6(4500).out();
		// 10 задание
		funTable table1;
		table1 = task10(1, 10, n);
		out.println();
		for (int i = 0; i < n; i++) {
			out.println("x=" + table1.xes[i] + "	y=" + table1.yes[i]);
		}
		//Остальные в проверке не нуждаются, там ошибиться невозможно
	}

	public static int task1(int x) {
		int squareX = x * x;
		while (squareX >= 10) {
			squareX %= 10;
		}
		return squareX;
	}

	public static int task2(int month, int year) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else {
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				return 30;
			} else {
				if (year % 4 == 0) {
					return 29;
				} else {
					return 28;
				}
			}
		}
	}

	public static boolean task4(int A, int B, int C, int D) {
		int count = 0;
		if (A % 2 == 0)
			count++;
		if (B % 2 == 0)
			count++;
		if (C % 2 == 0)
			count++;
		if (D % 2 == 0)
			count++;
		if (count >= 2) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean task5(int x) {
		int derSum = 1, bufX = x;
		for (int i = 2; i < bufX / 2 + 1; i++) {
			if (x % i == 0) {
				x /= i;
				derSum += i;
				i--;
			}
			if (x < i) {
				break;
			}
		}
		return derSum == bufX;
	}

	public static fullTime task6(int seconds) {
		fullTime time = new fullTime();
		time.seconds = seconds % 60;
		seconds /= 60;
		time.minutes = seconds % 60;
		seconds /= 60;
		time.hours = seconds;
		return time;
	}

	public static int task7(double x1, double x2, double y1, double y2) {
		if (sqrt(x1 * x1 + y1 * y1) < sqrt(x2 * x2 + y2 * y2)) {
			return 1;
		} else {
			return 2;
		}
	}

	public static double task8(double x) {
		if (x < 3) {
			return (1 / (x * x * x - 6));
		} else {
			return (-x * x + 3 * x + 9);
		}
	}

	public static double task9(double radius, char typeOfValue) {
		if (typeOfValue == 'P') {
			return 2 * PI * radius;
		} else {
			if (typeOfValue == 'S') {
				return PI * radius * radius;
			} else {
				out.println("Wrong type of operation");
				return 0;
			}
		}
	}

	static class func {
		public static double sinPlusCos(double x) {
			return (Math.sin(x) + 10 * Math.cos(x / 10));
		}
	}

	public static funTable task10(double a, double b, int numberOfSteps) {
		funTable table1 = new funTable(numberOfSteps);
		double oneStep = Math.abs((a - b) / numberOfSteps);

		for (double i = a, j = 0; i <= b; i += oneStep, j++) {
			table1.xes[(int) j] = i;
			table1.yes[(int) j] = func.sinPlusCos(i);
		}
		return table1;
	}
}
