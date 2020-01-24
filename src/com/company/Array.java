package com.company;

import java.awt.font.FontRenderContext;

public class Array {

    public static void main(String[] args) {
        DisplayReverseArray();
        StringArray();
        /*int d[ ] = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println( d.length);
        for (int i=0; i <d.length;i++)
        {
            System.out.println(d[i]);}
        int [] x,y; //both are array
        int x2,y2[];// 1- int,2-array
        int x3[],y3;// 1-array,2-int
        int [] x4,y4[];// x4-1d array ,y4 -2d array
        y4 = new int[3][3];
        System.out.println("using compact for(:)");
        for (int p:d){
            System.out.println(p);}
        /*create and array of n integer element and find the sum,average,min and max*/
     /*   public static void findArray()
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int max,min,avg,sum;
        sum=0;
        max =0;
        min=a[0];
        for ( i=0; i< n,i++);*/
    }
    //write a java program to display array  of strings containing 10 elements*/
    //public static void stringArrayHandling()


    public static void DisplayReverseArray() {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i] + " ");

        }
    }

public static void StringArray(){
        String city[];
        city = new String[10];
        city [0] = "canada";
    city [1] = "india";
    city [2] = "toronto";
    city [3] = "nepal";
    city [4] = "new york";
    city [5] = "patel";
    city [6] = "raman";
    city [7] = "inshant";
    city [8] = "scarborough";
    city [9] = "north york";
for (int i=0;i<city.length;i++){
    System.out.println(city[i]);
    String rev = reversesString(city[i]);
    System.out.println(city [i] + " <->"+  rev);
}


}
public static String reversesString(String s)
{ String temp= new String();
char names[] = s.toCharArray();
int len =names.length;
//for ( int i=names.length-1;i>=0;i--)
//{
  //  System.out.println(names[i]);
    for ()



}

return null;
}
}

