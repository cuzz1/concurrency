package com.cuzz.concurrency.singleton;

import com.cuzz.concurrency.annoations.ThreadSafe;

/**
 * 饿汉模式
 * 单例实例在类装载使用时候创建出来
 */
@ThreadSafe
public class SingletonExample6 {

    // 私有的构造函数
    private SingletonExample6() {

    }

    // 单例对象
    // 静态域一定要再静态代码块之前，因为他们是按照循序执行的
    private static SingletonExample6 instance = null;

    static {
        instance = new SingletonExample6();
    }


    // 静态的工厂方法
    public static SingletonExample6 getInstance() {
        return instance;
    }
}
