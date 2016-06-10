package com.samhudgens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

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

        boolean isOn = true;

        System.out.println("Enter a number from 1 to 999,999,999 (without commas)");
        System.out.println("To end the program, enter \"off\"");

        NumberConverter numberConverter = new NumberConverter();
        HundredsWordConverter hundredsWordConverter = new HundredsWordConverter();


        while(isOn) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if(!input.matches("\\d+")){
                if(input.equals("off")){
                    System.out.println("System off");
                    break;
                }
                System.out.println("That's not a valid input, please enter something else");
                continue;
            }

            String[] newInput = input.split("");

            ArrayList<String> reversedArray = numberConverter.createReversedNumberArrayList(newInput);

            ArrayList<String> separatedArray = numberConverter.separateArrayListIntoGroupsOfThree(reversedArray);

            ArrayList<String> correctedHundredsArray = numberConverter.reverseEachArrayListElement(separatedArray);

            ArrayList<String> wordsArray = new ArrayList<String>();

            for (int i = 0; i < correctedHundredsArray.size(); i++) {
                wordsArray.add(hundredsWordConverter.convertHundredNumberToWordFormat(correctedHundredsArray.get(i)));
            }

            ArrayList<String> wordsArrayWithGroupingWords = numberConverter.appendGroupingWords(wordsArray);

            ArrayList<String> reversedGroupingWords = numberConverter.reverseGroupedArrayList(wordsArrayWithGroupingWords);

            String finalProduct = numberConverter.concatenateIntoStringAndAddDollars(reversedGroupingWords);

            System.out.println(input);
            System.out.println(finalProduct);
            
        }






    }
}
