package com.cuzz.concurrency.example.sync;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class SynchronizedExample1 {

    // 修饰一个代码块
    public void test1() {
      synchronized (this) {
          for (int i = 0; i < 10; i++) {
              log.info("test1 - {}", i);
          }
      }
    }

    // 修饰一个方法
    public synchronized void test2() {
        for (int i = 0; i < 10; i++) {
            log.info("test - {}", i);
        }
    }

    public static void main(String[] args) {
        // 声明一个实例
        SynchronizedExample1 example1 = new SynchronizedExample1();
        SynchronizedExample1 example2 = new SynchronizedExample1();
        // 声明一个线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->{
            example1.test1();
        });

        executorService.execute(()->{
            example2.test1();
        });
    }
}
