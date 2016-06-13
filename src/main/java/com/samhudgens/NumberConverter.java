package com.samhudgens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by samhudgens on 6/9/16.
 */
public class NumberConverter {

    public String[] numberArray;
    public ArrayList<String> reversedNumberArrayList = new ArrayList<String>();


    public ArrayList<String> createReversedNumberArrayList(String[] numberArray){
        for(int i=numberArray.length-1; i>=0; i--){
            reversedNumberArrayList.add(numberArray[i]);
        }
        return reversedNumberArrayList;
    }



    public ArrayList<String> separateArrayListIntoGroupsOfThree(ArrayList<String> inputArrayList) {

        String str = "";
        String lastString = "";
        int counter = 1;

        ArrayList<String> newArrayList = new ArrayList<String>();

        if(inputArrayList.size() % 3 == 0) {

            for(int i=0; i<inputArrayList.size(); i++){

                str += inputArrayList.get(i);
                if(counter % 3 == 0){
                    newArrayList.add(str);
                    str = "";
                }
                counter++;
            }
        }

        else {
            ArrayList<String> firstElements = new ArrayList<String>();
            for(int i=0; i<inputArrayList.size(); i++){

                str += inputArrayList.get(i);
                if(counter % 3 == 0){
                    firstElements.add(str);
                    str = "";
                }
                counter++;
            }
            for(int i=inputArrayList.size() - inputArrayList.size() % 3; i<inputArrayList.size(); i++) {
                lastString += inputArrayList.get(i);
            }
            firstElements.add(lastString);
            newArrayList = firstElements;
        }
        return newArrayList;
    }



    public ArrayList<String> reverseEachArrayListElement(ArrayList<String> inputArrayList){

        ArrayList<String> newArrayList = new ArrayList<String>();

        for(int i=0; i<inputArrayList.size(); i++){
            newArrayList.add(new StringBuilder(inputArrayList.get(i)).reverse().toString());
        }

        return newArrayList;
    }


    public ArrayList<String> appendGroupingWords(ArrayList<String> inputArrayList){

        ArrayList<String> newArrayList = new ArrayList<String>();
        newArrayList.add(inputArrayList.get(0));
        try {
            if (inputArrayList.get(1) != null && inputArrayList.get(1).equals("000")){
                newArrayList.add(inputArrayList.get(1));
            }
            if (inputArrayList.get(1) != null) {
                newArrayList.add(inputArrayList.get(1) + "Thousand");
            }
            if (inputArrayList.get(2) != null) {
                newArrayList.add(inputArrayList.get(2) + "Million");
            }
        } catch (IndexOutOfBoundsException e) {
            // allows for numbers less than a million
        }

        return newArrayList;
    }


    public ArrayList<String> reverseGroupedArrayList(ArrayList<String> inputArrayList) {
        if(inputArrayList.size() > 1) {
            String element = inputArrayList.remove(0);
            reverseGroupedArrayList(inputArrayList);
            inputArrayList.add(element);
        }
        return inputArrayList;
    }



    public String concatenateIntoStringAndAddDollars(ArrayList<String> inputArrayList){

        String result = "";
        for(int i=0; i<inputArrayList.size(); i++){
            result += inputArrayList.get(i);
        }
        result += "Dollars";

        return result;
    }


}
