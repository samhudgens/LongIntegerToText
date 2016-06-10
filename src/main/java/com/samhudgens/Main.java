package com.samhudgens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by samhudgens on 6/9/16.
 */
public class Main {

//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String s;
//        while ((s = in.readLine()) != null) {
//
//
//
//        }
//    }


    public static void main(String[] args) {

        HundredsWordConverter hundredsWordConverter = new HundredsWordConverter();

        System.out.println(hundredsWordConverter.convertHundredNumberToWordFormat("104"));
    }
}
