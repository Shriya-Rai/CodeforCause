package com.company.assignment1;

import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Amount: ");
        int amount= scn.nextInt();
        System.out.println("Rate: ");
        int rate=scn.nextInt();
        System.out.println("Time: ");
        int time=scn.nextInt();
        int si=rate*time*amount/100;
        System.out.println("Simple Interest: "+si);
    }
}
