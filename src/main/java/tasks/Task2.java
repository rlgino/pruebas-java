package tasks;

import java.util.Timer;
import java.util.TimerTask;

public class Task2 {
	public static void main(String[] args) {
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println("Hello again!!!");
			}
		};
		
		Timer timer = new Timer();
		long delay = 2;
		long intevalPeriod = 3 * 1000;
		
		timer.scheduleAtFixedRate(task, delay, intevalPeriod);
		System.out.println("Hello world!");
	}
}
