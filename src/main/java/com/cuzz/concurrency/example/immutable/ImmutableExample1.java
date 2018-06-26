package com.cuzz.concurrency.example.immutable;

import java.util.HashMap;
import java.util.Map;

public class ImmutableExample1 {

    private final static Integer a = 1;
    private final static String b = "2";
    private final static Map<Integer, Integer> map = new HashMap<>();

    static {
        map.put(1, 2);
        map.put(3, 4);
        map.put(5, 6);
    }

    // 可以保证变量不发生变化
    private void test(final int a) {
        // a = 1;  // 编译出错
    }

    public static void main(String[] args) {
        // a = 2;   // 编译出错
        // b = "3"; // 编译出错
        // map = new HashMap<>(); // 编译出错
        map.put(1, 3);   // 引用对象可以修改里面的值
    }
}
