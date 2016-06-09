import com.samhudgens.Main;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static java.util.Arrays.asList;


/**
 * Created by samhudgens on 6/9/16.
 */
public class MainSpec {

    String s = "123456789";
    public static String[] numberArray;
    public static ArrayList<String> reversedNumberArrayList = new ArrayList<String>();
    public static ArrayList<String> testReversedNumberArrayList = new ArrayList<String>();
    public static ArrayList<String> testGroupOfThreeArrayList = new ArrayList<String>();

    @Before
    public void initialize() {
        numberArray = s.split("");
        testReversedNumberArrayList.add("9");
        testReversedNumberArrayList.add("8");
        testReversedNumberArrayList.add("7");
        testReversedNumberArrayList.add("6");
        testReversedNumberArrayList.add("5");
        testReversedNumberArrayList.add("4");
        testReversedNumberArrayList.add("3");
        testReversedNumberArrayList.add("2");
        testReversedNumberArrayList.add("1");
    }

    @Test
    public void createReversedNumberArrayTest(){
        ArrayList<String> expected = testReversedNumberArrayList;
        ArrayList<String> actual = Main.createReversedNumberArrayList(numberArray);
        assertEquals(expected, actual);
    }

    @Test
    public void separateArrayListIntoGroupsOfThreeTest() {
        testGroupOfThreeArrayList.add("987");
        testGroupOfThreeArrayList.add("654");
        testGroupOfThreeArrayList.add("321");
        ArrayList<String> input = Main.createReversedNumberArrayList(numberArray);
        ArrayList<String> expected = testGroupOfThreeArrayList;
        ArrayList<String> actual = Main.separateArrayListIntoGroupsOfThree(input);
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
        ArrayList<String> actual = Main.reverseEachArrayListElement(inputArrayList);
        assertEquals(expected, actual);
    }

    @Test
    public void convertHundredsIntoWordsTest() {
        String expected1 = "SevenHundredEightyNine";
        String expected2 = "FiveHundredSeventeen";
        String expected3 = "FourHundredNine";
        String expected4 = "TwentyThree";
        String expected5 = "TwentyFour";
        String actual1 = Main.convertHundredsIntoWords("789");
        String actual2 = Main.convertHundredsIntoWords("517");
        String actual3 = Main.convertHundredsIntoWords("409");
        String actual4 = Main.convertHundredsIntoWords("023");
        String actual5 = Main.convertHundredsIntoWords("24");
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
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
    }

    @Test
    public void reOrderReversedGroupedArrayListTest() {
        ArrayList<String> testArrayList = new ArrayList<String>();
        testArrayList.add("OneHundredTwentyThreeMillion");
        testArrayList.add("FourHundredFiftySixThousand");
        testArrayList.add("SevenHundredEightyNine");
        ArrayList<String> inputArrayList = new ArrayList<String>();
        inputArrayList.add("SevenHundredEightyNine");
        inputArrayList.add("FourHundredFiftySixThousand");
        inputArrayList.add("OneHundredTwentyThreeMillion");
        ArrayList<String> expected = testArrayList;
        ArrayList<String> actual = Main.reOrderReversedGroupedArrayList(inputArrayList);
        assertEquals(expected, actual);
    }

    @Test
    public void concatenateIntoStringAndAddDollarsTest(){
        ArrayList<String> inputArrayList = new ArrayList<String>();
        inputArrayList.add("OneHundredTwentyThreeMillion");
        inputArrayList.add("FourHundredFiftySixThousand");
        inputArrayList.add("SevenHundredEightyNine");
        String expected = "OneHundredTwentyThreeMillionFourHundredFiftySixThousandSevenHundredEightyNineDollars";
        String actual = Main.concatenateIntoStringAndAddDollars(inputArrayList);
        assertEquals(expected, actual);
    }
}
