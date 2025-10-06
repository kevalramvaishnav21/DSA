public class prob2 {

    public static void pattern(int n){
        for (int i = 1; i<=n ;i++) {
            for (int j =0; j< n; j++) {
                int val = (((i - 1 + j) % n) + 1);
                System.out.print(val + " ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n =4;
        pattern(n);
        
        
    }
}
