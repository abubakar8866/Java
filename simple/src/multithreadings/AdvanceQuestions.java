package multithreadings;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AdvanceQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Thread Pool – Practical Questions

		Why should a production system use a thread pool instead of creating threads manually?
		
		Design a thread pool for handling 10,000 concurrent API requests.
		
		What factors will you consider while deciding the thread pool size?
		
		How does ExecutorService manage thread reuse internally?
		
		What happens when all threads in a thread pool are busy?
		
		How would you design a custom ThreadPoolExecutor?
		
		What is the role of a work queue in a thread pool?
		
		How do FixedThreadPool, CachedThreadPool, and ScheduledThreadPool differ in real use cases?
		
		What happens if a task throws an exception inside a thread pool?
		
		How do you gracefully shut down a thread pool in a production system?
		
		What is task starvation and how can it occur in thread pools?
		
		How do you monitor thread pool performance in production?
		
		When should you avoid using a cached thread pool?
		
		How would you handle back-pressure using thread pools?
		
		Design a thread pool for CPU-bound vs IO-bound tasks.
		
		🔹 Thread Safety – Practical Questions
		
		What makes a class thread-safe in a real project?
		
		Design a thread-safe counter used by multiple services.
		
		What problems occur if shared mutable objects are not synchronized?
		
		When would you prefer immutability over synchronization?
		
		How does synchronized ensure thread safety internally?
		
		Difference Between Object Lock and Class Lock
		
		When can synchronization cause performance degradation?
		
		How do you make a collection thread-safe without using synchronized?
		
		How does volatile ensure visibility but not atomicity?
		
		Explain a real scenario where volatile is required.
		
		What is a race condition? Give a real-time example.
		
		How would you detect thread-safety issues in production?
		
		How does AtomicInteger provide thread safety?
		
		Difference between atomic classes and synchronized blocks.
		
		How do you ensure thread safety in a singleton class?
		
		🔹 Thread Pool + Thread Safety (Combined Scenarios)
		
		Is ExecutorService thread-safe? Why?
		
		What thread-safety issues can occur when tasks share objects inside a thread pool?
		
		How do you protect shared resources used by multiple thread-pool tasks?
		
		What happens if a non-thread-safe object is reused across threads?
		
		How do you ensure thread safety when using parallel streams?
		
		Design a thread-safe task scheduler.
		
		How do you prevent deadlocks in thread-pool-based systems?
		
		What is ThreadLocal and when is it used in real projects?
		
		How can ThreadLocal cause memory leaks in thread pools?
		
		Design a thread-safe logging system using thread pools.
		*/
		
		//Why should a production system use a thread pool instead of creating threads manually?		
		/*
		| Feature          | Manual Thread  | Thread Pool  |
		| ---------------- | -------------  | -----------  |
		| Performance      | ❌ Slow        | ✅ Fast      |
		| Resource Control | ❌ No          | ✅ Yes       |
		| Stability        | ❌ Risky       | ✅ Safe      |
		| Queue Support    | ❌ No          | ✅ Yes       |
		| Production Ready | ❌ No          | ✅ Yes       |

		*/
		
		//Design a thread pool for handling 10,000 concurrent API requests.
		/*ThreadPoolExecutor executor = new ThreadPoolExecutor(
		        80,                      // core pool size
		        200,                     // max pool size
		        60L,                     // keep-alive time
		        TimeUnit.SECONDS,
		        new ArrayBlockingQueue<>(2000),  // bounded queue
		        new ThreadPoolExecutor.CallerRunsPolicy()
		);*/
		/*
		🧮 Step 2: Decide Number of Threads
		For CPU-bound tasks:
		Threads = Number of CPU Cores		
		Example:
		8-core server → 8–16 threads max
		
		For IO-bound tasks:		
		Use this formula:		
		Threads = Cores × (1 + Wait Time / Compute Time)		
		Example:		
		8 cores		
		Compute time = 50ms		
		Wait time (DB/API) = 450ms
		
		Threads = 8 × (1 + 450/50)
		        = 8 × (1 + 9)
		        = 8 × 10
		        = 80 threads		
		
		So 80–100 threads is reasonable.
		
		Not 10,000.
		*/
		/*
		Why These Numbers?
		✅ Core Pool Size = 80		
		Based on IO-bound formula.
		
		✅ Max Pool Size = 200		
		Allows burst traffic handling.
		
		✅ Queue Size = 2000		
		Prevents memory explosion.
		
		✅ Rejection Policy = CallerRunsPolicy		
		If overloaded:		
		Request handled by calling thread		
		Slows down incoming traffic		
		Acts like backpressure		
		Better than crashing.
		*/
		
		//What factors will you consider while deciding the thread pool size?
		/*
		🔥 1️⃣ Nature of Work (Most Important)
		🧮 CPU-Bound Tasks		
		Examples:		
		Data processing		
		Encryption		
		Image processing		
		Complex calculations
		
		👉 Rule:		
		Threads ≈ Number of CPU cores (or cores + 1)
		
		
		Why?
		Because more threads → more context switching → performance drops.
		
		Example:
		8-core machine → 8–10 threads max.
		
		🌐 IO-Bound Tasks (Most Web APIs)		
		Examples:
		
		DB calls
		
		REST API calls
		
		File I/O
		
		Network calls
		
		Threads spend time waiting.
		
		👉 Use formula:
		
		Threads = Cores × (1 + Wait Time / Compute Time)
		
		
		Example:
		
		8 cores
		
		Compute = 50ms
		
		Wait = 450ms
		
		Threads = 8 × (1 + 450/50)
		        = 8 × 10
		        = 80 threads
		
		🔥 2️⃣ Number of CPU Cores
		
		Check using:
		
		Runtime.getRuntime().availableProcessors();
		
		
		More cores → more parallel execution possible.
		
		🔥 3️⃣ Memory Availability
		
		Each thread consumes:
		
		Stack memory (usually 512KB–1MB)
		
		Thread object
		
		Task overhead
		
		If you create 2000 threads:
		
		2000 × 1MB = 2GB RAM
		
		
		💥 Memory crash risk.
		
		So thread pool size must fit within heap + native memory limits.
		
		🔥 4️⃣ Response Time Requirements (SLA)
		
		If your API must respond within:
		
		100ms → need more concurrency
		
		5 seconds → fewer threads acceptable
		
		Higher concurrency improves throughput but increases context switching.
		
		Balance required.
		
		🔥 5️⃣ Blocking Dependencies
		
		Ask:
		
		How many DB connections available?
		
		External API rate limits?
		
		Redis pool size?
		
		If DB pool = 50 connections
		Thread pool = 200
		
		150 threads will just wait for DB connection 😅
		
		So:
		
		Thread Pool Size ≤ DB Connection Pool Size (for DB-heavy APIs)
		
		🔥 6️⃣ Queue Size Strategy
		
		Unbounded queue = dangerous
		
		Bounded queue = safe
		
		If:
		
		Queue too large → memory risk
		
		Queue too small → more rejections
		
		Design depends on traffic pattern.
		
		🔥 7️⃣ Traffic Pattern
		
		Steady traffic → fixed pool
		
		Burst traffic → allow max pool > core pool
		
		Highly variable → dynamic scaling
		
		🔥 8️⃣ Type of Server (Tomcat / Netty / WebFlux)
		
		Traditional (Tomcat):
		
		Thread per request
		
		Needs larger pool
		
		Reactive (Netty):
		
		Event loop model
		
		Fewer threads needed
		
		Architecture affects pool size drastically.
		
		🔥 9️⃣ Context Switching Cost
		
		Too many threads → OS overhead:
		
		Thread scheduling
		
		CPU cache misses
		
		Slower performance
		
		More threads ≠ faster system.
		
		🔥 1️⃣0️⃣ Horizontal Scaling Strategy
		
		Instead of:
		
		1 server × 500 threads ❌
		
		Better:
		
		5 servers × 100 threads ✅
		
		Always consider cluster design.
		
		🧠 Summary Table
		Factor	            Why It Matters
		CPU cores	        Defines max parallelism
		CPU vs IO	        Determines thread formula
		Memory	            Prevents OOM
		DB connections	    Avoids thread waiting
		SLA	                Impacts concurrency needs
		Queue size	        Controls overload
		Traffic pattern	    Handles burst vs steady
		Architecture	    Blocking vs reactive
		Context switching	Too many threads slow system
		Scaling strategy	Distribute load
		*/
		
		//How does ExecutorService manage thread reuse internally?
		/*
		🔹 Step 1: Task Submission

		When you call:
		
		executor.execute(task);
		
		
		The task is passed to ThreadPoolExecutor.
		
		🔹 Step 2: Check Core Pool Size
		
		If:
		
		currentThreadCount < corePoolSize
		
		
		➡ A new Worker thread is created to handle the task immediately.
		
		🔹 Step 3: Add to Queue
		
		If core threads are already busy:
		
		➡ Task is placed into the BlockingQueue (work queue).
		
		The task waits there.
		
		🔹 Step 4: Expand Beyond Core (If Needed)
		
		If:
		
		Queue is full
		
		currentThreadCount < maximumPoolSize
		
		➡ A new thread is created (beyond core size).
		
		🔹 Step 5: Thread Executes Task
		
		Each Worker thread runs something like:
		
		while (task != null || (task = getTask()) != null) {
		    task.run();
		}
		
		
		Meaning:
		
		Execute task
		
		Fetch next task from queue
		
		Repeat
		
		This loop enables thread reuse.
		
		🔹 Step 6: Waiting for New Tasks
		
		If queue is empty:
		
		➡ Thread blocks on:
		
		workQueue.take();
		
		
		It waits instead of dying.
		
		🔹 Step 7: Thread Termination
		
		Thread stops only when:
		
		Pool is shutting down
		OR
		
		Thread count > corePoolSize AND idle time > keepAliveTime
		
		Core threads usually stay alive.
		
		🔹 Step 8: Rejection (If Overloaded)
		
		If:
		
		Threads = maxPoolSize
		
		Queue = full
		
		➡ RejectionPolicy is applied.
		
		Example:
		
		AbortPolicy
		
		CallerRunsPolicy
		
		🧠 Final Flow Summary
		submit()
		   ↓
		Create thread (if needed)
		   ↓
		Else → Put task in queue
		   ↓
		Worker executes task
		   ↓
		Fetch next task from queue
		   ↓
		Repeat (reuse)
		
		🎯 One-Line Summary		
		ThreadPoolExecutor reuses threads by keeping worker threads alive in a loop, continuously fetching and executing tasks from a BlockingQueue instead of terminating after each task.
		*/
		
		//What happens when all threads in a thread pool are busy?
		/*
		🧠 What Happens When All Threads Are Busy?
		It depends on:
		
		corePoolSize
		
		maximumPoolSize
		
		BlockingQueue type
		
		Queue capacity
		
		Rejection policy
		
		🔹 Step 1: All Core Threads Are Busy
		
		When a new task comes:
		
		👉 Case 1: Queue has space
		
		The task is placed into the BlockingQueue.
		
		It waits there until a thread becomes free.
		
		✅ No thread created
		✅ Task waits safely
		
		🔹 Step 2: Queue is Full
		
		Now:
		
		All core threads busy
		
		Queue full
		
		Then:
		
		👉 If current thread count < maximumPoolSize
		
		A new thread is created (beyond core size) to handle the task.
		
		This allows burst handling.
		
		🔹 Step 3: Max Threads Also Busy
		
		Now:
		
		Threads = maximumPoolSize
		
		Queue = full
		
		System is overloaded.
		
		At this point, the RejectionPolicy is triggered.
		
		🔥 Step 4: Rejection Policy Executes
		
		Depending on configuration:
		
		1️⃣ AbortPolicy (Default)
		Throws RejectedExecutionException
		
		2️⃣ CallerRunsPolicy
		
		The calling thread executes the task.
		Slows down incoming requests (backpressure).
		
		3️⃣ DiscardPolicy
		
		Task is silently dropped.
		
		4️⃣ DiscardOldestPolicy
		
		Removes oldest task from queue and adds new one.
		
		📊 Visual Flow
		New Task Arrives
		      ↓
		Are core threads free?
		      ↓
		No
		      ↓
		Is queue full?
		      ↓
		No → Add to queue
		Yes
		      ↓
		Can create more threads (below max)?
		      ↓
		Yes → Create new thread
		No
		      ↓
		Apply RejectionPolicy
		
		🚨 Important Production Insight
		
		If you see frequent rejections:
		
		It means:
		
		Thread pool too small
		OR
		
		System overloaded
		OR
		
		Downstream service slow
		
		Never blindly increase pool size — investigate root cause.
		
		🎯 Interview-Ready Answer
		
		If interviewer asks:
		
		What happens when all threads in a thread pool are busy?
		
		You say:
		
		If all core threads are busy, new tasks are placed into the work queue. If the queue is full and the current thread count is below the maximum pool size, new threads are created. If both the maximum thread count and queue capacity are reached, the configured RejectionPolicy is applied.
		*/
		
		//How would you design a custom ThreadPoolExecutor?
		/*
		🎯 Step 1: Define Requirements

		First ask:
		
		CPU-bound or IO-bound?
		
		Expected traffic?
		
		SLA requirements?
		
		DB connection pool size?
		
		Burst traffic or steady?
		
		Assume:
		
		IO-heavy REST APIs
		
		8-core machine
		
		DB pool size = 50
		
		Moderate burst traffic
		
		🎯 Step 2: Decide Pool Size
		
		For IO-heavy workload:
		
		Threads = Cores × (1 + Wait/Compute)
		
		
		Assume:
		
		Wait = 400ms
		
		Compute = 100ms
		
		Threads = 8 × (1 + 4)
		        = 8 × 5
		        = 40
		
		
		So:
		
		corePoolSize = 40
		
		maxPoolSize = 80 (for burst handling)
		
		🎯 Step 3: Choose Proper Queue
		
		Avoid unbounded queues like:
		
		new LinkedBlockingQueue<>(); // ❌ dangerous (unbounded)
		
		
		Use bounded queue:
		
		new ArrayBlockingQueue<>(1000);
		
		
		Why?
		
		Prevents OOM
		
		Controls memory
		
		Enables backpressure
		
		🎯 Step 4: Choose Rejection Policy
		
		Default AbortPolicy may crash request.
		
		Better for APIs:
		
		new ThreadPoolExecutor.CallerRunsPolicy()
		
		
		Why?
		
		Caller thread executes task
		
		Slows down incoming traffic
		
		Natural backpressure
		
		Production-friendly.
		
		🎯 Step 5: Create Custom Executor
		ThreadPoolExecutor customExecutor =
		        new ThreadPoolExecutor(
		                40,                       // core pool size
		                80,                       // max pool size
		                60L,                      // keep-alive time
		                TimeUnit.SECONDS,
		                new ArrayBlockingQueue<>(1000),
		                new CustomThreadFactory(),
		                new ThreadPoolExecutor.CallerRunsPolicy()
		        );
		
		🎯 Step 6: Custom ThreadFactory (Important in Production)
		
		So threads have meaningful names:
		
		class CustomThreadFactory implements ThreadFactory {
		
		    private final AtomicInteger counter = new AtomicInteger(1);
		
		    @Override
		    public Thread newThread(Runnable r) {
		        Thread t = new Thread(r);
		        t.setName("api-worker-" + counter.getAndIncrement());
		        t.setDaemon(false);
		        return t;
		    }
		}
		
		
		Why?
		
		Easier debugging
		
		Better monitoring
		
		Clear logs
		
		🎯 Step 7: Override Hooks (Advanced)
		
		ThreadPoolExecutor provides hooks:
		
		protected void beforeExecute(Thread t, Runnable r)
		protected void afterExecute(Runnable r, Throwable t)
		protected void terminated()
		
		
		Example:
		
		ThreadPoolExecutor executor = new ThreadPoolExecutor(...) {
		
		    @Override
		    protected void beforeExecute(Thread t, Runnable r) {
		        System.out.println("Starting task: " + t.getName());
		    }
		
		    @Override
		    protected void afterExecute(Runnable r, Throwable t) {
		        System.out.println("Task completed");
		    }
		
		    @Override
		    protected void terminated() {
		        System.out.println("Executor terminated");
		    }
		};
		
		
		Used for:
		
		Logging
		
		Metrics
		
		Monitoring
		
		Error tracking
		
		🎯 Step 8: Graceful Shutdown
		
		Never forget this:
		
		executor.shutdown();
		
		if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
		    executor.shutdownNow();
		}
		
		
		Production systems must shutdown cleanly.
		
		🎯 Step 9: Monitoring (Very Important)
		
		Expose metrics:
		
		executor.getActiveCount();
		executor.getPoolSize();
		executor.getQueue().size();
		executor.getCompletedTaskCount();
		
		
		Integrate with:
		
		Micrometer
		
		Prometheus
		
		Grafana
		
		Backend engineers must monitor thread pools.
		
		🧠 Final Production-Ready Design Summary
		Component	    Decision
		corePoolSize	Based on IO formula
		maxPoolSize	    Handle bursts
		Queue	        Bounded (ArrayBlockingQueue)
		Rejection	    CallerRunsPolicy
		ThreadFactory	Custom named threads
		Hooks	        Override for logging/metrics
		Shutdown	    Graceful termination
		Monitoring	    Expose metrics
		
		🎯 Interview-Ready Answer
		
		If interviewer asks:
		
		How would you design a custom ThreadPoolExecutor?
		
		You say:
		
		I would first analyze workload type and compute optimal core size based on CPU cores and IO wait time. Then I’d configure a bounded queue to prevent OOM, set a maximum pool size for burst traffic, use a safe rejection policy like CallerRunsPolicy for backpressure, implement a custom ThreadFactory for better observability, override lifecycle hooks for monitoring, and ensure graceful shutdown handling.
		
		That’s a strong backend-level answer.
		*/
		
		//What is the role of a work queue in a thread pool?
		/*
		🧠 Role of Work Queue (Step-by-Step)
		🔹 1️⃣ Holds Waiting Tasks
		
		When all core threads are busy:
		
		New Task → Put into Queue
		
		🔹 2️⃣ Enables Thread Reuse
		
		Worker threads continuously do:
		
		task = queue.take();
		task.run();
		
		
		After finishing one task, they fetch the next from the queue.
		
		This enables thread reuse.
		
		🔹 3️⃣ Controls Concurrency
		
		Queue size determines:
		
		How many tasks can wait
		
		When new threads are created
		
		When rejection policy triggers
		
		It directly impacts pool behavior.
		
		🔹 4️⃣ Provides Backpressure
		
		If the queue is bounded:
		
		When full → system starts rejecting tasks
		
		Prevents memory explosion
		
		Protects JVM
		
		Unbounded queue = risky in production ⚠
		
		📊 Execution Flow with Work Queue
		submit(task)
		      ↓
		Are core threads free?
		      ↓
		No
		      ↓
		Add task to work queue
		      ↓
		Worker thread finishes current task
		      ↓
		Takes next task from queue
		      ↓
		Executes
		
		🏗 Types of Work Queues
		1️⃣ ArrayBlockingQueue (Bounded)
		
		Fixed size
		
		Predictable memory usage
		
		Good for production APIs
		
		2️⃣ LinkedBlockingQueue
		
		Can be unbounded (dangerous if not limited)
		
		Often used in fixed thread pools
		
		3️⃣ SynchronousQueue
		
		No storage
		
		Direct handoff
		
		Used in CachedThreadPool
		
		Creates threads quickly for bursts
		
		⚖ How Queue Type Changes Behavior
		Queue Type	Behavior
		Unbounded	Threads don’t grow beyond core size
		Bounded	Threads can grow until maxPoolSize
		SynchronousQueue	Creates threads aggressively
		*/

		//How do FixedThreadPool, CachedThreadPool, and ScheduledThreadPool differ in real use cases?
		/*
		| Feature        | FixedThreadPool     | CachedThreadPool    | ScheduledThreadPool  |
		| -------------- | ------------------- | ------------------- | -------------------- |
		| Thread Count   | Fixed               | Dynamic (unlimited) | Fixed                |
		| Queue Type     | Unbounded           | SynchronousQueue    | DelayedWorkQueue     |
		| Burst Handling | Limited             | Aggressive          | Not for bursts       |
		| Best For       | Stable workloads    | Short async tasks   | Scheduled tasks      |
		| Risk           | Queue memory growth | Too many threads    | Wrong usage for APIs |
		
		If interviewer asks:

		How do FixedThreadPool, CachedThreadPool, and ScheduledThreadPool differ in real use cases?
		
		You say:
		
		FixedThreadPool uses a fixed number of threads and is suitable for controlled, stable workloads. CachedThreadPool dynamically creates threads and is useful for short-lived bursty tasks but risky under heavy load. ScheduledThreadPool is designed for delayed or periodic task execution such as cron jobs and monitoring tasks.
		
		*/

		//What happens if a task throws an exception inside a thread pool?
		/*
		If the task is submitted using execute(), the exception is thrown in the worker thread and handled by the UncaughtExceptionHandler, typically printed to the console. If the task is submitted using submit(), the exception is captured inside a Future and rethrown as an ExecutionException when future.get() is called. If get() is never called, the exception may go unnoticed.
		*/
		
		//How do you gracefully shut down a thread pool in a production system?
		/*
		I first call shutdown() to stop accepting new tasks while allowing existing tasks to complete. Then I use awaitTermination() with a timeout to wait for completion. If tasks don’t finish within the timeout, I call shutdownNow() to interrupt running tasks. Additionally, I ensure tasks handle interruption properly and integrate shutdown with application lifecycle events such as JVM shutdown hooks or Spring context shutdown. 
		*/
		
		//What is task starvation and how can it occur in thread pools?
		/*
		Thread Pool (size=3)

		Task A → long running
		Task B → long running
		Task C → long running
		
		Task D → waiting
		Task E → waiting
		
		If A/B/C never release → D & E starve
		
		Task starvation occurs when some tasks never get execution time because all threads are occupied by other tasks. It can happen due to long-running blocking tasks, improper pool sizing, nested task submission with blocking calls like Future.get(), priority imbalances, or external resource bottlenecks such as limited DB connections. It can be prevented by proper pool design, avoiding blocking dependencies, using separate executors, and applying timeouts.		
		*/
		
		//How do you monitor thread pool performance in production?
		/*
		📊 Production Monitoring Checklist
		Metric	        Why
		Active Threads	Detect saturation
		Queue Size	    Detect backlog
		Completed Tasks	Throughput
		Rejection Count	Overload indicator
		Task Duration	Performance bottleneck
		CPU usage	    Context switching overhead
		Memory	        Thread stack usage
		
		I monitor active thread count, pool size, queue size, task completion rate, rejection count, and execution time. I expose these metrics using tools like Micrometer and Prometheus, visualize them in Grafana dashboards, and configure alerts for queue growth or saturation. I also monitor CPU, memory, and external dependency latency to detect bottlenecks affecting the thread pool.
		
		*/

		//When should you avoid using a cached thread pool?
		/*
		CachedThreadPool should be avoided in high-traffic or blocking workloads because it can create an unbounded number of threads, leading to memory exhaustion and excessive context switching. It is unsafe for REST APIs, database-heavy tasks, or cloud environments with resource limits. It is best suited only for short-lived, lightweight tasks in controlled environments.
		*/
		
		//How would you handle back-pressure using thread pools?
		/*
		Back-pressure means:

		When the system is overloaded, it should slow down or reject incoming work instead of crashing.
		
		🎯 Why Back-Pressure is Needed

		Without back-pressure:
		
		Requests keep coming
		
		Threads increase (or queue grows)
		
		Memory increases
		
		Latency increases
		
		Eventually → crash
		
		Back-pressure ensures:
		
		✅ System remains stable
		✅ Latency remains bounded
		✅ Failure is controlled
		
		I would use a bounded work queue to prevent unlimited memory growth, configure a reasonable maximum pool size, and apply a rejection policy such as CallerRunsPolicy to slow down task submission when the system is saturated. Additionally, I would ensure proper timeouts for blocking operations, isolate workloads into separate thread pools, and monitor queue size and rejection counts to scale appropriately.
		
		*/
		
		//Design a thread pool for CPU-bound vs IO-bound tasks.
		/*
		🔹 CPU-bound Tasks

			Heavy computation
			
			Minimal waiting
			
			Example:
			
			Image processing
			
			Encryption
			
			Sorting large datasets
			
			Data transformation
			
			Threads mostly use CPU continuously.

		🔹 IO-bound Tasks

			Spend most time waiting
			
			Example:
			
			Database calls
			
			REST API calls
			
			File I/O
			
			Network operations
			
			Threads are idle while waiting. 
		For CPU-bound tasks, I would size the thread pool close to the number of CPU cores to minimize context switching and maximize CPU utilization. For IO-bound tasks, I would increase the thread count based on the wait-to-compute ratio using the formula cores × (1 + wait/compute), since threads spend time blocked on IO. I would also isolate CPU and IO workloads into separate thread pools and use bounded queues with appropriate rejection policies to maintain system stability.		
		*/
		
		//What makes a class thread-safe in a real project?
		/*
		🎯 Thread Safety Strategies (Summary)
		Strategy	            Best For
		Immutability	        Data objects
		synchronized	        Critical sections
		ReentrantLock	        Advanced locking
		Atomic classes	        Simple counters
		Concurrent collections	Shared data structures
		Thread confinement	    Per-request objects
		
		A class is thread-safe if all shared mutable state is either immutable, properly synchronized, or managed using concurrent utilities like Atomic classes or Concurrent collections. In real projects, thread safety requires ensuring mutual exclusion, memory visibility, and preventing race conditions while avoiding unnecessary contention. Encapsulation of state and avoiding exposure of mutable objects are also critical.
		
		*/
		
		//Design a thread-safe counter used by multiple services.
		/*
		📊 Comparison
		Scenario	        Best Solution
		Single JVM	        LongAdder
		Low contention	    AtomicLong
		Multi-service	    Redis INCR
		Strong consistency	DB with locking
		Ultra high scale	Redis + batching
		
		🎯 Interview-Ready Answer
		
		If interviewer asks:
		
		Design a thread-safe counter used by multiple services.
		
		You answer:		
		If the counter is within a single JVM, I would use LongAdder for high contention scenarios or AtomicLong for simpler cases. However, if the counter must be shared across multiple services or instances, I would use a distributed atomic store like Redis and leverage the INCR command, which is atomic by design. For high-throughput systems, I would combine local aggregation with periodic synchronization to reduce distributed contention.
		
		That sounds senior-level.
		*/
		
		//What problems occur if shared mutable objects are not synchronized?
		/*
		📊 Summary Table
		Problem	            Cause
		Race condition	    Non-atomic updates
		Lost updates	    Concurrent writes
		Visibility issue	No volatile/sync
		Data corruption	    Unsafe collections
		Inconsistent state	Partial updates
		Random crashes	    Memory reordering
		
		Without synchronization, shared mutable objects can cause race conditions, lost updates, visibility issues, and inconsistent state. Threads may overwrite each other’s changes or fail to see updates due to CPU caching and memory reordering. This can lead to data corruption, unpredictable behavior, and production-only bugs that are extremely difficult to debug.
		
		*/
		
		//When would you prefer immutability over synchronization?
		/*
		🧠 Trade-Off Comparison
		Factor	                Immutability	        Synchronization
		Thread-safe by default	✅ Yes	                ❌ No
		Performance (reads)	    Excellent	            Slower
		Locking overhead	    None	                Yes
		Memory usage	        Higher (new objects)	Lower
		Complex shared state	Hard	                Easy
		
		I prefer immutability whenever the object’s state does not need to change after construction, such as DTOs, configuration objects, and value types. Immutable objects are inherently thread-safe, eliminate locking overhead, and simplify reasoning about concurrency. I would use synchronization only when managing shared mutable state is unavoidable, such as counters or caches.
		
		*/
		
		//How does synchronized ensure thread safety internally?
			/*
			1️⃣ Mutual Exclusion (Locking Mechanism)
	
			Every object in Java has an internal monitor (lock).
			
			When you write:
			
			synchronized(this) {
			    // critical section
			}
			
			
			What happens internally:
			
			Thread tries to acquire object's monitor.
			
			If lock is free → thread enters.
			
			If lock is taken → thread blocks.
			
			When exiting block → lock is released.
			
			This ensures:
			
			Only ONE thread executes the critical section at a time.
			
			
			That prevents race conditions.
			
			🔥 2️⃣ Memory Visibility (Very Important)
			
			This is the part many people miss.
			
			Java Memory Model says:
			
			Each thread has:
			
			Working memory (CPU cache)
			
			Main memory (heap)
			
			Without synchronization:
			
			Threads may read stale values from cache.
			
			When using synchronized:
			
			On lock acquire:
			
			Thread invalidates local cache
			
			Reads latest values from main memory
			
			On lock release:
			
			Thread flushes changes to main memory
			
			This ensures:
			
			Changes made by one thread are visible to others.
			
			🔥 3️⃣ Happens-Before Relationship
			
			Java defines:
			
			Unlocking a monitor happens-before subsequent locking of the same monitor.
			
			Meaning:
			
			Thread A:
			
			synchronized(lock) {
			    shared = 10;
			}
			
			
			Thread B:
			
			synchronized(lock) {
			    print(shared);
			}
			
			
			Guaranteed output: 10
			
			Because memory visibility is enforced.
			
			🔥 4️⃣ Atomicity of Critical Section
			
			All operations inside synchronized block become:
			
			Indivisible
			
			Non-interleavable
			
			Example:
			
			synchronized(lock) {
			    count++;
			}
			
			
			Now count++ cannot be interleaved by other threads.
			
			🔥 5️⃣ JVM Optimizations (Advanced)
			
			Modern JVM optimizes synchronized using:
			
			Biased locking
			
			Lightweight locking
			
			Lock coarsening
			
			Lock elision
			
			So synchronized is much faster than older Java versions.
			
			🧠 Internally at Bytecode Level
			
			When compiled, synchronized block becomes:
			
			monitorenter
			monitorexit
			
			
			JVM instructions:
			
			monitorenter → acquire lock
			
			monitorexit → release lock
			
			These instructions enforce:
			
			Mutual exclusion
			
			Memory barriers (visibility)
			
			🔥 What synchronized Guarantees
			Guarantee	         Provided?
			Mutual exclusion	    ✅ Yes
			Visibility	            ✅ Yes
			Atomicity (block-level)	✅ Yes
			Deadlock prevention	    ❌ No
			Fairness	            ❌ No
		*/

		//
		/*
		Difference between object lock and class lock with use case.
		Difference Between Object Lock and Class Lock
		Type	    Lock On	                Scope
		Object Lock	Instance (this)	        Per object
		Class Lock	Class (ClassName.class)	Shared across all instances
		Object Lock
		synchronized(this) { }
		
		
		Only blocks threads using the same object.
		
		Class Lock
		synchronized(ClassName.class) { }
		
		
		Blocks threads across all instances.
		
		Use Case
		
		Object lock → protect instance variables
		
		Class lock → protect static/shared data
		*/
		
		/*
		2️⃣ When Can Synchronization Cause Performance Degradation?

		High contention (many threads waiting)
		
		Long critical sections
		
		Blocking IO inside synchronized block
		
		Nested locks → deadlock risk
		
		Over-synchronization
		
		It reduces parallelism.
		
		3️⃣ Make Collection Thread-Safe Without synchronized
		
		Use concurrent collections:
		
		ConcurrentHashMap
		
		CopyOnWriteArrayList
		
		BlockingQueue
		
		Example:
		
		Map<String, String> map = new ConcurrentHashMap<>();
		
		
		They use internal locking or CAS.
		
		4️⃣ How volatile Ensures Visibility But Not Atomicity
		
		volatile:
		
		Forces read/write from main memory
		
		Prevents instruction reordering
		
		But:
		
		count++;  // still 3 steps
		
		
		Still not atomic.
		
		It solves visibility, not race condition.
		
		5️⃣ Real Scenario Where volatile is Required
		
		Stopping a thread safely:
		
		private volatile boolean running = true;
		
		
		Without volatile → thread may never stop due to cached value.
		
		Used in:
		
		Shutdown flags
		
		State indicators
		
		Double-checked locking
		
		6️⃣ What is a Race Condition?
		
		When outcome depends on timing of threads.
		
		Real Example:
		
		Two users withdrawing from same bank account → wrong balance.
		
		7️⃣ Detect Thread-Safety Issues in Production
		
		Thread dumps (jstack)
		
		Heap dump analysis
		
		Monitoring tools (New Relic, Prometheus)
		
		Load testing
		
		Static analysis tools
		
		Logging inconsistent states
		
		Race bugs usually appear under high load.
		
		8️⃣ How AtomicInteger Provides Thread Safety
		
		Uses CAS (Compare-And-Swap) at CPU level.
		
		Internally:
		
		Compare expected value
		If matches → update
		Else retry
		
		
		Lock-free, high performance.
		
		9️⃣ Atomic vs synchronized
		Atomic	synchronized
		Lock-free	Uses monitor lock
		Fast under low contention	Can block
		Single variable	Complex logic
		No deadlock	Can deadlock
		
		Use atomic for counters.
		Use synchronized for multi-step operations.
		
		🔟 Thread-Safe Singleton
		
		Best approach:
		
		Enum Singleton (Best)
		public enum Singleton {
		    INSTANCE;
		}
		
		
		Or Double-Checked Locking:
		
		private static volatile Singleton instance;
		
		public static Singleton getInstance() {
		    if (instance == null) {
		        synchronized (Singleton.class) {
		            if (instance == null) {
		                instance = new Singleton();
		            }
		        }
		    }
		    return instance;
		}
		
		🔹 Thread Pool + Thread Safety
		1️⃣ Is ExecutorService Thread-Safe?
		
		Yes.
		
		It is designed to handle concurrent task submissions safely using internal synchronization and concurrent queues.
		
		2️⃣ Thread-Safety Issues When Tasks Share Objects
		
		If tasks modify shared mutable objects:
		
		Race conditions
		
		Data corruption
		
		Inconsistent state
		
		Thread pool does NOT make your task thread-safe.
		
		3️⃣ Protect Shared Resources in Thread Pool
		
		Use ConcurrentHashMap
		
		Use AtomicInteger
		
		Use synchronized
		
		Use ReentrantLock
		
		Make objects immutable
		
		4️⃣ What Happens If Non-Thread-Safe Object Is Reused?
		
		Example:
		
		SimpleDateFormat
		ArrayList
		HashMap
		
		
		Results:
		
		Random exceptions
		
		Corrupted data
		
		Production-only failures
		
		5️⃣ Thread Safety in Parallel Streams
		
		Avoid:
		
		parallelStream().forEach(list::add);
		
		
		Use:
		
		Collectors
		
		Immutable objects
		
		Thread-safe collections
		
		Example:
		
		list.parallelStream()
		    .collect(Collectors.toList());
		
		6️⃣ Design a Thread-Safe Task Scheduler
		
		Use:
		
		ScheduledThreadPoolExecutor
		
		
		Ensure:
		
		Tasks are idempotent
		
		Shared state protected
		
		Proper shutdown handling
		
		7️⃣ Prevent Deadlocks in Thread Pools
		
		Avoid nested locks
		
		Use consistent lock order
		
		Avoid blocking inside synchronized
		
		Keep critical sections small
		
		Avoid waiting on futures inside same pool
		
		8️⃣ What is ThreadLocal?
		
		Provides per-thread variable storage.
		
		Each thread has its own copy.
		
		Used in:
		
		Request context
		
		Transaction management
		
		Security context
		
		Date formatting
		
		Example:
		
		ThreadLocal<User> currentUser = new ThreadLocal<>();
		
		9️⃣ How ThreadLocal Causes Memory Leaks
		
		In thread pools:
		
		Threads are reused
		
		ThreadLocal values not cleared
		
		Memory retained forever
		
		Always:
		
		threadLocal.remove();
		
		
		Especially in web servers.
		
		🔟 Design Thread-Safe Logging System Using Thread Pool
		
		Architecture:
		
		Application Threads
		      ↓
		BlockingQueue (log events)
		      ↓
		Dedicated Logger Thread Pool
		      ↓
		Write to File / DB
		
		
		Key Points:
		
		Use LinkedBlockingQueue
		
		Avoid logging inside synchronized blocks
		
		Use async logging
		
		Flush properly on shutdown
		
		This is how Log4j async appender works.
		*/
		
		
	}

}
