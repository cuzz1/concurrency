package com.cuzz.concurrency.example.singleton;

import com.cuzz.concurrency.example.annoations.ThreadSafe;

/**
 * 饿汉模式
 * 单例实例在类装载使用时候创建出来
 */
@ThreadSafe
public class SingletonExample2 {

    // 私有的构造函数
    private SingletonExample2() {

    }

    // 单例对象
    private static SingletonExample2 instance = new SingletonExample2();

    // 静态的工厂方法
    public static SingletonExample2 getInstance() {
        return instance;
    }
}
