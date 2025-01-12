package com.zipcodewilmington;

import java.sql.SQLOutput;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
         return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                result = true;
            }
        }
        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        for (int i =array.length-1; i>=0;i--){
            result[array.length-1-i] = array[i];
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean answer = true ;
        String[] result = new String[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            result[array.length - 1 - i] = array[i];
        }
        if (Arrays.equals(array,result)) {
            answer=  true;
        } else {
            answer= false;
        }
        return answer;
    }



    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] abcCheckList = new boolean[26];
        int listNumber = 0;
        boolean result = true;

        String tempString = "";
        for (String n: array)
            tempString+= n;
        char[] charArray = tempString.toCharArray();


        for (int i = 0 ; i < charArray.length; i++){
            if ('A' <= charArray[i] &&
                    charArray[i] <= 'Z')

                listNumber = charArray[i] - 'A';

            else if('a' <= charArray[i] &&
                    charArray[i] <= 'z')

                listNumber = charArray[i] - 'a';
                abcCheckList[listNumber] = true;


        }
        for (int i = 0; i <= 25; i++)
            if (!abcCheckList[i])
               result = false;

        else result =  true;
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i =0 ; i < array.length ; i++){
            if (array[i]==value){counter += 1;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int counter = 0;
        for (int i = 0 ; i < array.length ; i++){
            if(array[i] == valueToRemove){
                counter +=1;
            }
        }

        String[] result = new String[array.length-counter];

        int r = 0;
        for (int a=0 ; a< array.length ; a++){
            if (array[a] != valueToRemove){
                result[r] = array[a];
                r++;
            }

        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> removeString = new ArrayList<>();
        removeString.add(array[0]);

        for (int i =1 ; i < array.length ; i++){

            if (array[i] != array[i-1]){
                removeString.add(array[i]);

            }
        }
        return removeString.toArray(new String[removeString.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String newArray = array[0];

        for(int i =1; i < array.length; i++){
            if (array[i-1] == array[i]){
                newArray +=array[i];
            }
            else newArray+=  " "+ array[i];

        }
        String[] result = newArray.split(" ");
        System.out.println(newArray);
        return result;
    }


}
