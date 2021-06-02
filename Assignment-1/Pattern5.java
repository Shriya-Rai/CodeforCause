//Print the following pattern:
// 1
// 1	1
// 1	2	1
// 1	3	3	1
// 1	4	6	4	1
// 1	5	10	10	5	1

package com.company.assignment1;

public class Pattern5 {
    public static void main(String[] args) {
        int i=0;
        while(i<=5){
            int j=0;
            int val = 1;
            while(j<=i){
                System.out.print(val+"\t");
                int next = val * (i-j) / (j+1);
                val = next;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
