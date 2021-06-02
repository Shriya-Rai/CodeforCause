//Print the following pattern:
//                  *
//	        *   *	*
//          *	*   *	*   *
//	*   *	*   *	*   *	*
//   *	*   *	*   *	*   *	*   *
//	*   *   *   *   *   *	*
//	    *	*   *	*   *
//	        *   *	*
//		    *

package com.company.assignment1;

public class Pattern6 {
    public static void main(String[] args) {
        int i = 1, k = 1;
        int rows = 2*5-1;
        while(i<=rows){
            int sp = 1;
            while(sp<=5-k){
                System.out.print("\t");
                sp++;
            }
            int j = 1;
            while(j<=2*k-1){
                System.out.print("*\t");
                j++;
            }
            if(i<5){
                k++;
            }
            else{
                k--;
            }
            System.out.println();
            i++;
        }
    }
}
