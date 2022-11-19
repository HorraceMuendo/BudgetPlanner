package com.example.BudgetPlanner.Entity;

import java.util.Scanner;

public class Rule1 {

    public void income() {
        System.out.println("enter your income: " + income);
    }
    Scanner scanner = new Scanner(System.in);
    public double income = scanner.nextDouble();
    public double expense() {

        System.out.print("Enter your expenses \n Health: ");
        Scanner scanner = new Scanner(System.in);
        double value1 = scanner.nextDouble();

        System.out.print("Education: ");

        double value2 = scanner.nextDouble();

        System.out.print("Rent: ");

        double value3 = scanner.nextDouble();

        System.out.print("Food: ");

        double value4 = scanner.nextDouble();

        System.out.print("Transport: ");

        double value5 = scanner.nextDouble();

        System.out.print("Other expenses: ");

        double value6 = scanner.nextDouble();
        double sum = value1 + value2 + value3 + value4 + value5 + value6;
        double percentage = income * 0.5;
        double Expense = percentage - sum;
        System.out.println("Your expense" + Expense);
        return Expense;
    }

    public double wants() {
        System.out.print("Enter your wants: \n want_1: ");
        Scanner scanner = new Scanner(System.in);
        double value1 = scanner.nextDouble();

        System.out.print("want_2: ");

        double value2 = scanner.nextDouble();

        System.out.print("want_3: ");

        double value3 = scanner.nextDouble();

        System.out.print("want_4: ");

        double value4 = scanner.nextDouble();

        System.out.print("Other wants: ");

        double value5 = scanner.nextDouble();

        double sum = value1 + value2 + value3 + value4 + value5;

        double percentage = income * 0.3;

        double Want = percentage - sum;
        System.out.println("Your total wants: " + Want);
        return Want;
    }

    public double savings_Debt() {

        System.out.print("Enter your savings: ");

        double value1 = scanner.nextDouble();

        System.out.print("Enter your donation: ");

        double value2 = scanner.nextDouble();

        System.out.print("Enter your debt: ");

        double value3 = scanner.nextDouble();

        System.out.print("Other: ");

        double value4 = scanner.nextDouble();

        double sum = value2 + value3 + value4;

        double percentage = income * 0.2;

        double Savings = percentage - sum;

        System.out.println("Your net savings: " + Savings);

        return Savings;

    }


}
