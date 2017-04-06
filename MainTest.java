package com.gavincai

import java.util.concurrent.*;
public class MainTest{
	public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            ExecutorService executorService = Executors.newFixedThreadPool(8);
            CountDownLatch latch = new CountDownLatch(3);

            Boss boss = new Boss(latch);
            executorService.execute(boss);
            for (int i = 0; i < 3; i++) {
                Employee employee = new Employee("employee" + i, latch);
                executorService.execute(employee);
            }

            executorService.shutdown();
            try {
                executorService.awaitTermination(10000, TimeUnit.DAYS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//start() 和 wait()的关系？？