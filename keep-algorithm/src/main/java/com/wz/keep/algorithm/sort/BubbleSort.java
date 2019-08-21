package com.wz.keep.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 时间复杂度: O(n^2)
 * 基本思想：相邻俩位a,b比较，如果a>b则交换位置
 * @author zhen.wang
 */
public class BubbleSort<T extends Comparable> implements Sort<T>{

    /**
     * 2, 6, 4, 6, 3, 1, 0
     * 排序过程:
     * 第一趟：
     * @param data
     */
    public void sort(T[] data) {
        if(data != null){
            for (int i = 0, len = data.length; i < len; i++) {
                for (int j = 0; j < len - i - 1; j++) {
                    System.out.println(String.format("i=%s, j=%s, arrays:%s", i, j, Arrays.toString(data)));
                    if(data[j].compareTo(data[j+1]) > 0){
                        System.out.println("swap: " + data[j+1] + " " + data[j]);
                        T temp = data[j+1];
                        data[j+1] = data[j];
                        data[j] = temp;
                    }
                }
                System.out.println("-----------------------");
            }
        }
    }
}
