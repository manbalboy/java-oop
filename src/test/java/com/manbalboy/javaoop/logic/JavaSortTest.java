package com.manbalboy.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    @DisplayName("java sort - 리스트를 넣으면 정렬된 결과를 보여줌")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {

        //Given
        JavaSort<Integer> javasort = new JavaSort<>();


        //When
        List<Integer> actual  = javasort.sort(List.of(5,2,1,3,4));


        //Then
        assertEquals(List.of(1,2,3,4,5),actual);

    }
}