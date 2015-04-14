package com.zc.charapter_two;

/**
 * 4/14/15  1:48 PM
 * Created by Justincompany.
 * <p/>
 * 归并算法：我们把一个数组分成两份，递归的先排序左边的，然后排序右边的，然后合并左右两份，这样数组就排序完毕了
 */
public class MergePractise extends Template {

    public static Comparable[] aux;

    /**
     * 数组原地归并并且排序，个数未n，创建辅助数组
     *  ------   辅助数组
     *  ↑  ↑     初始指针位置(i,j)
     *  逐个比较指针的值，循环n次
     *      如果左边指针超过一半，那么排序值直接使用右边的指针值,右边指针++
     *      如果右边的指针超过最大值，那么排序值直接使用左边的指针值,左边指针++
     *      如果左边值大于右边值，那么使用右边值
     *      否则使用左边值
     */
    public static void merge(Comparable[] a , int lo, int mid, int hi){

        int i = lo; //左边的指针
        int j = mid + 1;  //右边的指针

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {

            if( i > mid ){
                a[k] = aux[j++];
            }else if(j > hi){
                a[k] = aux[i++];
            }else if(less(aux[j],aux[i])){
                a[k] = aux[j++];
            }else{
                a[k] = aux[i++];
            }

        }
    }

    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a,0,a.length-1);
    }

    /**
     * 先排序左边的，后排序右边的，何时退出？
     * @param a
     * @param lo
     * @param hi
     */
    public static void sort(Comparable[] a,int lo,int hi){
        if(hi <= lo ) return;
        int mid = lo + (hi - lo) /2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }

    public static void main(String[] args) {
        String[] s= "m,e,r,g,e,s,o,r,t,e,x,a,m,p,l,e".split(",");
        MergePractise.sort(s);
        show(s);
    }

}
