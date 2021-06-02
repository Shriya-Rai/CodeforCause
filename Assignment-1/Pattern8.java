// Print the following pattern:
//  *	*	*	*	*	*	*	*	*
//  *	*	*	*		*	*	*	*
//  *	*	*				*	*	*
//  *	*						*	*
//  * 								*
//  *	*						*	*
//  *	*	*				*	*	*
//  *	*	*	*		*	*	*	*
//  *	*	*	*	*	*	*	*	*

package com.company.assignment1;

public class Pattern8 {
    public static void main(String[] args) {
        int i = 1, k = 1;
        int rows = 2*5-1;
        while(i<=rows){
            int j=1,col=1;
            while(j<=rows){
                if (col<=5-k+1) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
                if (j<5){
                        col++;
                }
                else{
                        col--;
                }
                j++;
                }
                System.out.println();
                if (i<5){
                    k++;
                }
                else{
                    k--;
                }
                i++;
            }
        }
    }

