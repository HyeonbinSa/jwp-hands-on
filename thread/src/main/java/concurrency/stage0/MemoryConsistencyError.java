package concurrency.stage0;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MemoryConsistencyError {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Counter counter = new Counter();

        // counter++
        for (int i = 0; i < 20; i++) {
            executorService.submit(() -> System.out.println(counter.increment()));
        }

        // 현재 작업중인것까지만 완료하고, 모든 작업이 완료되었는지 체크
        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final count is : " + counter.getCount());
    }
}
