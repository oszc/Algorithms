package com.zc.charapter_two;

/**
 * 3/31/15  2:26 PM
 * Created by Justincompany.
 * 插入排序：索引左边的所有元素都是有序的，但最终位置不确定，为了给更小元素腾出空间，它们可能会被移动。
 * 当索引达到右端时，数组排序就完成了。
 */
public class Insertion extends Template {
    public static void sort(Comparable[] array) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i; j > 0 && less(array[j ], array[j - 1]); j--) {
                exch(array, j , j -1);
            }
        }
    }

    public static void main(String[] args) {
        String[] s = {"S","O","R","T","E","X","A","M","P","L","E"};
        Insertion.sort(s);
        show(s);
    }
}
