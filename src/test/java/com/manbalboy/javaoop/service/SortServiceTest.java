package com.manbalboy.javaoop.service;

import com.manbalboy.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sot = new SortService(new JavaSort<String>());

    @Test
    void test() {

        List<String> actual =sot.doSort(List.of("3" ,"2", "1"));

        assertEquals(List.of("1","2","3"), actual);
    }

}