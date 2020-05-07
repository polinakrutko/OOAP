package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List <Integer> arrayList = new ArrayList<>();
        List <Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        // 1
        // Добавляется быстрее всего так как это массив
        System.out.println("Test add for arrayList " + TestUtils.testAddToArrayList(arrayList)); // Test add for arrayList 448
        // Добавляется медленнее так как это связный список
        System.out.println("Test add for linkedList " + TestUtils.testAddToArrayList(linkedList)); // Test add for linkedList 969
        // Скорость примерно такая же потому что в добавлении использует хеш-таблицу
        System.out.println("Test add for hashSet " + TestUtils.testAddToArrayList(hashSet)); // Test add for hashSet 1043
        // Скорость еще больше предыдущих так как сортирует данные при добавлении
        System.out.println("Test add for treeSet " + TestUtils.testAddToArrayList(treeSet)); // Test add for treeSet 1548


        // 2
        // Работает дольше так как добавление в начало массива сложнее
        System.out.println("Test add to the beginning for arrayList " + TestUtils.testAddToTheBeginning(arrayList)); //Test add to the beginning for arrayList 15388
        // Работает быстрее так как связный список добавляет по индексу быстрее, чем в массив
        System.out.println("Test add to the beginning for linkedList " + TestUtils.testAddToTheBeginning(linkedList)); //Test add to the beginning for linkedList 58

        // Добавление в конец массива происходит быстрее так как это обычное добавление
        System.out.println("Test add to the ending for arrayList " + TestUtils.testAddToTheEnding(arrayList)); // Test add to the ending for arrayList 390
        System.out.println("Test add to the ending for linkedList " + TestUtils.testAddToTheEnding(linkedList)); // Test add to the ending for linkedList 943

        // 3
        TestUtils.AddSet(hashSet);
        TestUtils.AddSet(treeSet);
        // Метод contains в hashSet срабатывает быстрее
        System.out.println("Test contains for hashSet " + TestUtils.testContains(hashSet)); // Test contains for hashSet 23
        System.out.println("Test contains for treeSet " + TestUtils.testContains(treeSet)); // Test contains for treeSet 181

        // 4
        TestUtils.AddSet(hashSet);
        TestUtils.AddList(arrayList);
        TestUtils.AddList(linkedList);
        // Поиск быстрее всего срабатывает по хеш-таблице и дольше всего в связном списке
        System.out.println("Test contains for arrayList " + TestUtils.testContains(arrayList)); // Test contains for arrayList 75
        System.out.println("Test contains for hashSet " + TestUtils.testContains(hashSet)); // Test contains for hashSet 33
        System.out.println("Test contains for linkedList " + TestUtils.testContains(linkedList)); // Test contains for linkedList 112
    }
}
