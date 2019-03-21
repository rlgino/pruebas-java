package tasks;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Task3 {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello world AGAINNN!!");
			}
		};

		ScheduledExecutorService scheduled = Executors.newSingleThreadScheduledExecutor();
		scheduled.scheduleAtFixedRate(runnable, 0, 3, TimeUnit.SECONDS);
		System.out.println("Hello world!!");
	}

}
