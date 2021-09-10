/*
 *  UCF COP3330 Fall 2021 Exercise 6 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise06;
import java.util.Calendar;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        System.out.println("What is your current age?");
        Scanner sc = new Scanner(System.in);
        int ageCurrent = sc.nextInt();

        System.out.println("At what age would you like to retire?");
        Scanner sc1 = new Scanner(System.in);
        int ageRetire = sc1.nextInt();

        int diff = ageRetire - ageCurrent;
        Calendar year = Calendar.getInstance();
        int retire = year.get(Calendar.YEAR)+diff;

        System.out.println("You have "+diff+" Years left until you can retire.\nIt's "+year.get(Calendar.YEAR)+", so you can retire in "+retire+".");
    }
}
