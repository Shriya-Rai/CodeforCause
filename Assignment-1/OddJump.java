package com.company.assignment1;

import java.util.Scanner;

public class OddJump {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int i=1,j=2;
        int n=scn.nextInt();
        while(i<=n){
           int k=1;
            System.out.println(j);
            while(k<=2*i-1) {
                k++;
                j += 2;
            }
            j+=2;
            i++;
        }
    }
}
