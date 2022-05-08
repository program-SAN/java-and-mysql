package com.company;

import java.util.Arrays;
import java.util.Scanner;
class Binary_Hexa {
    /*   int x,y,z,output;
       Scanner sc= new Scanner(System.in);
        x= sc.nextInt();
        y= sc.nextInt();
        z= sc.nextInt();
       output=(x^y)^z;
       System.out.println(output);

// string wala hai

       static String xoring (String a, String b,String c,int n){
           String ans = "";

           for (int i = 0; i < n; i++) {
               // If the Character matches
               if ((a.charAt(i)==b.charAt(i) && a.charAt(i)==c.charAt(i)) && b.charAt(i)==c.charAt(i))
                   ans += "0";
               else
                   ans += "1";
           }
           return ans;
       }
       public static void main (String[]args)
       {
           String a = "1010";
           String b = "1101";
           String c = "0011";
           int n = a.length();
           String d = xoring(a, b, c ,n);
           System.out.println(d);
       }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//reading the number of elements from the that we want to enter
        double[] array = new double[3];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < 3; i++) {
//reading array elements from the user
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            //    System.out.println(array[i]);
        }
        String strArray[] = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            strArray[i] = String.valueOf(array[i]);
        }

        System.out.println(Arrays.toString(strArray));

        for (int i = 0; i < strArray.length; i++) {
            String ans = "", output = "";

            for (i = 0; i < strArray.length; i++) {
                // If the Character matches
                if (strArray[1].charAt(i) == strArray[2].charAt(i))
                    ans += "0";

                else
                    ans += "1";

            }
            System.out.println(ans);

            /*for (i = 0; i < strArray.length+1; i++) {
                // If the Character matches
                if (ans.charAt(i) == strArray[3].charAt(i))
                    output += "0";

                else
                    output += "1";
             */
    /*public static void main(String[] args) {
        int[] arr1 = {1,1,0,1};
        int[] arr2 = {0,0,1,1};
        int[] arr3 = {1,1,1,1};

        int[][] arrays = {arr1, arr2, arr3};

        for (int[] array : arrays) {
            for (int i:array){
                System.out.print(i + " ");
            }
            System.out.println();
        }*/


     
}


