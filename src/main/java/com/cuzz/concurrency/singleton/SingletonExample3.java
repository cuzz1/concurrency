package com.cuzz.concurrency.singleton;

import com.cuzz.concurrency.annoations.NotRecommend;
import com.cuzz.concurrency.annoations.ThreadSafe;

/**
 * 懒汉模式
 * 单例实例在第一次使用的时候创建出来
 */
@ThreadSafe
@NotRecommend
public class SingletonExample3 {

    // 私有的构造函数
    private SingletonExample3() {

    }

    // 单例对象
    private static SingletonExample3 instance = null;

    // 静态的工厂方法
    public static synchronized  SingletonExample3 getInstance() {
        if (instance == null) {
            instance = new SingletonExample3();
        }
        return instance;
    }
}
