package com.zc.charapter_two;

import com.sun.javafx.binding.StringFormatter;
import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.geom.Arc2D;
import java.text.DecimalFormat;
import java.util.Date;

/**
 * 8/16/14  8:42 AM
 * Created by JustinZhang.
 */
public class Template {

    static {
      //  StdDraw.setCanvasSize(1920, 1000);
    }

    public Template() {
    }

    public static boolean less(Comparable v, Comparable w) {

        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {

        Comparable temp = a[i];

        a[i] = a[j];
        a[j] = temp;
    }

    private static double width = 0.1;

    public static void show(Comparable[] a) {
       // width = 1.0 / a.length;

        /*
        DecimalFormat df = new DecimalFormat(".00");
        StdDraw.setPenColor(Color.GREEN);
        Font font = new Font(null, Font.BOLD, 10);
        StdDraw.setFont(font);
        */

        // StdDraw.setCanvasSize(100,100);

        for (int i = 0; i < a.length; i++) {
            /*
            if (a[i] instanceof Number) {

                //  StdDraw.filledRectangle(0,i* width,width,Double.valueOf(a[i]+""));
                StdDraw.filledRectangle(i * width, 0, width / 2, Double.valueOf(a[i] + ""));
                //StringFormatter.format("%.2f",a[i]);
                StdDraw.text(i * width+0.01, Double.valueOf(a[i] + "") + 0.01, df.format(Double.valueOf(a[i] + "")));
            }
            */
            System.out.println(a[i]);
        }

        /*
        for (Comparable c: a){
            if(c instanceof Integer){
                StdDraw.filledRectangle();
            }
            System.out.println(c);
        }
        */
       // System.out.println();
    }


    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1]))
                return false;
        return true;
    }

}
