package com.wz.keep.algorithm.sort;

/**
 * 排序接口，用于实现常见排序算法
 *
 * @author zhen.wang
 * @see BubbleSort 冒泡排序
 * @see InsertionSort 插入排序
 * @see ShellSort 希尔排序
 * @see SelectionSort 选择排序
 */
public interface Sort<T extends Comparable> {

    void sort(T[] data);
}
