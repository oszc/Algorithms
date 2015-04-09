package com.zc.charapter_two;

/**
 * 4/3/15  10:30 AM
 * Created by Justincompany.
 * 希尔排序：从数组中挑选一个步长为h (3*h+1)的数字，从x处开始排序，与（x-h)比较若满足条件（后一个比前一个小）则交换，每次步长h/3
 *
 */
public class ShellPractise extends Template{

    public static void sort(Comparable[] a){

        int N = a.length;
        int h = 1;

        while (h < N /3) {
            h = h * 3 + 1;
        }

        while (h >= 1){
            for(int i = h ; i < N; i++){
                for (int j = i; j > 0 && less(a[j],a[j-1]) ; j-=h) {
                    exch(a,j,j-1);
                }
            }
            h /= 3;
        }
    }

    public static void main(String[] args) {
        String[] s = {"9","8","7","6","5","4","3","2","1","10"};
        ShellPractise.sort(s);
        show(s);
    }
}
