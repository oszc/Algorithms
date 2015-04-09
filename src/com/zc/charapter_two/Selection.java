package com.zc.charapter_two;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;

import java.util.concurrent.TimeUnit;

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
            exch(a, i, min);
          //  show(a);
            try {
             //  TimeUnit.MILLISECONDS.sleep(1000);
             //   StdDraw.clear();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
      //  Integer[] m = {10,9,8,7,6,5,4,3,2,1};

        /*
        int times = 15;
        Double[] a = new Double[times];
        for (int t = 0; t < times; t++) {
            for (int i = 0; i < times; i++) {
                a[i] = StdRandom.uniform();
            }
          //  total += time(alg, a);
        }
        Selection.sort(a);
        show(a);
        */

        String[] example = {"E","A","S","Y","Q","U","E","S","T","I","O","N"};
        sort(example);
        show(example);
    }


}
