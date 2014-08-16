package com.zc.test;

import com.zc.charapter_two.Selection;
import com.zc.charapter_two.Template;

/**
 * 8/16/14  9:35 AM
 * Created by JustinZhang.
 */
public class TestSelection {
    public static void main(String[] args) {

        Integer[] a = {1,3,324,2,34,525};
        Selection.sort(a);
        Template.show(a);
    }
}
