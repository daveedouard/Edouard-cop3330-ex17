/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex17;

import java.util.Scanner;

public class exercise17{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        String gender = input.nextLine();
        System.out.print("How many ounces of alcohol did you have? ");
        double alcohol = input.nextDouble();
        System.out.print("What is your weight, in pounds? ");
        double weight = input.nextDouble();
        System.out.print("How many hours has it been since your last drink? ");
        double hours = input.nextDouble();

        if(gender.equals("1")){
            double bac = (alcohol*5.14/weight*0.73)-(0.015*hours);
            System.out.println("\nYour BAC is "+String.format("%.6f",bac));

            if(bac>=0.08){
                System.out.println("It is not legal for you to drive.");
            }
            else if(bac<0.08){
                System.out.println("It is legal for you to drive.");
            }
        }
        else if(gender.equals("2")){
            double bac = (alcohol*5.14/weight*0.66)-0.015*hours;
            System.out.println("\nYour BAC is "+String.format("%.6f",bac));

            if(bac>=0.08){
                System.out.println("It is not legal for you to drive.");
            }
            else if(bac<0.08){
                System.out.println("It is legal for you to drive.");
            }
        }
    }
}