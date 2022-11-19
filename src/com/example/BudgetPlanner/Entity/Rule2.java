package com.example.BudgetPlanner.Entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Rule2 {

    // 70/20/10 rule

    double sum = 0.0;
    Scanner scanner = new Scanner(System.in);

    public double income = scanner.nextDouble();

    
    public double bills_MonthlySpending() {
        ArrayList<Double> expense = new ArrayList<Double>();
        double bills = income * 0.7; //700 --> 490

        do {
            double value = scanner.nextDouble();
            expense.add(value);
            sum = 0.0;
            for (int i = 0; i <= expense.size() - 1; i++) {
                sum += expense.get(i);
            }

        } while (sum <= bills);

        if (sum > bills) {
            double exceededby = sum - bills;
            System.out.println("Your bills exceed by: " + exceededby);
        } else {
            System.out.println("your monthly spending's: " + sum);
            scanner.close();
        }
        return sum;
    }

    public double Savings_Investments() {
        ArrayList<Double> expense = new ArrayList<Double>();
        double bills = income * 0.2;

        do {
            double value = scanner.nextDouble();
            expense.add(value);
            sum = 0.0;
            for (int i = 0; i <= expense.size() - 1; i++) {
                sum += expense.get(i);
            }
        } while (sum <= bills);

        if (sum > bills) {
            double exceededby = sum - bills;
            System.out.println("Your bills exceed by: " + exceededby);
        } else {
            System.out.println("your monthly spending's: " + sum);
            scanner.close();
        }

        return sum;
    }

    public double Debt_Donation() {
        ArrayList<Double> expense = new ArrayList<Double>();
        double bills = income * 0.1;

        do {
            double value = scanner.nextDouble();
            expense.add(value);
            sum = 0.0;
            for (int i = 0; i <= expense.size() - 1; i++) {
                sum += expense.get(i);
            }
        } while (sum <= bills);

        if (sum > bills) {
            double exceededby = sum - bills;
            System.out.println("Your bills exceed by: " + exceededby);
        } else {
            System.out.println("your monthly spending's: " + sum);
            scanner.close();
        }

        return sum;
    }

}
