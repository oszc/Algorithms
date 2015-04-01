package com.zc.charapter_two;

import edu.princeton.cs.introcs.StdOut;

import java.util.Random;

/**
 * 3/31/15  3:23 PM
 * Created by Justincompany.
 */
public class InsertionPlus extends Template {

    public static void sort(Comparable[] array) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            int minIndex = i;
            Comparable minComparable = array[i];
            for (int j = i; j > 0 && less(minComparable, array[j - 1]); j--) {
                minIndex = j - 1;
                array[j] = array[j - 1];
            }
            if(array[minIndex] != minComparable)
                array[minIndex] = minComparable;
        }
    }

    public static void main(String[] args) {
        Random mRand = new Random();
        int size = 100000;
        String[] s = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        String[] sa = new String[size];
      //  String[] sb = new String[size];
      //  String[] sc = new String[size];
        for (int i = 0; i < size; i++) {
            sa[i] = s[mRand.nextInt(s.length)];
      //      sb[i] = s[mRand.nextInt(s.length)];
      //      sc[i] = s[mRand.nextInt(s.length)];
        }

        /**
         * 排序方式(十万次)   时间(ms)
         * InsertionPlus:   7445        7257
         * Insertion:       14851       13853
         * Selection:       22237       22505
         */

        long begin =0 ,end = 0;
        /*
        begin = System.currentTimeMillis();
        InsertionPlus.sort(sa);
        end = System.currentTimeMillis();

        System.out.println("InsertionPlus:" +(end - begin));
        */


        /*

        begin = System.currentTimeMillis();
        Insertion.sort(sa);
        end = System.currentTimeMillis();
        System.out.println("Insertion:" +(end - begin));

        */

        /*
        begin = System.currentTimeMillis();
        Selection.sort(sa);
        end = System.currentTimeMillis();
        System.out.println("Selection:" +(end - begin));
        */

        //   show(so);
    }
}
