package com.algorithm.duy;

public class InsertSort {

    private void insertSort(int[] data){
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int curIndex = i - 1;
            while (curIndex >= 0 && key < data[curIndex]) {
                data[curIndex] = data[curIndex + 1];
                curIndex--;
            }
            data[curIndex + 1] = key;
        }
    }
}
