package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        String month = "nothing";


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number for month: ");

        // This method reads the number provided using keyboard
        int cal = scan.nextInt();


        switch(cal) {
            case 1:month="January";
                break;
            case 2: month="February";
                break;
            case 3: month = "March";
                break;
            case 4: month = "April";
                break;
            case 5: month = "May";
                break;
            case 6: month = "June";
                break;
            case 7: month = "July";
                break;
            case 8: month = "August";
                break;
            case 9: month = "September";
                break;
            case 10: month = "October";
                break;
            case 11: month = "November";
                break;
            case 12: month="December";
                break;
            default:
                System.out.println("Invalid input, check the number is between 1 and 12 inclusive");
                return;



        }
        System.out.println("The month is: "+month);
    }
}
