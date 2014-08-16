package com.zc.charapter_two;

/**
 * 8/16/14  8:42 AM
 * Created by JustinZhang.
 */
public class Template {

    public static boolean less(Comparable v , Comparable w){

        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i , int j){

        Comparable temp = a[i];

        a[i] = a[j];
        a[j] = temp;
    }

    public static void show(Comparable[] a){
        for (Comparable c: a){
            System.out.println(c);
        }
        System.out.println();
    }


    public static boolean isSorted(Comparable[] a){
        for(int i = 1 ; i < a.length; i++)
            if(less(a[i],a[i-1]))
                return false;
        return true;
    }

}
