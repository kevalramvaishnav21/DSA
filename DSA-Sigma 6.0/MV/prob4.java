import java.util.*;
public class prob4 {
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the list
        System.out.print("Enter number of mountains: ");
        int n = sc.nextInt();

        int[] heights = new int[n];

        // Input heights
        System.out.println("Enter the heights of mountains:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        // Find maximum height
        int maxHeight = heights[0];
        for (int i = 1; i < n; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
            }
        }

        System.out.println("Tallest Mountain Height: " + maxHeight);

        sc.close();
    }
}

