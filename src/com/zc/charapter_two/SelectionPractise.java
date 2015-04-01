package com.zc.charapter_two;

import sun.applet.Main;

/**
 * 3/31/15  10:31 AM
 * Created by Justincompany.
 * 选择排序：首先找到数组中最小的元素，和第一个元素交换。在剩下的元素中找到最小的元素，和第二个位置交换，如此循环往复。
 *
 * 交换次数最多n次
 * 比较次数最多 (n^2)/2
 */
public class SelectionPractise extends Template {
    private static void sort(Comparable[] a){
        if (a == null) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            Comparable min = a[i];
            for (int j = i+1; j < a.length; j++) {
                if(less(a[j],min)){
                    exch(a,i,j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Integer[] a = {10,9,8,7,6,5,4,3,2,1};
        sort(a);
        show(a);
    }
}
