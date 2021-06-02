//Print the following pattern:
//                  1
//	        1   2	1
//          1	2   3	2   1
//	1   2	3   4   3   2	1
//  1 	2   3	4   5	4   3	2   1

package com.company.assignment1;

public class Pattern3 {
    public static void main(String[] args) {
        int i=1;
        while(i<=5){
            int spaces=1, j=1;
            while(spaces<=5-i){
                System.out.print("\t");
                spaces++;
            }
            int col=1;
            while(j<=2*i-1){
                System.out.print(col+"\t");
                j++;
                if (j<=i){
                    col++;
                }
                else{
                    col--;
                }
            }
            System.out.println();
            i++;
        }
    }
}
