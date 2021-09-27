package com.company;


import java.util.Scanner;

public class Main {

    private static double principal= 0;

    private static double interest= 0;

    private static double years= 0;
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
         principal = ask("Principal (1K - 1M): ");

            while (principal < 1000 || principal > 1000000) {
                System.out.println("Invalid data range, try agin: ");
                System.out.print("Principal (1K - 1M): ");
                String nextString = scanner.next();
                if (isDouble(nextString)) {
                    principal = Double.parseDouble(nextString);
                }
            }


         interest = ask("Interest rate (percentage): ");

            while (interest < 0.00 || interest > 100.00) {
                System.out.println("Invalid data range, try agin: ");
                System.out.print("Interest rate (percentage): ");
                String nextString = scanner.next();
                if (isDouble(nextString)) {
                    interest = Double.parseDouble(nextString);
                }
            }



         years = ask("Years invested: ");

            while (years < 0 || years > 150) {
                System.out.println("Invalid data range, try agin: ");
                System.out.print("Years invested: ");
                String nextString = scanner.next();
                if (isDouble(nextString)) {
                    years = Double.parseDouble(nextString);
                }
            }

        double result = principal * interest * years;
        System.out.println("Result " + result);

        }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
    public static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }

    public static double ask(String question){
        System.out.print(question);
        String nextString = scanner.next();
        while(!isDouble(nextString)){
            System.out.println("Invalid data type, try again: ");
            System.out.print(question);
            nextString = scanner.next();
        }
        return Double.parseDouble(nextString);
    }
    }
