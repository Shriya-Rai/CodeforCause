//Print the following pattern:
// *
// *   *
// *   *   *
// *   *   *   *
// *   *   *   *    *

package com.company.assignment1;

public class Pattern1 {
    public static void main(String[] args) {
        int i=1;
        while(i<=5){
            int j=1;
            while(j<=i){
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
