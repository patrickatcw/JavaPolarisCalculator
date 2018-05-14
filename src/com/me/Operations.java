package com.me;

import java.util.Scanner;

public class Operations {

    public static void Add(){

        int a, b, c;
        System.out.println("Enter two integers to calculate their sum; ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = a + b;
        System.out.println("The sum of " + a + " + " + b + " = " + c);

    }

    public static void Subtract(){

        int x, y, z;
        System.out.println("Enter the two integers you would like to have in your subtraction problem; ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x - y;
        System.out.println(x + " - " + y + " = " + z);

    }

    public static void Multiply(){

        int x, y, z;
        System.out.println("Enter two integers to multiply them ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x * y;
        System.out.println(x + " x " + y + " = " + z);

    }

    public static void Divide(){

        int x, y, z;
        System.out.println("Now for a division problem, enter the numerator; ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        System.out.println("Now enter the denominator; ");
        y = in.nextInt();
        z = x / y;
        //System.out.println("Multiplied integers = " + z);
        System.out.println(x + " divided by " + y + " = " + z);

    }

}
