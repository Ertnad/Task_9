package ru.vsu.sc.tretyakov_d_s;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> createNewList(List<Integer> list, double n) {
        List<Integer> result = new ArrayList<>();
        for (Integer v: list) {
            if (countOfValue(list, v)>=n && !result.contains(v)) {
                result.add(v);
            }
        }
        return result;
    }

    public int countOfValue(List<Integer> list, int value) {
        int k = 0;
        for(Integer v: list) {
            if(v==value) {
                k++;
            }
        }
        return k;
    }
}