package com.example.BudgetPlanner.Entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Rule1 {
    private static final int Income= 100;
    private static final int Expense= 50;
    private static final int Wants= 30;
    private static final int Savings_DEbt= 20;

    public double income() {
        System.out.print("Enter your income: ");
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();
        return income;
    }

    public ArrayList<Double> expense() {
        System.out.print("Enter your expenses: ");
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        ArrayList<Double> expense = new ArrayList<Double>();
        expense.add(value);
        return expense;
    }
    public ArrayList<Double> wants() {
        System.out.print("Enter your expenses: ");
        Scanner scanner = new Scanner(System.in);
        double value1 = scanner.nextDouble();
        ArrayList<Double> human_wants = new ArrayList<Double>();
        human_wants.add(value1);
        return human_wants;
    }

    public ArrayList<Double> savings_Debt() {
        System.out.print("Enter your savings/debt: ");
        Scanner scanner = new Scanner(System.in);
        double value2 = scanner.nextDouble();
        ArrayList<Double> savings_debt = new ArrayList<Double>();
        savings_debt.add(value2);
        return savings_debt;
    }

}
