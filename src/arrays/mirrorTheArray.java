package arrays;

/**
 * Created by Demandred on 2/23/14.
 */

import javafx.util.converter.IntegerStringConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class mirrorTheArray {
    public static void main(String[] args) {

        Scanner theScanner = new Scanner(System.in);
         System.out.println("Please enter the desired array lenght");
        int theLength = Integer.parseInt(theScanner.next());
       // System.out.println("The lenght is " + theLength);

        double[] theArray = new double[theLength];

        for (int y =0; y<theLength; y++){
            theArray[y] = (Math.random() * 100);
        }
        Arrays.sort(theArray);

        //swap first and last items in the arrays
System.out.println(Arrays.toString(theArray));

        double[] tempArray = new double[theLength];
        for(int i = 0, j = theLength-1; i<theLength; i++){
            tempArray[j] = theArray[i];
            j--;
        }
        System.out.println(Arrays.toString(tempArray));
    }


}
