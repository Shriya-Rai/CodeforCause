//Print the following pattern:
// 		    1
//	        2   3	2
//	   3	4   5	4   3
//     4   5	6   7	6   5	4
// 5   6   7	8   9	8   7	6   5

package com.company.assignment1;

public class Pattern4 {
    public static void main(String[] args) {
        int i=1;
        while(i<=5){
            int sp = 1;
            while(sp<=5-i){
                System.out.print("\t");
                sp++;
            }
            int j=1,col=i;
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
