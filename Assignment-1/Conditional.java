package com.company.assignment1;

import java.util.*;

public class Conditional{

    public static void main(String[] args) {
	// write your code here
        Scanner scn= new Scanner(System.in);
        System.out.println("Credits: ");
        int credits = scn.nextInt();
        if (credits>=7500){
            System.out.println("Tera Leader");
        }
        else if (6000<=credits & credits<7000){
            System.out.println("Gega Leader");
        }
        else if (4500<= credits  & credits<6000)
        {
            System.out.println("Mega Leader");
        }
        else{
            System.out.println("Rising Star");
        }
    }
}
