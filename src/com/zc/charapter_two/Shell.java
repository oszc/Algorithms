package com.zc.charapter_two;

/**
 * 4/1/15  6:17 PM
 * Created by Justincompany.
 */
public class Shell extends Template{


    public static void sort(Comparable[] a){

        int N = a.length;
        int h = 1;

        while (h < N / 3){
            h = 3 * h +1 ;
        }

        while (h >= 1){
            for (int i =   h; i < N ; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]) ; j-=h){
                    exch(a,j, j-h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        String[] s = {"S","O","R","T","E","X","A","M","P","L","E"};
        Shell.sort(s);
        show(s);
    }
}
