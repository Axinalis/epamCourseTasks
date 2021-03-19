package epamCourseTasks.Interactive.firstTask;

public class fullTime {
	public int hours, minutes, seconds;

	fullTime() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public void out() {
		System.out.print(hours + ":" + minutes + ":" + seconds);
	}
}
