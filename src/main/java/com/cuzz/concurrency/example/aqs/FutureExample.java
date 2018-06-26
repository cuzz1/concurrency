package com.cuzz.concurrency.example.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

import static java.lang.Thread.*;

@Slf4j
public class FutureExample {
    static class MyCallable implements Callable<String> {


        @Override
        public String call() throws Exception {
            log.info("do something in callable");
            sleep(5000);
            return "Done";
        }

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future = executor.submit(new MyCallable());
        log.info("do something in main");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String res = future.get();
        log.info("res: {}", res);

    }
}
