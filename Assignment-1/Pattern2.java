//Print the following pattern:
// 1
// 1	2
// 1	2	3
// 1	2	3	4
// 1	2	3	4	5

package com.company.assignment1;

public class Pattern2 {
    public static void main(String[] args) {
        int i=1;
        while(i<=5){
            int j=1;
            while(j<=i){
                System.out.print(j+"\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
