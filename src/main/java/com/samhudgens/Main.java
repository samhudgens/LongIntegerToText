package com.samhudgens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by samhudgens on 6/9/16.
 */
public class Main {

    public static String[] numberArray;
    public static ArrayList<String> reversedNumberArrayList = new ArrayList<String>();


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = in.readLine()) != null) {



        }
    }


    /*
    After converting the input String into a String[] Array, create an ArrayList with those elements
    reversed for further processing in subsequent methods. Reversing them will make it easy to write
    methods where the first three elements are Ones, the next three elements are Thousands, and the
    last three elements are Millions.
    At the beginning of the main method, an input of 123456789 is converted into
    String[] = {"1","2","3","4","5","6","7","8","9"}, and then this method will create an ArrayList
    with those elements reversed, asList("9","8","7","6","5","4","3","2","1").
     */

    public static ArrayList<String> createReversedNumberArrayList(String[] numberArray){
        for(int i=numberArray.length-1; i>=0; i--){
            reversedNumberArrayList.add(numberArray[i]);
        }
        return reversedNumberArrayList;
    }

    /*
    Separate the previous ArrayList into a new ArrayList where each element is up to three digits long. Each element is a number <= 999, so that they can later be processed into Ones, Thousands,
    and Millions. If the input arraylist is ("4","0","8","2","1"), by the time it reaches
    this method it will become an ArrayList of ("408","21").
     */

    public static ArrayList<String> separateArrayListIntoGroupsOfThree(ArrayList<String> input) {
        return null;
    }

    /*
    After applying previous methods, each element of the ArrayList is the reverse of what is needed for the final answer, so another method is needed to reverse each element so that they match the original input again. When this method is finished, an original String of "123456789" will now
    be ["789","456","123"]
     */

    public static ArrayList<String> reverseEachArrayListElement(ArrayList<String> input){
        return null;
    }

    /*
    After separating our original input into manageable blocks of hundreds, this method will be called
    to convert each number into the word equivalent (e.g. an element "486" will become
    "FourHundredEightySix".
    This method will probably require a HashMap or Array populated with the word equivalents of
    numbers 1-19, 20, 30, 40, 50, 60, 70, 80, 90, 100("Hundred")
     */
    public static String convertHundredsIntoWords(String input) {
        return null;
    }

    /*
    The following method will be called after each element of <999 has been converted into the
    word equivalent. Because the array has been reversed, it will leave the first element unchanged
    (ones group), append "Thousand" to the second element, and append "Million" to the third
    element.
     */

    public static ArrayList<String> appendGroupingWords(ArrayList<String> input){
        return null;
    }

    /*
    The next method will reverse the ArrayList, so that
    ("SevenHundredEightyNine","FourHundredFiftySixThousand","OneHundredTwentyThreeMillion")
    will be switched to
    ("OneHundredTwentyThreeMillion","FourHundredFiftySixThousand","SevenHundredEightyNine")
     */

    public static ArrayList<String> reOrderReversedGroupedArrayList(ArrayList<String> input) {
        return null;
    }


    /*
    The next method will concatenate the ArrayList into one String and append "Dollars".
    ("OneHundredTwentyThreeMillion","FourHundredFiftySixThousand","SevenHundredEightyNine")
    will become
    "OneHundredTwentyThreeMillionFourHundredFiftySixThousandSevenHundredEightyNineDollars"
     */

    public static String concatenateIntoStringAndAddDollars(ArrayList<String> input){
        return null;
    }







//    public static String[] reverseStringArray(String[] input) {
//        String[] newArray = new String[input.length];
//        for(int i=0; i<newArray.length; i++) {
//            newArray[i] = input[input.length - i - 1];
//        }
//        return newArray;
//    }

}
