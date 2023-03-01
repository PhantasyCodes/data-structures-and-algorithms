package org.example;

public class Main {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.insert(9, "X");

        dynamicArray.delete("A");

        System.out.println(
                dynamicArray + "\n" +
                "empty: " + dynamicArray.isEmpty() + "\n" +
                "size: " + dynamicArray.size + "\n" +
                "capacity: " + dynamicArray.capacity
        );
    }
}