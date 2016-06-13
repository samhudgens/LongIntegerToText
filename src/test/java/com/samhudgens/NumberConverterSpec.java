package com.samhudgens;

import com.samhudgens.NumberConverter;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


/**
 * Created by samhudgens on 6/9/16.
 */
public class NumberConverterSpec {

    String s = "123456789";
    public static String[] numberArray;
    public static ArrayList<String> reversedNumberArrayList = new ArrayList<String>();
    public static ArrayList<String> testReversedNumberArrayList = new ArrayList<String>();
    public static ArrayList<String> testGroupOfThreeArrayList = new ArrayList<String>();
    NumberConverter numberConverter = new NumberConverter();

    boolean runOnce = true;
    @Before
    public void initialize() {

            numberArray = s.split("");
//            testReversedNumberArrayList.add("9");
//            testReversedNumberArrayList.add("8");
//            testReversedNumberArrayList.add("7");
//            testReversedNumberArrayList.add("6");
//            testReversedNumberArrayList.add("5");
//            testReversedNumberArrayList.add("4");
//            testReversedNumberArrayList.add("3");
//            testReversedNumberArrayList.add("2");
//            testReversedNumberArrayList.add("1");
    }

    @Test
    public void createReversedNumberArrayTest(){
        testReversedNumberArrayList.add("9");
        testReversedNumberArrayList.add("8");
        testReversedNumberArrayList.add("7");
        testReversedNumberArrayList.add("6");
        testReversedNumberArrayList.add("5");
        testReversedNumberArrayList.add("4");
        testReversedNumberArrayList.add("3");
        testReversedNumberArrayList.add("2");
        testReversedNumberArrayList.add("1");
        ArrayList<String> expected = testReversedNumberArrayList;
        ArrayList<String> actual = numberConverter.createReversedNumberArrayList(numberArray);
        assertEquals(expected, actual);
    }

    @Test
    public void separateArrayListIntoGroupsOfThreeTest() {
        testGroupOfThreeArrayList.add("987");
        testGroupOfThreeArrayList.add("654");
        testGroupOfThreeArrayList.add("321");
        ArrayList<String> input = numberConverter.createReversedNumberArrayList(numberArray);
        ArrayList<String> expected = testGroupOfThreeArrayList;
        System.out.println(testGroupOfThreeArrayList);
        ArrayList<String> actual = numberConverter.separateArrayListIntoGroupsOfThree(input);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void separateArrayListIntoGroupsOfThreeTestPart2(){
        ArrayList<String> otherTestGroupOfThreeArrayList = new ArrayList<String>();
        otherTestGroupOfThreeArrayList.add("987");
        otherTestGroupOfThreeArrayList.add("654");
        otherTestGroupOfThreeArrayList.add("3");
        String[] otherNumberArray = {"3","4","5","6","7","8","9"};
        ArrayList<String> input = numberConverter.createReversedNumberArrayList(otherNumberArray);
        ArrayList<String> expected = otherTestGroupOfThreeArrayList;
        ArrayList<String> actual = numberConverter.separateArrayListIntoGroupsOfThree(input);
        System.out.println(expected);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void reverseEachArrayListElementTest(){
        ArrayList<String> testArrayEachElementReversed = new ArrayList<String>();
        testArrayEachElementReversed.add("789");
        testArrayEachElementReversed.add("456");
        testArrayEachElementReversed.add("123");
        ArrayList<String> inputArrayList = new ArrayList<String>();
        inputArrayList.add("987");
        inputArrayList.add("654");
        inputArrayList.add("321");
        ArrayList<String> expected = testArrayEachElementReversed;
        ArrayList<String> actual = numberConverter.reverseEachArrayListElement(inputArrayList);
        assertEquals(expected, actual);
    }



    @Test
    public void appendGroupingWordsTest(){
        ArrayList<String> testArrayList = new ArrayList<String>();
        testArrayList.add("SevenHundredEightyNine");
        testArrayList.add("FourHundredFiftySixThousand");
        testArrayList.add("OneHundredTwentyThreeMillion");
        ArrayList<String> inputArrayList = new ArrayList<String>();
        inputArrayList.add("SevenHundredEightyNine");
        inputArrayList.add("FourHundredFiftySix");
        inputArrayList.add("OneHundredTwentyThree");
        ArrayList<String> expected = testArrayList;
        ArrayList<String> actual = numberConverter.appendGroupingWords(inputArrayList);
        assertEquals(expected, actual);
    }

    @Test
    public void reverseGroupedArrayListTest() {
        ArrayList<String> testArrayList = new ArrayList<String>();
        testArrayList.add("OneHundredTwentyThreeMillion");
        testArrayList.add("FourHundredFiftySixThousand");
        testArrayList.add("SevenHundredEightyNine");
        ArrayList<String> inputArrayList = new ArrayList<String>();
        inputArrayList.add("SevenHundredEightyNine");
        inputArrayList.add("FourHundredFiftySixThousand");
        inputArrayList.add("OneHundredTwentyThreeMillion");
        ArrayList<String> expected = testArrayList;
        ArrayList<String> actual = numberConverter.reverseGroupedArrayList(inputArrayList);
        assertEquals(expected, actual);
    }

    @Test
    public void concatenateIntoStringAndAddDollarsTest(){
        ArrayList<String> inputArrayList = new ArrayList<String>();
        inputArrayList.add("OneHundredTwentyThreeMillion");
        inputArrayList.add("FourHundredFiftySixThousand");
        inputArrayList.add("SevenHundredEightyNine");
        String expected = "OneHundredTwentyThreeMillionFourHundredFiftySixThousandSevenHundredEightyNineDollars";
        String actual = numberConverter.concatenateIntoStringAndAddDollars(inputArrayList);
        assertEquals(expected, actual);
    }
}
