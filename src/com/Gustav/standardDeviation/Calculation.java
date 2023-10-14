package com.Gustav.standardDeviation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculation {

    Scanner sc = new Scanner(System.in);
    List<Double> valueList = new ArrayList<>();

    Calculation() {

        setValue(valueList, sc);

    }


    public void setValue(List<Double> valueList, Scanner sc) {

        for (double i = 0; i < 4; i++) {

            double sum = 0;


            for (double j = 0; j < 4; j++) {

                System.out.print("Enter value: ");
                double value = sc.nextInt();
                valueList.add(value);

                sum += value;
            }

            double middleValue = sum / 4;
            double deviation = 0;
            double deviationSquare = 0;


            for (double value : valueList) {
                deviation = value - middleValue;

                deviationSquare += deviation * deviation;


            }

            double variance = deviationSquare / 3;


            double standardDeviation = Math.sqrt(variance);

            displayMessage(middleValue, standardDeviation, variance);

        }

    }

    public void displayMessage( double middleValue, double standardDeviation, double variance ){

        System.out.println("The middle value of the entered numbers is: " + middleValue +
                "\nThe standard deviation of the entered numbers is: " + standardDeviation +
                "\nThe variance of the entered numbers is: " + variance);
    }
}



