package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //taskN1
        int[] ff = new int []{};
        System.out.println(Arrays.toString(reverse(ff)));

        //taskN2
        System.out.println(namsur("makaradze oto makaradzeze"));
        //taskN3
        System.out.println(sheep(5));


    }
    //taskN1
    public static int[] reverse (int[] orig) {
        int[] rev = new int[orig.length];

        for(int elem = 0; elem < orig.length; elem++) {
            rev[elem] = -1 * orig[elem];
        }

        return rev;
    }

    //taskN2
    public static String namsur(String str){
        String[] raw = str.split("\\s+");
        String finalAns = "";
        for(String elem : raw) {
            finalAns += String.valueOf(elem.charAt(0)).toUpperCase() + ".";
        }
        finalAns = finalAns.substring(0, finalAns.length() - 1);
        return finalAns;
    }

    //taskN3
    public static String sheep(Integer count) {
        String cn = "";
        for (int i = 1; i <= count; i++) {
             cn += i + "sheep...";
        }
            return cn;
    }


}