package com.cuzz.concurrency.singleton;

import com.cuzz.concurrency.annoations.NotRecommend;
import com.cuzz.concurrency.annoations.NotThreadSafe;
import com.cuzz.concurrency.annoations.ThreadSafe;

/**
 * 懒汉模式 双重锁同步单例模式
 * 单例实例在第一次使用的时候创建出来
 */
@NotThreadSafe
public class SingletonExample4 {

    // 私有的构造函数
    private SingletonExample4() {

    }
    // 1. memory = allocate() 分配对象空间
    // 2. ctorInstance() 初始化对象
    // 3. instance = memory 设置instance指向刚分配的内存

    // JVM和cpu优化，发生了指令重排

    // 1. memory = allocate() 分配对象空间
    // 3. instance = memory 设置instance指向刚分配的内存
    // 2. ctorInstance() 初始化对象

  // 单例对象
    private static SingletonExample4 instance = null;

    // 静态的工厂方法
    public static SingletonExample4 getInstance() {
        if (instance == null) { // 双重检测机制
            synchronized (SingletonExample4.class) { // 同步锁
               if (instance == null) {
                   instance = new SingletonExample4();
               }
            }
        }
        return instance;
    }
}
