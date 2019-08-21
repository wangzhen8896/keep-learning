package com.wz.keep.algorithm.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * 插入排序
 * 时间复杂度：O(n^2)
 * 基本思想：
 * @author zhen.wang
 * @param <T>
 */
@Slf4j
public class InsertionSort<T extends Comparable> implements Sort<T> {
    

    public void sort(T[] data) {
       if(data != null){
           insertionSort(data);
       }
    }

    private void insertionSort(T[] data){
        for (int i = 0, len = data.length; i < len; i++) {
            for (int j = i; j > 0; j--) {
                log.info("i={}, j={}, arrays:{}", i, j, Arrays.toString(data));
                if(data[j].compareTo(data[j-1]) < 0){
                    log.info("swap i={}, j={}", data[j], data[j-1]);
                    T temp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}
