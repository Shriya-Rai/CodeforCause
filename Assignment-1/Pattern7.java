//Print the following pattern:
// *					*
// *   *			    *	*
// *   *   *		        *   *	*
// *   *   *	*           *	*   *	*
// *   *   *	*   *	*   *	*   *	*
// *   *   *	*	    *	*   *	*
// *   *   *			*   *	*
// *   *			    *	*
// *					*

package com.company.assignment1;

public class Pattern7 {
    public static void main(String[] args) {
        int i = 1, k = 1;
        int rows = 2 * 5 - 1;
        int cols = 2 * 5;
        while (i <= rows) {
            int j = 1, col = 1;
            while (j <= cols) {
                if (col <= k) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
                if (j < 5) {
                    col++;
                }
                if (j > 5) {
                    col--;
                }
                j++;
            }
            System.out.println();
            if (i < 5) {
                k++;
            } else {
                k--;
            }
            i++;
        }
    }
}