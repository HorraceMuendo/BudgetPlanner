package com.example.BudgetPlanner.Entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Rule1 {
//    private  double Income= 1;
//    private  double Expense= Income*0.5;
//    private  double Wants= Income*0.3;
//    private  double Savings_DEbt= Income*0.2;
//    private double sum = 0;




    public void income(){
        System.out.println("enter your income: "+ income);
    }

        Scanner scanner = new Scanner(System.in);

        public double income = scanner.nextDouble();



    public double expense() {

        System.out.print("Enter your expenses \n Health: ");
        Scanner scanner = new Scanner(System.in);
        double value1 = scanner.nextDouble();

        System.out.print("Education: ");
        //Scanner scanner = new Scanner(System.in);
        double value2 = scanner.nextDouble();

        System.out.print("Rent: ");
        //Scanner scanner = new Scanner(System.in);
        double value3 = scanner.nextDouble();

        System.out.print("Food: ");
       // Scanner scanner = new Scanner(System.in);
        double value4 = scanner.nextDouble();

        System.out.print("Transport: ");
        //Scanner scanner = new Scanner(System.in);
        double value5 = scanner.nextDouble();

        System.out.print("Other expenses: ");
        //Scanner scanner = new Scanner(System.in);
        double value6 = scanner.nextDouble();

         double sum = value1+value2+value3+value4+value5+value6;


        double percentage=income*0.3;

         double Expense=percentage-sum;
        System.out.println("Your expense"+Expense);

//        ArrayList<Double> expense = new ArrayList<Double>();
//        expense.add(value);
//        for (int i=0;i<expense.size();i++){
//            sum+=i;
//        }

        return Expense;
    }
    public double wants() {
        System.out.print("Enter your wants: \n want_1");
        Scanner scanner = new Scanner(System.in);
        double value1 = scanner.nextDouble();

        System.out.print("want_2: ");
        //Scanner scanner = new Scanner(System.in);
        double value2 = scanner.nextDouble();

        System.out.print("want_3: ");
        //Scanner scanner = new Scanner(System.in);
        double value3 = scanner.nextDouble();

        System.out.print("want_4: ");
       // Scanner scanner = new Scanner(System.in);
        double value4 = scanner.nextDouble();

        System.out.print("Other wants: ");
        //Scanner scanner = new Scanner(System.in);
        double value5 = scanner.nextDouble();

        double sum = value1+value2+value3+value4+value5;

        double percentage=income*0.2;

        double Want=percentage-sum;
        System.out.println("Your total wants: "+ Want);


//        ArrayList<Double> human_wants = new ArrayList<Double>();
//        human_wants.add(value1);

           return Want;
    }

    public double savings_Debt() {

        System.out.print("Enter your savings: ");
       // Scanner scanner = new Scanner(System.in);
        double value1 = scanner.nextDouble();

        System.out.print("Enter your donation: ");
        //Scanner scanner = new Scanner(System.in);
        double value2 = scanner.nextDouble();

        System.out.print("Enter your debt: ");
        //Scanner scanner = new Scanner(System.in);
        double value3 = scanner.nextDouble();

        System.out.print("Other: ");
        // Scanner scanner = new Scanner(System.in);
        double value4 = scanner.nextDouble();

        double sum = value2+value3+value4;

        double percentage=income*0.2;

        double Savings=percentage-sum;
        System.out.println("Your net savings: "+Savings);

        return  Savings;



//        ArrayList<Double> savings_debt = new ArrayList<Double>();
//        savings_debt.add(value2);
//        return savings_debt;
    }


}
