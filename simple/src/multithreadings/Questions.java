package multithreadings;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;

public class Questions {
	
	int n = 0;
	
	volatile static boolean flag = true;
	volatile static int count = 100;
	
	static final Object lock1 = new Object();
    static final Object lock2 = new Object();

	synchronized void display() {
		System.out.println(Thread.currentThread().getName()+" entered show...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " leaving show()");
	}
	
	static synchronized void display2() {
        System.out.println(Thread.currentThread().getName() + " entered display()");
        try { Thread.sleep(2000); } catch (Exception e) {}
        System.out.println(Thread.currentThread().getName() + " leaving display()");
    }
	
	public synchronized void test() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " waiting...");
        wait();
        System.out.println(Thread.currentThread().getName() + " resumed");
    }
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		  Thread Basics

			Create a thread and set its name and priority.
			
			Put one thread to sleep and observe its state from another thread.
			
			Check whether a thread is alive before and after execution.
			
			Interrupt a child thread from the main thread.
		 */
		
		//Create a thread and set its name and priority.
//		Thread t1 = new Thread();
//		t1.setName("t1");
//		t1.setPriority(1);
		
		/*
		Priority Level	Value	Meaning
		MIN_PRIORITY	1	Lowest priority
						2	
						3	
						4	
		NORM_PRIORITY	5	Default priority
						6	
						7	
						8	
						9	
		MAX_PRIORITY	10	Highest priority
		*/
		
//		Put one thread to sleep and observe its state from another thread.
//		Thread t1 = new Thread(() -> {
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				
//			}
//		});
//		
//		t1.start();
//		
//		Thread.sleep(500);
//		
//		System.out.println(t1.getState());
		
		
//		Check whether a thread is alive before and after execution.		
//		Thread t1 = new Thread(() -> {
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		});
//		
//		t1.start();
//		
//		System.out.println(t1.isAlive());
//		
//		Thread.sleep(3000);
//		
//		System.out.println(t1.isAlive());
		
//		Interrupt a child thread from the main thread.
//		Thread t1 = new Thread(() -> {
//			for (int i = 0; i <= 5; i++) {
//				try {
//					Thread.sleep(1000);
//					System.out.println(i);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					System.out.println(Thread.currentThread().getName()+" is interrupted");
//					break;
//				}
//			}
//		});
//		t1.start();
//		Thread.sleep(2500);
//		t1.interrupt();
		
		/*
		Race Condition

		Increment a shared counter from multiple threads and observe incorrect output.
		
		Write a bank account withdrawal scenario that results in a race condition.
		
		Let two threads add data to the same list and observe the issue.
		
		Is race condition possible without a shared variable? Prove it with code.

		*/
		
		//Increment a shared counter from multiple threads and observe incorrect output.
//		Questions q = new Questions();
//		Thread t1 = new Thread(() -> {
//			for (int i = 0; i < 1000; i++) {
//				q.n++;
//			}
//			System.out.println("After t1: " + q.n);
//		});
//		Thread t2 = new Thread(() -> {
//			for (int i = 0; i < 1000; i++) {
//				q.n++;
//			}
//			System.out.println("After t2: " + q.n);
//		});
//		t1.start();
//		t2.start();
		
		//Write a bank account withdrawal scenario that results in a race condition.
//		BankAccount bob = new BankAccount();
//		
//		Thread t1 = new Thread(() -> {
//			try {
//				bob.withdraw(800);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		},"user-1");
//		
//		Thread t2 = new Thread(() -> {
//			try {
//				bob.withdraw(800);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		},"user-2");
//		
//		t1.start();
//		t2.start();
		
		//Let two threads add data to the same list and observe the issue.
//		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		
//		Thread t1 = new Thread(() -> {
//			arrayList.add(1);
//			arrayList.add(3);
//		});
//		
//		Thread t2 = new Thread(() -> {
//			arrayList.add(2);
//		});
//		
//		t1.start();
//		t2.start();
//		
//		System.out.println(arrayList);
		
		//Is race condition possible without a shared variable? Prove it with code.
//		No. Race condition is NOT possible without shared mutable state.
//
//		Because:
//
//		A race condition requires:
//
//		Multiple threads
//
//		Shared resource
//
//		At least one thread modifying it
//
//		If nothing is shared → nothing to race on.
		
		/*
		Fix a race condition program using synchronization.

		Write a thread-safe counter using a synchronized method.
		
		Use a synchronized block to lock only part of the code.
		
		Apply synchronization on the wrong object and observe the issue.
		*/
		
//		Questions q = new Questions();
//		Thread t1 = new Thread(() -> {
//			synchronized (q) {
//				for (int i = 0; i < 1000; i++) {
//					q.n++;
//				}
//				System.out.println("After t1: " + q.n);
//			}
//		});
//		Thread t2 = new Thread(() -> {
//			synchronized (q) {
//				for (int i = 0; i < 1000; i++) {
//					q.n++;
//				}
//				System.out.println("After t2: " + q.n);
//			}
//		});
//		t1.start();
//		t2.start();
		
		/*
		Object Lock vs Class Lock

		Run synchronized methods on two different objects of the same class.
		
		Write a static synchronized method and observe lock behavior.
		
		Demonstrate how object lock and class lock work together.
		
		Observe the impact of static synchronized methods when multiple objects exist.
		*/
		
//		Questions q1 = new Questions();
//		Questions q2 = new Questions();
//		
//		Thread t1 = new Thread(() -> q1.display());
//		Thread t2 = new Thread(() -> q2.display());
//		
//		Thread t1 = new Thread(() -> q1.display2());
//		Thread t2 = new Thread(() -> q2.display2());
//		
//		Thread t1 = new Thread(() -> q1.display());
//		Thread t2 = new Thread(() -> q2.display2());
//		Thread t3 = new Thread(() -> q2.display());
//		Thread t4 = new Thread(() -> q2.display2());
//		
//		t1.start();
//		//t3.start();
//		t2.start();
//		//t4.start();
		
		/*
		Deadlock

		Create a deadlock using two threads and two resources.
		
		Write a program where threads wait forever due to deadlock.
		
		Write code to avoid deadlock.
		
		Explain or implement an approach to detect deadlock (code-level).

		*/
				
//		Thread t1 = new Thread(() -> {
//			synchronized (lock1) {
//				System.out.println("t1 acquiring lock1");
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				synchronized (lock2) {
//					System.out.println("t1 acquiring lock2");
//				}
//			}
//		});
//		
//		Thread t2 = new Thread(() -> {
//			synchronized (lock2) {
//				System.out.println("t2 acquiring lock2");
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				synchronized (lock1) {
//					System.out.println("t2 acquiring lock2");
//				}
//			}
//		});
//		
//		t1.start();
//		t2.start();
//		
//		ThreadMXBean bean = ManagementFactory.getThreadMXBean();
//
//        while (true) {
//            long[] threadIds = bean.findDeadlockedThreads();
//
//            if (threadIds != null) {
//                ThreadInfo[] infos = bean.getThreadInfo(threadIds);
//                System.out.println("Deadlock detected!");
//
//                for (ThreadInfo info : infos) {
//                    System.out.println(info.getThreadId()+" "+info.getThreadName()+" "+info.getThreadState());
//                }
//                break;
//            }
//
//            Thread.sleep(1000);
//        }
//		
		/*
		wait(), notify(), notifyAll()

		Implement the Producer-Consumer problem using wait() and notify().
		
		Call wait() outside a synchronized block and observe the exception.
		
		Use notify() with multiple waiting threads and observe behavior.
		
		Replace notify() with notifyAll() in the same program and compare behavior.
		
		Print the thread state after calling wait().
		 */
		
		//Implement the Producer-Consumer problem using wait() and notify().
//		Buffer buffer = new Buffer();
//
//        Thread producer = new Thread(() -> {
//            try {
//                for (int i = 1; i <= 5; i++) {
//                    buffer.produce(i);
//                    Thread.sleep(500);
//                }
//            } catch (Exception e) {}
//        });
//
//        Thread consumer = new Thread(() -> {
//            try {
//                for (int i = 1; i <= 5; i++) {
//                    buffer.consume();
//                    Thread.sleep(800);
//                }
//            } catch (Exception e) {}
//        });
//
//        producer.start();
//        consumer.start();
//		
		//Call wait() outside a synchronized block and observe the exception.
//		Object obj = new Object();
//		obj.wait();
		
		//Use notify() with multiple waiting threads and observe behavior.
//		Questions q = new Questions();
//		for (int i = 1; i <= 3; i++) {
//		    new Thread(() -> {
//		        try {
//		            q.test();
//		        } catch (Exception e) {}
//		    }, "T" + i).start();
//		}
//
//		Thread.sleep(2000);
//
//		synchronized (q) {
//		    q.notify();   // only ONE thread wakes up
//		}
		
//		//Replace notify() with notifyAll() in the same program and compare behavior.
//		synchronized (q) {
//			q.notifyAll();
//		}
		
		/*sleep()

		Use sleep() inside a synchronized block.

		Observe lock behavior while a thread is sleeping.

		When multiple threads are sleeping, observe execution order.*/
		
//		Object lock = new Object();
//
//        Runnable task = () -> {
//            synchronized (lock) {
//                System.out.println(Thread.currentThread().getName() + " got the lock");
//
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {}
//
//                System.out.println(Thread.currentThread().getName() + " finished");
//            }
//        };
//
//        Thread t1 = new Thread(task, "Thread-1");
//        Thread t2 = new Thread(task, "Thread-2");
//        Thread t3 = new Thread(task, "Thread-3");
//        Thread t4 = new Thread(task, "Thread-4");
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
		
		/*
		interrupt()

		Interrupt a sleeping thread.
		
		Interrupt a waiting thread.
		
		Stop an infinite loop thread using interrupt signal.
		
		Write a thread that ignores interrupt signals.
		*/
		
		//Interrupt a sleeping thread.
//		Thread t = new Thread(() -> {
//            try {
//                System.out.println("Thread sleeping...");
//                Thread.sleep(5000);
//                System.out.println("Thread woke up normally");
//            } catch (InterruptedException e) {
//                System.out.println("Thread interrupted while sleeping!");
//            }
//        });
//
//        t.start();
//
//        Thread.sleep(2000);
//        t.interrupt();
		
		//Interrupt a waiting thread.
//		Object lock = new Object();
//
//        Thread t = new Thread(() -> {
//            synchronized (lock) {
//                try {
//                    System.out.println("Thread waiting...");
//                    lock.wait();
//                } catch (InterruptedException e) {
//                    System.out.println("Thread interrupted while waiting!");
//                }
//            }
//        });
//
//        t.start();
//
//        Thread.sleep(2000);
//        t.interrupt();
		
		//Stop an infinite loop thread using interrupt signal.
//		Thread t = new Thread(() -> {
//            while (!Thread.currentThread().isInterrupted()) {
//                System.out.println("Running...");
//            }
//            System.out.println("Stopped by interrupt");
//        });
//
//        t.start();
//
//        Thread.sleep(2000);
//        t.interrupt();
		
		//Write a thread that ignores interrupt signals.
//		Thread t = new Thread(() -> {
//            while (true) {
//                try {
//                    Thread.sleep(1000);
//                    System.out.println("still running....");
//                } catch (InterruptedException e) {
//                    System.out.println("Interrupt received but ignored");
//                }
//            }
//        });
//
//        t.start();
//
//        Thread.sleep(2000);
//        t.interrupt();
		
		/*
		 * Write an infinite loop program without volatile and observe behavior.
		 * 
		 * Fix the same program using volatile.
		 * 
		 * Compare volatile vs synchronized behavior.
		 * 
		 * Update shared data using volatile with multiple threads.
		 */
		
		//Write an infinite loop program without volatile and observe behavior.
		// Fix the same program using volatile.
//		Thread t = new Thread(() -> {
//            while (flag) {
//                // infinite loop
//            }
//            System.out.println("Thread stopped");
//        });
//
//        t.start();
//
//        Thread.sleep(2000);
//        flag = false;   // change flag
//        System.out.println("Flag changed to false");
		
		//Compare volatile vs synchronized behavior.
		/*Feature	                volatile	synchronized
		Guarantees visibility	✅ Yes	✅ Yes
		Guarantees atomicity	❌ No	✅ Yes
		Lock required	        ❌ No	✅ Yes
		Performance	            Fast	Slower*/
		
		//Update shared data using volatile with multiple threads.
		
//		  Runnable task = () -> {
//			  for (int i = 0; i < count; i++) { 
//				  //count++; // not atomic 
//				  System.out.println("Running...");
//				  try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			  		}
//			  };
//		  
//		  
//		  Thread t1 = new Thread(task); Thread t2 = new Thread(task);
//		  
//		  t1.start(); 
//		  
//		  Thread.sleep(100);
//		  
//		  count = 10;
//		  
//		  System.out.println("Final count: " + count);
		 
		
	}

}
