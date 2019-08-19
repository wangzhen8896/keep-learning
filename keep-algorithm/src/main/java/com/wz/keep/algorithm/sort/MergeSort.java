package com.wz.keep.algorithm.sort;

/**
 * 归并排序
 * 基本思想：
 * @author zhen.wang
 * @param <T>
 */
public class MergeSort<T extends Comparable> implements Sort<T> {


    /**
     * 递归二分
     * @param data
     * @param left
     * @param right
     */
    private void mergeSort(T[] data, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(data, left, mid);
            mergeSort(data, mid+1, right);
            merge(data, left, mid, right);
        }
    }

    /**
     * 合并数据
     * @param data
     * @param left
     * @param mid
     * @param right
     */
    private void merge(T[] data, int left, int mid, int right){
        Object[] temp = new Object[data.length];
        //左边分组最小的数据
        int leftMin = left;
        //右边分组最小的数据
        int rightMin = mid + 1;
        // temp数组当前指针位置
        int current = left;
        // 遍历比较比较左右俩边数据大小，如果左边大，则左边数据放入temp数组，否则右边放入temp数组
        while (leftMin <= mid && rightMin <= right){
            if(data[leftMin].compareTo(data[rightMin]) <= 0){
                temp[current++] = data[leftMin++];
            }else {
                temp[current++] = data[rightMin++];
            }
        }
        //检查左边分组是否存在未合并数据
        while (leftMin <= mid){
            temp[current++] = data[leftMin++];
        }
        //检查右边分组是否存在未合并数据
        while (rightMin <= right){
            temp[current++] = data[rightMin++];
        }
        //拷贝temp数据到排序数组
        for (int i = left; i <= right; i++) {
            data[i] = (T)temp[i];
        }
    }

    public void sort(T[] data) {
        if(data == null){
            return;
        }
        mergeSort(data, 0, data.length - 1);
        return;
    }
}
