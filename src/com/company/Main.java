package com.company;

public class Main {

    private String word;



    public static void main(String[] args) {
        System.out.println(rle("aaaabbaccca"));


	// write your code here
    }

    public static String rle(String word) {
        int count = 1;
        char previousLetter ='a';
        char[] letters = word.toCharArray();
        String finalWord ="";
        boolean firstTime =true;
        for ( char letter : letters){
            if (firstTime){
                previousLetter = letter;
                firstTime=false;
                finalWord += previousLetter;

            }else{
                if (letter == previousLetter) {
                    count++;
                }
                else{
                    if (count == 2){
                        finalWord += previousLetter;
                    }

                    else if (count>2){
                        finalWord += count;
                        count = 1;
                    }
                    previousLetter = letter;
                    finalWord += previousLetter;
                }
            }

        }
        return finalWord;

    }
}
