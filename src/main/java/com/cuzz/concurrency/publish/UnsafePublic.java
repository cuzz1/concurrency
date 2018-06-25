package com.cuzz.concurrency.publish;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class UnsafePublic {
    private String[] states = {"a", "b", "c"};

    public String[] getStrates() {
        return states;
    }

    public static void main(String[] args) {
        UnsafePublic unsafePublic = new UnsafePublic();
        log.info("{}", Arrays.toString(unsafePublic.getStrates()));

        unsafePublic.getStrates()[0] = "d";
        log.info("{}", Arrays.toString(unsafePublic.getStrates()));
    }
}
