public class reverseArray {
    

    public static void reversed(int array[]){
        int first=0;
        int last = array.length-1;

        while (first<last) {
            int temp = array[last];
            array[last]=array[first];
            array[first] = temp;

            first++;
            last--;
        }


    
    }
    public static void main(String[] args) {
     
        int number[] = {1,2,3,4,5,6,7,8,9};
        reversed(number);

        for(int i=0;i<number.length;i++){
            System.out.print(number[i]);
        }
        System.err.println(); 
    }




}
