package com.manbalboy.javaoop;

import com.manbalboy.javaoop.logic.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> sort = new BubbleSort<>();
        System.out.println(sort.sort(Arrays.asList(args)));
    }
}
