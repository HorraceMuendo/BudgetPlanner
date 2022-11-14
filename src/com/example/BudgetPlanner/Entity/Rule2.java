package com.example.BudgetPlanner.Entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Rule2 {

    // 70/20/10 rule

    double sum = 0;
    int end = 0;
    Scanner scanner = new Scanner(System.in);

    public double income = scanner.nextDouble();

    public ArrayList<Double> bills_MonthlySpending() {
        ArrayList<Double> expense = new ArrayList<Double>();
        double value = scanner.nextDouble();
        double bills = income * 0.2; //700


        do {
            if (sum <= bills) {
                expense.add(value);
            }

            for (int i = 0; i < expense.size(); i++) {
                sum += expense.get(i);
            }
            sum++;
        } while (sum <= bills);


        return expense;
    }

}
