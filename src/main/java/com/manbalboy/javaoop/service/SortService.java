package com.manbalboy.javaoop.service;

import com.manbalboy.javaoop.logic.JavaSort;
import com.manbalboy.javaoop.logic.Sort;

import java.util.Arrays;
import java.util.List;

public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
