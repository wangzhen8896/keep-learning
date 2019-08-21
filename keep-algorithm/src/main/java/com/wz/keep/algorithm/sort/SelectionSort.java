package com.wz.keep.algorithm.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * 选择排序
 * 基本思想：从未排序数据中，选择一个最大或最小值，
 * @author zhen.wang
 * @param <T>
 */
@Slf4j
public class SelectionSort<T extends Comparable> implements Sort<T> {

    public void sort(T[] data) {
        if(data != null){
            for (int i = 0, len = data.length; i < len; i++) {
                int min = i;
                for (int j = i; j < len; j++) {
                    if(data[j].compareTo(data[min])< 0){
                        min = j;
                    }
                }
                log.info("min={}, arrays:{}", data[min], Arrays.toString(data));
                if(min != i){
                    log.info("swp:{} {}", data[i], data[min]);
                    T temp = data[i];
                    data[i] = data[min];
                    data[min] = temp;
                }
            }
        }
    }
}
