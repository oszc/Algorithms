package com.zc.charapter_two;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;

import java.util.concurrent.TimeUnit;

/**
 * 4/1/15  6:17 PM
 * Created by Justincompany.
 */
public class Shell extends Template {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;


        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i<N; i++) {
                for (int j = i; j >= h &&less(a[j], a[j - h]); j -= h) {
                        exch(a, j, j - h);
                    show(a);
                    try {
                     //   TimeUnit.MILLISECONDS.sleep(20);
                        StdDraw.clear();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        int times = 60;
        Double[] a = new Double[times];
        for (int t = 0; t < times; t++) {
            for (int i = 0; i < times; i++) {
                a[i] = StdRandom.uniform();
            }
            //  total += time(alg, a);
        }
        Shell.sort(a);
        show(a);
    }
}
