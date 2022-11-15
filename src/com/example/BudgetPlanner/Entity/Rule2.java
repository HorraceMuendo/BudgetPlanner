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
            for (int i = 0; i < expense.size(); i++) {
                sum =sum + expense.get(i);
//                System.out.println(expense.get(i));
                System.out.println(sum);
            }
        } while (sum <= bills);
        return sum;
    }

}
