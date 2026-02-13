package multithreadings;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SimpleCallableNFuture {

	static int n = 1;
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Callable<Integer> callable = (() -> {
			for (int i = 1; i < 4000000; i++) {				
					n++;
			}
			return n;
		});
		Future<Integer> future = executorService.submit(callable);
		//Thread.sleep(3000);
		System.out.println(future.get());
		executorService.shutdown();
	}

}
