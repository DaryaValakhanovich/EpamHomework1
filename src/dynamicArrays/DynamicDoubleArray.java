package dynamicArrays;

import java.util.Arrays;

public class DynamicDoubleArray {
    private double[] doubleArray;
    private int size = 0;

    public DynamicDoubleArray() {
        doubleArray =  new double[size];
    }

    public DynamicDoubleArray(int size) {
        doubleArray =  new double[size];
    }

    public void add(double newElement) {
        if(size < doubleArray.length){
            doubleArray[size] = newElement;
            size++;
        } else {
            double[] newArray = new double[size + 1];
            System.arraycopy(doubleArray, 0, newArray, 0, size);
            newArray[size] = newElement;
            doubleArray = newArray;
            size++;
        }
    }

    public double get(int index) throws ArrayIndexOutOfBoundsException{
        return doubleArray[index];
    }

    public void remove(int index)  throws ArrayIndexOutOfBoundsException{
        double[] newArray = new double[doubleArray.length - 1];
        System.arraycopy(doubleArray, 0, newArray, 0, index);
        System.arraycopy(doubleArray, index + 1, newArray, index, doubleArray.length - index - 1);
        doubleArray = newArray;
        size--;
    }

    @Override
    public String toString() {
        return "DynamicDoubleArray{" +
                "doubleArray=" + Arrays.toString(Arrays.copyOf(doubleArray, size)) +
                '}';
    }
}


