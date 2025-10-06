

import java.util.*;

class prob1{
    public static void main(String args[]) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j!=i ) {
                    System.out.print("*");
                    
                } // print star without newline
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(); // move to next line after each row
        }


        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j!=i ) {
                    System.out.print("*");
                    
                } // print star without newline
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(); // move to next line after each row
        }
    }
}
