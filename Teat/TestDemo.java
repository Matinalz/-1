package Teat;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-03 19:22
 */
class To{
    public void search(int[] a,int b){
        int i = 0;
        for (i = 0; i < a.length; i++) {
            if(b == a[i]){
                break;
            }
        }
        if(i == a.length-1){
            System.out.println(a[i]);
        }
        for (int j = i+1; j < a.length; j++) {
            if(b != a[j]){
                System.out.println(a[i]);
                break;
            }
            else if(b == a[j]){
                System.out.println("数字重复");
                break;
            }
        }
    }
}
class dos{

    public void indexSearch(int[] n,int x){
        int head = 0;
        int end = n.length-1;
        int mid = 0;
        mid = (end -head)>>>1;
        for (int i = 0; i < n.length; i++) {

            if(x == n[mid]){
                System.out.println(n[mid]);
                break;
            }else if(x > n[mid]){
                mid = (end +mid)>>>1;
            }else if(x < n[mid]){
                mid = mid>>>1;
            }
        }
    }
    public int[] copyOf(int[] a){
        int[] e = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            e[i] = a[i];
        }
        return e;
    }
}
class Array{
    public void toString(int[] w){
        System.out.print("[");
        for (int i = 0; i < w.length; i++) {
           if(i<=w.length-2){
               System.out.print(w[i]+",");
           }
            else if(i == w.length-1){
               System.out.print(w[i]);
           }
        }
        System.out.println("]");
    }
}
class ds{
    public static void hello(){
        System.out.println("hello");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        int[] s = {12,32,212};
        ds h =null;
        h.hello();
    }
    public static void main3(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        Array array =new Array();
        array.toString(arr);
    }
    public static void main2(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        dos ds = new dos();
        System.out.println(Arrays.toString(ds.copyOf(arr)));
    }
    public static void main1(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        dos ds = new dos();
        ds.indexSearch(arr,8);
    }
}
