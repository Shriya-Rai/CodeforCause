//Print the following pattern:
// 5   5	5	5	5	5	5	5	5
// 5   4	4	4	4	4	4	4	5
// 5   4	3	3	3	3	3	4	5
// 5   4	3	2	2	2	3	4	5
// 5   4	3	2	1	2	3	4	5
// 5   4	3	2	2	2	3	4	5
// 5   4	3	3	3	3	3	4	5
// 5   4	4	4	4	4	4	4	5
// 5   5	5	5	5	5	5	5	5

package com.company.assignment1;

public class Pattern9 {
    public static void main(String[] args) {
        int i = 1, k=5;
        int rows = 2*5-1;
        while(i<=rows){
            int j=1, col=5;
            while(j<=rows){
                System.out.print(Math.max(col,k)+"\t");
                if(j<5){
                    col--;
                }
                else{
                    col++;
                }
                j++;
            }
            if (i<5){
                k--;
            }
            else{
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
