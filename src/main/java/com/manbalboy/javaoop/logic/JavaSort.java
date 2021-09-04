package com.manbalboy.javaoop.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSort <T extends Comparable>{
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);

        return output;
    }
}
