package multithreadings;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryManagerMXBean;
import java.lang.management.MemoryUsage;

public class DeamonYeildJoinQue extends Thread {

	private static boolean checkDatabase() {
		// Simulate DB health
		return true;
	}

	private static boolean checkExternalService() {
		// Simulate external service health
		return true;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
		// Thread.yield();
	}

	public synchronized void display() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " acquiring lock.");
		for (int i = 1; i <= 10; i++) {
			System.out.println(threadName + ":" + i);
		}
		Thread.yield();
		System.out.println(threadName + " relesing lock.");
	}

	synchronized void test() {
		Thread worker = new Thread(() -> {
			System.out.println("Worker started.");
		});

		worker.start();

		try {
			worker.join(); // Does NOT release lock of test()
		} catch (InterruptedException e) {
		}

		System.out.println("Lock still held by main thread.");
	}

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Daemon Thread – Implementation Questions
		 * 
		 * Write a Java program where a daemon thread prints logs continuously and stops
		 * automatically when the main thread ends.
		 * 
		 * Implement a daemon thread used for background cleanup in an application.
		 * 
		 * Write code to demonstrate JVM shutdown when only daemon threads are running.
		 * 
		 * Implement a daemon thread that monitors memory usage.
		 * 
		 * Write a program showing that finally block may not execute in a daemon
		 * thread.
		 * 
		 * Create a daemon thread for logging and a user thread for business logic.
		 * 
		 * Implement a scenario where a daemon thread is started before user threads.
		 * 
		 * Write code to show IllegalThreadStateException when setting daemon after
		 * start().
		 * 
		 * Implement a daemon thread performing periodic health checks.
		 * 
		 * Write a program where a daemon thread creates another thread and observe its
		 * behavior.
		 * 
		 * 🔹 Thread.yield() – Implementation Questions
		 * 
		 * Write a program using Thread.yield() to switch execution between two threads.
		 * 
		 * Implement a loop where yield() is called after each iteration.
		 * 
		 * Write code to show that yield() does not guarantee thread switching.
		 * 
		 * Implement two threads with different priorities using yield().
		 * 
		 * Write a program to demonstrate yield() does not release locks.
		 * 
		 * Implement a CPU-intensive task and insert yield() to reduce starvation.
		 * 
		 * Write code where multiple threads call yield() simultaneously.
		 * 
		 * Implement a comparison program with and without yield() execution.
		 * 
		 * Write a program showing yield() behavior is OS-dependent.
		 * 
		 * Implement a real-time example where misuse of yield() causes performance
		 * issues.
		 * 
		 * 🔹 Thread.join() – Implementation Questions
		 * 
		 * Write a program where the main thread waits for a worker thread using join().
		 * 
		 * Implement multiple threads waiting on the same thread using join().
		 * 
		 * Write code using join(long millis) with timeout handling.
		 * 
		 * Implement a batch processing program using join() for synchronization.
		 * 
		 * Write a program where join() causes the main thread to block indefinitely.
		 * 
		 * Implement a scenario where join() throws InterruptedException.
		 * 
		 * Write code showing join() does not release acquired locks.
		 * 
		 * Implement thread execution order using join().
		 * 
		 * Write a program demonstrating deadlock caused by improper use of join().
		 * 
		 * Implement a comparison between busy waiting and join().
		 * 
		 * 🔹 Mixed (Daemon + Yield + Join) – Implementation Questions
		 * 
		 * Write a program where a daemon thread calls join() on a user thread.
		 * 
		 * Implement a scenario where the main thread calls join() on a daemon thread.
		 * 
		 * Write code combining yield() and join() in thread coordination.
		 * 
		 * Implement a startup task using join() and a background daemon logger.
		 * 
		 * Write a program showing JVM exits even when a daemon thread is inside join().
		 * 
		 * Implement misuse of join() that blocks application startup.
		 * 
		 * Write code where yield() is used inside a daemon thread.
		 * 
		 * Implement a real-world server-like example using daemon threads and join().
		 * 
		 * Write a program where yield() causes thread starvation.
		 * 
		 * Implement thread lifecycle tracking using daemon and user threads.
		 * 
		 */

		// Write a Java program where a daemon thread prints logs continuously and stops
		// automatically when the main thread ends.
		/*
		 * Thread t1 = new Thread(() -> { while(true) { try { Thread.sleep(100); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } System.out.println("running..."); } });
		 * 
		 * t1.setDaemon(true); t1.start();
		 * 
		 * Thread.sleep(1000);
		 */

		// Implement a daemon thread used for background cleanup in an application.
		/*
		 * Thread t1 = new Thread(() -> { while (true) { try {
		 * System.out.println("cleanup resources...."); Thread.sleep(100); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } System.out.println("running..."); } });
		 * 
		 * t1.setDaemon(true); t1.start();
		 * 
		 * Thread.sleep(1000);
		 */

		// Write code to demonstrate JVM shutdown when only daemon threads are running.
		/*
		 * Thread t1 = new Thread(() -> { while (true) { try { Thread.sleep(100); }
		 * catch (InterruptedException e) { e.printStackTrace(); }
		 * System.out.println("running..."); } });
		 * 
		 * t1.setDaemon(true); t1.start();
		 * 
		 * Thread.sleep(1000);
		 */

		// Implement a daemon thread that monitors memory usage.
		/*
		 * Thread t1 = new Thread(() -> { MemoryMXBean usage =
		 * ManagementFactory.getMemoryMXBean(); MemoryUsage heap =
		 * usage.getHeapMemoryUsage(); long usedMb = heap.getUsed(); long maxMb =
		 * heap.getMax(); try { Thread.sleep(100); } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 * System.out.println(usedMb+","+maxMb); });
		 * 
		 * t1.setDaemon(true); t1.start();
		 * 
		 * Thread.sleep(1000);
		 */

		// Write a program showing that finally block may not execute in a daemon
		// thread.
		/*
		 * Thread t1 = new Thread(() -> { try { Thread.sleep(100); int n = 8 / 0 ; }
		 * catch (ArithmeticException e) { System.out.println("you are got catch.....");
		 * } catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }finally {
		 * System.out.println("Finally not going to be run..."); } });
		 * 
		 * t1.setDaemon(true); t1.start();
		 * 
		 * Thread.sleep(100);
		 */

		// Create a daemon thread for logging and a user thread for business logic.
		/*
		 * Thread t1 = new Thread(() -> { int n = 1; while(n <= 10) {
		 * System.out.println(n++); try { Thread.sleep(100); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } } }); Thread t2 = new Thread(() -> { int n = 1;
		 * while(n <= 10) { try { Thread.sleep(100); } catch (InterruptedException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); }
		 * System.out.println(n++ +"from deamon thread."); } });
		 * 
		 * t1.start(); t2.setDaemon(true); t2.start();
		 */

		// Implement a scenario where a daemon thread is started before user threads.
		/*
		 * Thread t1 = new Thread(() -> {
		 * System.out.println("I am running before user thread."); });
		 * 
		 * Thread t2 = new Thread(() -> { try { Thread.sleep(1000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } int n = 1; while(n <= 10) { System.out.println(n++); }
		 * });
		 * 
		 * t1.setDaemon(true); t1.start(); t2.start();
		 */

		// Write code to show IllegalThreadStateException when setting daemon after
		// start().
		/*
		 * Thread t1 = new Thread(() -> { while (true) { try { Thread.sleep(100); }
		 * catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } System.out.println("running..."); } });
		 * 
		 * t1.start(); t1.setDaemon(true);
		 */

		// Implement a daemon thread performing periodic health checks.
		/*
		 * Thread healthCheckDaemon = new Thread(() -> { while (true) { try { //
		 * Simulated health check boolean databaseUp = checkDatabase(); boolean
		 * serviceUp = checkExternalService();
		 * 
		 * System.out.println("❤️ Health Check | DB: " + databaseUp +
		 * " | External Service: " + serviceUp);
		 * 
		 * Thread.sleep(3000); } catch (InterruptedException e) { // Daemon thread exits
		 * quietly break; } } });
		 * 
		 * // Mark thread as daemon BEFORE starting healthCheckDaemon.setDaemon(true);
		 * healthCheckDaemon.setName("health-check-daemon"); healthCheckDaemon.start();
		 * 
		 * // Simulate application running System.out.println("Application started...");
		 * Thread.sleep(10000);
		 * 
		 * System.out.println("Application shutting down..."); // JVM exits here, daemon
		 * stops automatically
		 */

		// Write a program where a daemon thread creates another thread and observe its
		// behavior.
		/*
		 * Thread daemonParent = new Thread(() -> {
		 * 
		 * System.out.println("Daemon parent started");
		 * 
		 * Thread child = new Thread(() -> { while (true) { try {
		 * System.out.println("Child thread running..."); Thread.sleep(1000); } catch
		 * (InterruptedException e) { break; } } });
		 * 
		 * // NOTE: No setDaemon() call here child.start(); });
		 * 
		 * // Mark parent as daemon daemonParent.setDaemon(true); daemonParent.start();
		 * 
		 * System.out.println("Main thread running..."); Thread.sleep(3000);
		 * System.out.println("Main thread finished.");
		 */

		// Write a program using Thread.yield() to switch execution between two threads.
		// Implement a loop where yield() is called after each iteration.
		// Write code to show that yield() does not guarantee thread switching.
		// Implement two threads with different priorities using yield().
		// Implement a CPU-intensive task and insert yield() to reduce starvation.
		/*
		 * DeamonYeildJoinQue d1 = new DeamonYeildJoinQue(); DeamonYeildJoinQue d2 = new
		 * DeamonYeildJoinQue();
		 * 
		 * d1.setPriority(MIN_PRIORITY); d2.setPriority(MAX_PRIORITY);
		 * 
		 * d1.start(); d2.start();
		 */

		// Write a program to demonstrate yield() does not release locks.
		/*
		 * DeamonYeildJoinQue obj = new DeamonYeildJoinQue();
		 * 
		 * Thread t1 = new Thread(() -> { obj.display(); });
		 * 
		 * Thread t2 = new Thread(() -> { obj.display(); });
		 * 
		 * t1.start(); t2.start();
		 */

		// Write code where multiple threads call yield() simultaneously.
		/*
		 * DeamonYeildJoinQue obj1 = new DeamonYeildJoinQue(); DeamonYeildJoinQue obj2 =
		 * new DeamonYeildJoinQue(); DeamonYeildJoinQue obj3 = new DeamonYeildJoinQue();
		 * DeamonYeildJoinQue obj4 = new DeamonYeildJoinQue();
		 * 
		 * obj1.start(); obj2.start(); obj3.start(); obj4.start();
		 */

		// Write a program where the main thread waits for a worker thread using join().
		/*
		 * DeamonYeildJoinQue t1 = new DeamonYeildJoinQue(); DeamonYeildJoinQue t2 = new
		 * DeamonYeildJoinQue();
		 * 
		 * t1.start(); t2.start();
		 * 
		 * t1.join(); t2.join();
		 */

		// Implement multiple threads waiting on the same thread using join().
		// Worker thread
		/*
		 * Thread worker = new Thread() {
		 * 
		 * @Override public void run() { System.out.println("Worker started...");
		 * 
		 * for (int i = 1; i <= 5; i++) { try { Thread.sleep(1000); } catch
		 * (InterruptedException e) { e.printStackTrace(); }
		 * 
		 * System.out.println("Worker processing: " + i); }
		 * 
		 * System.out.println("Worker finished."); } };
		 * 
		 * // Waiting Thread 1 Thread t1 = new Thread() {
		 * 
		 * @Override public void run() { System.out.println("Thread-A waiting..."); try
		 * { worker.join(); } catch (InterruptedException e) { e.printStackTrace(); }
		 * System.out.println("Thread-A resumed."); } };
		 * 
		 * // Waiting Thread 2 Thread t2 = new Thread() {
		 * 
		 * @Override public void run() { System.out.println("Thread-B waiting..."); try
		 * { worker.join(); } catch (InterruptedException e) { e.printStackTrace(); }
		 * System.out.println("Thread-B resumed."); } };
		 * 
		 * // Waiting Thread 3 Thread t3 = new Thread() {
		 * 
		 * @Override public void run() { System.out.println("Thread-C waiting..."); try
		 * { worker.join(); } catch (InterruptedException e) { e.printStackTrace(); }
		 * System.out.println("Thread-C resumed."); } };
		 * 
		 * worker.start(); t1.start(); t2.start(); t3.start();
		 */

		// Write code using join(long millis) with timeout handling.
		/*
		 * Thread worker = new Thread(() -> { try { Thread.sleep(5000);
		 * System.out.println("Worker finished."); } catch (InterruptedException e) {
		 * e.printStackTrace(); } });
		 * 
		 * worker.start();
		 * 
		 * System.out.println("Main waiting max 2 seconds..."); worker.join(2000); //
		 * wait max 2 seconds
		 * 
		 * if (worker.isAlive()) { System.out.println("Timeout! Worker still running.");
		 * } else { System.out.println("Worker completed within time."); }
		 * 
		 * System.out.println("Main continues...");
		 */

		// Implement a batch processing program using join() for synchronization.
		/*
		 * Thread batch1 = new Thread(() -> {
		 * System.out.println("Batch 1 processing..."); });
		 * 
		 * Thread batch2 = new Thread(() -> {
		 * System.out.println("Batch 2 processing..."); });
		 * 
		 * batch1.start(); batch2.start();
		 * 
		 * batch1.join(); // Wait for batch1 batch2.join(); // Wait for batch2
		 * 
		 * System.out.println("All batches completed.");
		 */

		// Write a program where join() causes the main thread to block indefinitely.
		/*
		 * Thread infiniteWorker = new Thread(() -> { while (true) { // Never ends } });
		 * 
		 * infiniteWorker.start();
		 * 
		 * infiniteWorker.join(); // Main blocks forever
		 * 
		 * System.out.println("This will never print.");
		 */

		// Implement a scenario where join() throws InterruptedException.
		/*
		 * Thread worker = new Thread(() -> { try { Thread.sleep(3000); } catch
		 * (InterruptedException e) { } });
		 * 
		 * Thread mainThread = Thread.currentThread();
		 * 
		 * Thread interrupter = new Thread(() -> { try { Thread.sleep(1000);
		 * mainThread.interrupt(); // Interrupt main } catch (Exception e) { } });
		 * 
		 * worker.start(); interrupter.start();
		 * 
		 * try { worker.join(); } catch (InterruptedException e) {
		 * System.out.println("Main thread interrupted while waiting!"); }
		 */

		// Write code showing join() does not release acquired locks.
		/*
		 * DeamonYeildJoinQue d1 = new DeamonYeildJoinQue(); d1.test();
		 */
		
		//Implement thread execution order using join().
		/*
		 * Thread t1 = new Thread(() -> System.out.println("Step 1")); Thread t2 = new
		 * Thread(() -> System.out.println("Step 2")); Thread t3 = new Thread(() ->
		 * System.out.println("Step 3"));
		 * 
		 * t1.start(); t1.join();
		 * 
		 * t2.start(); t2.join();
		 * 
		 * t3.start(); t3.join();
		 */
		
		//Write a program demonstrating deadlock caused by improper use of join().
		/*
		 * Thread t1 = new Thread(() -> { try { Thread.currentThread().join(); } catch
		 * (InterruptedException e) {} });
		 * 
		 * t1.start();
		 */
		
		//Implement a comparison between busy waiting and join().
		/*while (worker.isAlive()) {
		    // CPU keeps checking
		}
		Consumes CPU continuously.*/
		/*✅ Proper Waiting Using join()
		worker.join();
		Thread goes to WAITING state → No CPU usage.*/
		
	}

}
