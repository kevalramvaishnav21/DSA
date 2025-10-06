import java.util.*;

public class prob3 {
    public static void main(String[] args) {
        int n= 9;
        int size = (int) Math.sqrt(n); 
        int num = 1;

        for (int i = 0; i < size; i++) {
            int[] row = new int[size];

            // Fill row with numbers
            for (int j = 0; j < size; j++) {
                if (num <= n) {
                    row[j] = num++;
                }
            }

            // Print row → normal or reverse depending on row number
            if (i % 2 == 0) {  // left to right
                for (int j = 0; j < size; j++) {
                    if (row[j] != 0)
                        System.out.print(row[j] + " ");
                }
            } else {           // right to left
                for (int j = size - 1; j >= 0; j--) {
                    if (row[j] != 0)
                        System.out.print(row[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
