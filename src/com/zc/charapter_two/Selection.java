package com.zc.charapter_two;

/**
 * 8/16/14  8:58 AM
 * Created by JustinZhang.
 */
public class Selection extends Template {

    public static void sort(Comparable[] a) {


        int min =0 ;
        for (int i = 0; i < a.length; i++) {

             min =i;

            for (int j = i + 1; j < a.length; j++) {

                if(less(a[j],a[min])){
                    min = j;
                }

            }
          exch(a,i,min);
        }

    }


}
