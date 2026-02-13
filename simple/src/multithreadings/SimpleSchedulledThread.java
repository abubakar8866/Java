package multithreadings;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SimpleSchedulledThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first -- runnable
		//second -- initial stop
		//third -- second stop after gap
		//fourth -- timeUnit
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
		scheduledExecutorService.scheduleAtFixedRate(()->{System.out.println("running");}, 1, 2, TimeUnit.MINUTES);
	}

}
