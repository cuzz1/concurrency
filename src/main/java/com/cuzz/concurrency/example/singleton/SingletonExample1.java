package com.cuzz.concurrency.example.singleton;

import com.cuzz.concurrency.example.annoations.NotThreadSafe;

/**
 * 懒汉模式
 * 单例实例在第一次使用的时候创建出来
 */
@NotThreadSafe
public class SingletonExample1 {

    // 私有的构造函数
    private SingletonExample1() {

    }

    // 单例对象
    private static SingletonExample1 instance = null;

    // 静态的工厂方法
    public static SingletonExample1 getInstance() {
        if (instance == null) {
            instance = new SingletonExample1();
        }
        return instance;
    }
}
