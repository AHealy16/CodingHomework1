package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList <Integer> Sales = new ArrayList<Integer>(5);
        Boolean w = true;
        Scanner input = new Scanner(System.in);

        while (w = true){

            System.out.println("Would you like to add a yearly income?");
            String decision = input.next();
            if (decision.equalsIgnoreCase("No")){
                w = false;
                System.out.println(Sales);
                break;
            }
            System.out.println("Please enter a year where 0 is the first year");
            int year = input.nextInt();
            System.out.println("Please enter the revenue for that year");
            int income = input.nextInt();
            int array_Place = year - 1;
            Sales.set(array_Place, income);
        }

    }
}
