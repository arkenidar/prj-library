package com.arkenidar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    private final List<Integer> list;

    Biblioteca(int[] ints) {
        this.list = new ArrayList<>(Arrays.stream(ints).boxed().toList());
        //this.list = Arrays.stream(ints).boxed().collect(Collectors.toList());
    }

    public boolean esisteLibro(int index) {
        return list.contains(index);
    }

    public int[] getIndiciLibriOrdinati() {
        Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
