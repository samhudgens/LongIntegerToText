package com.samhudgens;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by samhudgens on 6/9/16.
 */
public class HundredsWordConverter {



//    public static String[] oneThroughNinetyNine = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty","TwentyOne","TwentyTwo","TwentyThree","TwentyFour","TwentyFive","TwentySix","TwentySeven","TwentyEight","TwentyNine","Thirty","ThirtyOne","ThirtyTwo","ThirtyThree","ThirtyFour","ThirtyFive","ThirtySix","ThirtySeven","ThirtyEight","ThirtyNine","Forty","FortyOne","FortyTwo","FortyThree","FortyFour","FortyFive","FortySix","FortySeven","FortyEight","FortyNine","Fifty","FiftyOne","FiftyTwo","FiftyThree","FiftyFour","FiftyFive","FiftySix","FiftySeven","FiftyEight","FiftyNine","Sixty","SixtyOne","SixtyTwo","SixtyThree","SixtyFour","SixtyFive","SixtySix","SixtySeven","SixtyEight","SixtyNine","Seventy","SeventyOne","SeventyTwo","SeventyThree","SeventyFour","SeventyFive","SeventySix","SeventySeven","SeventyEight","SeventyNine","Eighty","EightyOne","EightyTwo","EightyThree","EightyFour","EightyFive","EightySix","EightySeven","EightyEight","EightyNine","Ninety","NinetyOne","NinetyTwo","NinetyThree","NinetyFour","NinetyFive","NinetySix","NinetySeven","NinetyEight","NinetyNine"};

    public String[] oneThroughNine = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public String[] teenWords = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen", "Nineteen"};

    public String[] tensGroupWords = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety","Hundred"};

    public String[] hundredsGroupWords = {"","OneHundred","TwoHundred","ThreeHundred","FourHundred","FiveHundred","SixHundred","SevenHundred","EightHundred","NineHundred"};


//    public Map<String,String> lessThanTenWordMap = new HashMap<String,String>();
//    public Map<String,String> tensWordMap = new HashMap<String,String>();
//    public Map<String,String> teensWordMap = new HashMap<String, String>();
//    public Map<String,String> hundredsWordMap = new HashMap<String, String>();
//
//    public void fillMaps() {
//        lessThanTenWordMap.put("0", "");
//        lessThanTenWordMap.put("1","One");
//        lessThanTenWordMap.put("2","Two");
//        lessThanTenWordMap.put("3","Three");
//        lessThanTenWordMap.put("4","Four");
//        lessThanTenWordMap.put("5","Five");
//        lessThanTenWordMap.put("6","Six");
//        lessThanTenWordMap.put("7","Seven");
//        lessThanTenWordMap.put("8","Eight");
//        lessThanTenWordMap.put("9","Nine");
//        lessThanTenWordMap.put("10","Ten");
//        lessThanTenWordMap.put("11","Eleven");
//        lessThanTenWordMap.put("12","Twelve");
//        lessThanTenWordMap.put("13","Thirteen");
//        lessThanTenWordMap.put("14","Fourteen");
//        lessThanTenWordMap.put("15","Fifteen");
//        lessThanTenWordMap.put("16","Sixteen");
//        lessThanTenWordMap.put("17","Seventeen");
//        lessThanTenWordMap.put("18","Eighteen");
//        lessThanTenWordMap.put("19","Nineteen");
//
//    }

    public int[] convertStringToIntArray(String input){
        return null;
    }



    public String convertHundredNumberToWordFormat(String inputNumber) {

        StringBuilder sb = new StringBuilder();
        String[] inputNumberArray = inputNumber.split("");
        int targetIndex;
        int tensDigitIndex;
        int hundredsDigitIndex;

        if (inputNumber.length() == 1) {
            targetIndex = Integer.parseInt(inputNumber);
            sb.append(oneThroughNine[targetIndex]);
        }

//        if(inputNumber.length() == 2){
//            targetIndex = Integer.parseInt(inputNumber);
//            sb.append(oneThroughNinetyNine[targetIndex]);
//        }

        if (inputNumber.length() == 2) {
            if(inputNumberArray[0].matches("1")) {
                targetIndex = Integer.parseInt(inputNumberArray[1]);
                sb.append(teenWords[targetIndex]);
            }
            else if(inputNumberArray[0].matches("[02-9]")){
                tensDigitIndex = Integer.parseInt(inputNumberArray[0]);
                targetIndex = Integer.parseInt(inputNumberArray[1]);
                sb.append(tensGroupWords[tensDigitIndex]);
                sb.append(oneThroughNine[targetIndex]);
            }

        }

        if(inputNumber.length() == 3) {
            hundredsDigitIndex = Integer.parseInt(inputNumberArray[0]);
            sb.append(hundredsGroupWords[hundredsDigitIndex]);
            if(inputNumberArray[1].matches("1")){
                targetIndex = Integer.parseInt(inputNumberArray[2]);
                sb.append(teenWords[targetIndex]);
            }
            else if(inputNumberArray[1].matches("[02-9]")){
                tensDigitIndex = Integer.parseInt(inputNumberArray[1]);
                targetIndex = Integer.parseInt(inputNumberArray[2]);
                sb.append(tensGroupWords[tensDigitIndex]);
                sb.append(oneThroughNine[targetIndex]);
            }
        }

        return sb.toString();
    }




//        //three digit numbers without teens
//        String threeDigitsWithoutTeens = "^[0-9][2-9][0-9]";
//
//        //String threeDigitsWithTeens = "^["
//
//        String oneEndingZero = "[1-9]{2}0$";
//        String middleZero = "[1-9]0[1-9]";
//        String twoEndingZeros = "[1-9]00";
//        String oneLeadingZero = "0[1-9]{2}";
//        String twoLeadingZeros = "00[1-9]";
//        String allZeros = "000";
//
//
//
//        String twoDigitsAboveTeens = "[2-9]{2}";
//        String twoDigitsTeens = "1";
//        String oneDigit = "[1-9]";
//
//
//        int numberAsInt = Integer.parseInt(number);
//
//        String[] numberAsStringArray = number.split("");
//
//        String hundredWord = "";
//
//        if(number.matches(threeDigitsWithoutTeens)){
//            hundredWord += lessThanTenWordMap.get(number.charAt(0)) + lessThanTenWordMap.get(number.charAt(1) + number.charAt(2));
//
//        }

//        if(number.matches(oneEndingZero)){}
//
//        if(number.matches(middleZero)){}
//
//        if(number.matches(twoEndingZeros)){}
//
//        if(number.matches(oneLeadingZero)){}
//
//        if(number.matches(twoLeadingZeros)){}
//
//        if(number.matches(allZeros)){}


}
