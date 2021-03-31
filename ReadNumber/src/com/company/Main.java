package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = scanner.nextInt();
        int unit = number%10;
        int natural = number/10;
        int dozen = natural%10;
        int hundred = number/100;
        String text = "";
        if(number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    text += "Zero";
                    break;
                case 1:
                    text += "One";
                    break;
                case 2:
                    text += "Two";
                    break;
                case 3:
                    text += "Three";
                    break;
                case 4:
                    text += "Four";
                    break;
                case 5:
                    text += "Five";
                    break;
                case 6:
                    text += "Six";
                    break;
                case 7:
                    text += "Seven";
                    break;
                case 8:
                    text += "Eight";
                    break;
                case 9:
                    text += "Nine";
                    break;
            }
        } else if(number < 20) {
            switch (unit) {
                case 0:
                    text += "Ten";
                    break;
                case 1:
                    text += "Eleven";
                    break;
                case 2:
                    text += "Twelve";
                    break;
                case 3:
                    text += "Thirteen";
                    break;
                case 4:
                    text += "Fourteen";
                    break;
                case 5:
                    text += "Fifteen";
                    break;
                case 6:
                    text += "Sixteen";
                    break;
                case 7:
                    text += "Seventeen";
                    break;
                case 8:
                    text += "Eighteen";
                    break;
                case 9:
                    text += "Nineteen";
                    break;
            }
        } else if(number < 1000) {
            switch (hundred) {
                case 1:
                    text += "One Hundred";
                    break;
                case 2:
                    text += "Two Hundred";
                    break;
                case 3:
                    text += "Three Hundred";
                    break;
                case 4:
                    text += "Four Hundred";
                    break;
                case 5:
                    text += "Five Hundred";
                    break;
                case 6:
                    text += "Six Hundred";
                    break;
                case 7:
                    text += "Seven Hundred";
                    break;
                case 8:
                    text += "Eight Hundred";
                    break;
                case 9:
                    text += "Nine Hundred";
                    break;
                default:
                    text = "";
            } if(dozen == 1) {
                switch (unit) {
                    case 0:
                        text += " Ten";
                        break;
                    case 1:
                        text += " Eleven";
                        break;
                    case 2:
                        text += " Twelve";
                        break;
                    case 3:
                        text += " Thirteen";
                        break;
                    case 4:
                        text += " Fourteen";
                        break;
                    case 5:
                        text += " Fifteen";
                        break;
                    case 6:
                        text += " Sixteen";
                        break;
                    case 7:
                        text += " Seventeen";
                        break;
                    case 8:
                        text += " Eighteen";
                        break;
                    case 9:
                        text += " Nineteen";
                        break;
                }
            } else {
                switch (dozen) {
                    case 9:
                        text += " Ninety";
                        break;
                    case 8:
                        text += " Eighty";
                        break;
                    case 7:
                        text += " Seventy";
                        break;
                    case 6:
                        text += " Sixty";
                        break;
                    case 5:
                        text += " Fifty";
                        break;
                    case 4:
                        text += " Forty";
                        break;
                    case 3:
                        text += " Thirty";
                        break;
                    case 2:
                        text += " Twenty";
                        break;
                }
                switch (unit) {
                    case 9:
                        text += " Nine";
                        break;
                    case 8:
                        text += " Eight";
                        break;
                    case 7:
                        text += " Seven";
                        break;
                    case 6:
                        text += " Six";
                        break;
                    case 5:
                        text += " Five";
                        break;
                    case 4:
                        text += " Four";
                        break;
                    case 3:
                        text += " Three";
                        break;
                    case 2:
                        text += " Two";
                        break;
                    case 1:
                        text += " One";
                        break;
                }
            }
        }
        System.out.println(text);
    }
}
