package org.example;

import java.util.Arrays;
import java.util.EmptyStackException;

public class T19_CustomStack<T> {
    T[] elements;
    int index = 0;

    public T19_CustomStack() {
        elements = (T[]) new Object[8];
    }

    public void push(T element) {
        checkCapacity();
        elements[index++] = element;
    }

    void checkCapacity() {
        if (index == elements.length) {
            elements = Arrays.copyOf(elements, 2 * index + 1);
        }
    }

    public T pop() {
        if (index == 0) {
            throw new EmptyStackException();
        }
        T popped = elements[--index];
        elements[index] = null;
        return popped;
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        return index == 0;
    }

}
