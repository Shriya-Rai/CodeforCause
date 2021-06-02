package com.company.assignment1;

import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int divisor = num2;
        int dividend = num1;
        while(divisor!=0) {
            int temp = dividend % divisor;
            dividend = divisor;
            divisor = temp;
        }
        System.out.println("GCD of "+num1+" and "+num2+" is "+dividend);
    }
}
