package com.example.BudgetPlanner;

import com.example.BudgetPlanner.Entity.Rule1;
import com.example.BudgetPlanner.Entity.Rule2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Choose a Budget rule: \n 1: 50/30/20  \n 2: 70/20/10");
        Scanner scanner = new Scanner(System.in);
        double ruleValue = scanner.nextInt();

        if (ruleValue == 1) {
            Rule1 rule1 = new Rule1();
            rule1.income();
            rule1.expense();
            rule1.wants();
            rule1.savings_Debt();
        } else if (ruleValue == 2) {
            Rule2 rule2 = new Rule2();
            rule2.bills_MonthlySpending();
            rule2.Savings_Investments();
            rule2.Debt_Donation();
        } else {
            System.out.println("Choose between the two rules");
        }


    }
}
