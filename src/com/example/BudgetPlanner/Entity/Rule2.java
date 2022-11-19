package com.example.BudgetPlanner.Entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Rule2 {

    // 70/20/10 rule

    double sum = 0.0;
    Scanner scanner = new Scanner(System.in);

    public double income = scanner.nextDouble();


    public double bills_MonthlySpending() {
        ArrayList<Double> Monthly_expense = new ArrayList<Double>();
        double bills = income * 0.7; //700 --> 490

        do {
            double value = scanner.nextDouble();
            Monthly_expense.add(value);
            sum = 0.0;
            for (int i = 0; i <= Monthly_expense.size() - 1; i++) {
                sum += Monthly_expense.get(i);
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
        ArrayList<Double> Savings_expense = new ArrayList<Double>();
        double bills = income * 0.2;

        do {
            double value = scanner.nextDouble();
            Savings_expense.add(value);
            sum = 0.0;
            for (int i = 0; i <= Savings_expense.size() - 1; i++) {
                sum += Savings_expense.get(i);
            }

        } while (sum <= bills);

        System.out.println("Your monthly Savings: " + sum );

        return sum;
    }

    public double Debt_Donation() {
        ArrayList<Double> Debt_expense = new ArrayList<Double>();
        double bills = income * 0.1;

        do {
            double value = scanner.nextDouble();
            Debt_expense.add(value);
            sum = 0.0;
            for (int i = 0; i <= Debt_expense.size() - 1; i++) {
                sum += Debt_expense.get(i);
            }
        } while (sum <= bills);

        if (sum > bills) {
            double exceededby = sum - bills;
            System.out.println("Your Debt exceed by: " + exceededby);
        } else {
            System.out.println("your monthly spending's: " + sum);
            scanner.close();
        }

        return sum;
    }

}
