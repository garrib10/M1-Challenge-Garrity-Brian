package com.company;



import java.util.Scanner;

public class ConverterApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String userInput;

        do {
            System.out.println("Please choose your converter type: if or switch.");
            userInput = scanner.nextLine();
        }

        while(!userInput.equals("if") && !userInput.equals("switch"));

         ConverterIf ifConverter = new ConverterIf();
         ConverterSwitch switchConverter = new ConverterSwitch();
         int userMonthInput;

         do {
             System.out.println("Please choose a number for a month to be converted.");
             userMonthInput = Integer.parseInt(scanner.nextLine());
             System.out.println(userMonthInput);
         }
         while (!(userMonthInput >= 1 && userMonthInput <+ 12));
         int userDayInput;

         do {
             System.out.println("Please choose a number for a day to be converted.");
             userDayInput = Integer.parseInt(scanner.nextLine());
             System.out.println(userDayInput);
         }
         while (!(userDayInput >= 1 &&  userDayInput <= 7));

         if (userInput.equals("if")){
             System.out.println(" The month chosen was: " + ifConverter.convertMonth(userMonthInput));
             System.out.println("The day chosen was: " + ifConverter.convertDay(userDayInput));
         }else {
             System.out.println("the month chosen was: " + switchConverter.convertMonth(userMonthInput));
             System.out.println("the day chosen was: " + switchConverter.convertDay(userDayInput));
         }

    }

}
