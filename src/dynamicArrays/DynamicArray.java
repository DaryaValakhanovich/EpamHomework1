package dynamicArrays;

import java.util.Arrays;

public class DynamicArray<T> {
    private T[] array;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public DynamicArray() {
        array = (T[]) new Object[0];
    }

    @SuppressWarnings("unchecked")
    public DynamicArray(int size) {
        array =  (T[]) new Object[size];
    }

    @SuppressWarnings("unchecked")
    public void add(T newElement) {
        if(size < array.length){
            array[size] = newElement;
            size++;
        } else {
            T[] newArray =  (T[]) new Object[size + 1];
            System.arraycopy(array, 0, newArray, 0, size);
            newArray[size] = newElement;
            array = newArray;
            size++;
        }
    }

    public T get(int index) throws ArrayIndexOutOfBoundsException{
        return array[index];
    }

    @SuppressWarnings("unchecked")
    public void remove(int index)  throws ArrayIndexOutOfBoundsException{
        T[] newArray = (T[])new Object[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        array = newArray;
        size--;
    }

    @Override
    public String toString() {
        return "DynamicDoubleArray{" +
                "doubleArray=" + Arrays.toString(Arrays.copyOf(array, size)) +
                '}';
    }
}
