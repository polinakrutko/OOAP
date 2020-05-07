package com.company;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class TestUtils {

    public static int ITERATION_COUNT = 5000000;

    public static long testAddToArrayList(Collection<Integer> collection){
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATION_COUNT; i++){
            collection.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long testAddToTheBeginning(List<Integer> collection){
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATION_COUNT; i++){
            collection.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long testAddToTheEnding(List<Integer> collection){
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATION_COUNT; i++){
            collection.add(collection.size(), i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void AddSet(Set<Integer> collection){
        for (int i = 0; i < ITERATION_COUNT; i++){
            collection.add(i);
        }
    }

    public static void AddList(List<Integer> collection){
        for (int i = 0; i < ITERATION_COUNT; i++){
            collection.add(i);
        }
    }

    public static long testContains(Collection<Integer> collection){
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < collection.size(); i++){
            collection.contains(10);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }



}
