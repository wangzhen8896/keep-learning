package com.wz.keep.algorithm.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

@Slf4j
public class SortTest {

    @Test
    public void insertionSortTest(){
        Integer[] data = {2,6,4,6,3,1,0};
        Sort<Integer> sort = new InsertionSort();
        log.info("使用{}排序，before:{}", sort.getClass().getSimpleName(), Arrays.toString(data));
        sort.sort(data);
        log.info("after:{}", Arrays.toString(data));
    }


}
