public class max_SubArrsum {
public static void main(String[] args) {
    int arr[] = {2,4,6,8,10};

    int cur_Sum=0;
    int max_Sum = Integer.MIN_VALUE;

    for(int i=0 ; i<arr.length ; i++){
        for(int j=i ; j<arr.length ; j++){
            cur_Sum = 0;
            for(int k=i ; k<=j ; k++){
                cur_Sum+=arr[k];
            }

            if(max_Sum < cur_Sum){
                max_Sum = cur_Sum;
            }
        }
    }

    System.out.println("Max sum is :"+ max_Sum);
}

}