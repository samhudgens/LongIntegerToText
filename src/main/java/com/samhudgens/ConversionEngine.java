package com.samhudgens;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by samhudgens on 6/13/16.
 */
public class ConversionEngine {


    public String convertNumbers() {

        NumberConverter numberConverter = new NumberConverter();
        HundredsWordConverter hundredsWordConverter = new HundredsWordConverter();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();



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

        return finalProduct;


    }
}


//            if(!input.matches("\\d+")){
//                if(input.equals("off")){
//                    System.out.println("System off");
//                    break;
//                }
//                System.out.println("That's not a valid input, please enter something else");
//                continue;
//            }