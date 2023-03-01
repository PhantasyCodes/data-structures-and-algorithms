package org.example;

public class DynamicArray {

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }

        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if(size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {

        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                array[i] = null;
                size--;

                for (int j=(i+1); j < capacity; j++) {
                    i = j - 1;
                    array[i] = array[j];
                    System.out.println(j);
                }

                array[capacity - 1] = null;

                if(size<=(int) (capacity/3)) {
                    shrink();
                }

                break;
            }

        }

    }

    public int search(Object[] data) {
        return -1;
    }

    private void grow() {

    }

    private void shrink() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String string = "";
        for (int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }

        if (!string.equals("")) {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }
        return string;
    }

}
