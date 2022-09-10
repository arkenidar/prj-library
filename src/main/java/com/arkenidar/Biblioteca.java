package com.arkenidar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private final List<Integer> list;

    Biblioteca(int[] integers) {
        list = Arrays.stream(integers).sorted().boxed().toList();
    }

    public boolean esisteLibro(int index) {
        return list.contains(index);
    }

    public int[] getIndiciLibriOrdinati() {
        return list.stream().mapToInt(i -> i).toArray();
    }
}
