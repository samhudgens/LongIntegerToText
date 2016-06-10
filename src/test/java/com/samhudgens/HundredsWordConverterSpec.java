package com.samhudgens;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Created by samhudgens on 6/9/16.
 */
public class HundredsWordConverterSpec {

    HundredsWordConverter hundredsWordConverter = new HundredsWordConverter();

//    @Test
//    public void convertStringToIntArrayTest(){
//        int[] expected = {1,2,3};
//        int[] actual = hundredsWordConverter.convertStringToIntArray("123");
//        assertEquals(expected, actual);
//    }

    @Test
    public void convertHundredNumberToWordFormatTest(){
        String expected1 = "Four";
        String expected2 = "FiftyFour";
        String expected3 = "TwoHundredSeven";
        String expected4 = "ThreeHundredTwentyEight";
        String expected5 = "ThirtyFive";
        String expected7 = "FiveHundredSeventeen";
        String actual1 = hundredsWordConverter.convertHundredNumberToWordFormat("4");
        String actual2 = hundredsWordConverter.convertHundredNumberToWordFormat("54");
        String actual3 = hundredsWordConverter.convertHundredNumberToWordFormat("207");
        String actual4 = hundredsWordConverter.convertHundredNumberToWordFormat("328");
        String actual5 = hundredsWordConverter.convertHundredNumberToWordFormat("035");
        String actual6 = hundredsWordConverter.convertHundredNumberToWordFormat("004");
        String actual7 = hundredsWordConverter.convertHundredNumberToWordFormat("517");
        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
        assertEquals(expected3,actual3);
        assertEquals(expected4,actual4);
        assertEquals(expected5,actual5);
        assertEquals(expected1, actual6);
    }

}
