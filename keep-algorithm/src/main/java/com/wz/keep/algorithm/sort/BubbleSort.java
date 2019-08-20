package com.wz.keep.algorithm.sort;

/**
 * 冒泡排序
 * 时间复杂度: O(n^2)
 * 基本思想：相邻俩位a,b比较，如果a>b则交换位置
 * @author zhen.wang
 */
public class BubbleSort<T extends Comparable> implements Sort<T>{

    public void sort(T[] data) {
        if(data != null){
            for (int i = 0, len = data.length; i < len; i++) {
                for (int j = 0; j < len - i - 1; j++) {
                    if(data[j].compareTo(data[j+1]) > 0){
                        T temp = data[j+1];
                        data[j+1] = data[j];
                        data[j] = temp;
                    }
                }
            }
        }
    }
}
