package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] Sales = {};
        Boolean w = true;
        Scanner input = new Scanner(System.in);

        while (w = true){

            System.out.println("Would you like to add a yearly income?");
            if (input.next() == "No"){
                w = false;
                System.out.println(Sales);
            }
            System.out.println("Please enter a year where 0 is the first year");
            int year = input.nextInt();
            System.out.println("Please enter the revenue for that year");
            int income = input.nextInt();
            Sales = income;
        }

    }
}
