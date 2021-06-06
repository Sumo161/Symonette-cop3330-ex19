package ex18;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nyles Symonette
 */

import java.util.Scanner;
import java.lang.*;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height in inches ");
        double height = sc.nextDouble();
        System.out.println("Enter the weight in inches ");
        double weight = sc.nextDouble();

        //establish BMI
        double BMI = (weight / (height * height))*703;

        System.out.println("Your BMI is " +String.format("%.2f",BMI));

        if(BMI >= 18.5 && BMI <=25){
            System.out.println("You are within the ideal weight range");
        }
        else if(BMI >25){
            System.out.println("You are overweight, you should see the doctor");
        }
        else if(BMI < 18.5){
            System.out.println("You are underweight, you should see a doctor");
        }

    }
}
