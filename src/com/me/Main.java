package com.me;

import java.util.Scanner;

//make simple calculator that shows both user input and
//result
//one class, operations? maybe
//allow for negative numbers, add, subtract, multiply, divide
//how to store numbers, with pressing an operator being the end of input numbers
//      1 + 2 + 45 + = , beginning of operation
//store by string input;
//how do numbers get saved to have operations performed
//coupling operators
//would a list be created? by the whole equation, then sending that list to
//operator class to iterate through methods
//for each number in listnumber
/*
var input;
var x;
var operator;

input = 123;
operator = +;
x = input;
input = 456;
x = x + input;
operator = -;
input 123;
operator ;= =;
x = x - input
 */
public class Main {

    public static void main(String[] args) {

        double term1 = 0;
        double term2 = 0;
        double results = 0;
        System.out.println();
        PromptUser(term1, term2);

        results = Operations.AddC(term1, term2);
        System.out.println(results);

        System.out.println();

        Operations.Add();

        System.out.println("----------------------------------");

        Operations.Subtract();

        System.out.println("----------------------------------");

        Operations.Multiply();

        System.out.println("----------------------------------");

        Operations.Divide();

        System.out.println();

        System.out.println("GOOD JOB RAMROD!!!");

    }

        public static void PromptUser(Object term1, double term2){

            System.out.println("Enter two integers to calculate their sum; ");
            Scanner in = new Scanner(System.in);
            term1 = in.nextDouble();
            term2 = in.nextDouble();

        }

    }


