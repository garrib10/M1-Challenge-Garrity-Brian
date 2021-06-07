package com.company;

public class ConverterIf {
    public String convertMonth(int monthNumber) {
        int i = monthNumber;
        if (i == 1) {
            return "January";
        } else if (i == 2) {
            return "February";
        } else if (i == 3) {
            return "March";
        } else if (i == 4) {
            return "April";
        } else if (i == 5) {
            return "May";
        } else if (i == 6) {
            return "June";
        } else if (i == 7) {
            return "July";
        } else if (i == 8) {
            return "August";
        } else if (i == 9) {
            return "September";
        } else if (i == 10) {
            return "October";
        } else if (i == 11) {
            return "November";
        } else if (i == 12) {
            return "December";
        } else {
            return "invalid input";
        }
    }

        public String convertDay(int dayNumber){
            int i = dayNumber;
            if (i == 1) {
                return "Sunday";
            } else if (i == 2) {
                return "Monday";
            } else if (i == 3) {
                return "Tuesday";
            } else if (i == 4) {
                return "Wednesday";
            } else if (i == 5) {
                return "Thursday";
            } else if (i == 6) {
                return "Friday";
            } else if (i == 7) {
                return "Saturday";
            }
             else {
                return "invalid input";
            }


        }


    }
