public class binarySearch {
    

    public static int binSrc(int Key , int numbers[]){

        int start=0;
        int end = numbers.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(numbers[mid]==Key){
                return mid;
            }
            if(numbers[mid] < Key ){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return -1;

    }




    public static void main(String[] var0) {
       int numbers[] ={1, 3, 5, 9, 12, 14};
       int key=9;
   
       System.out.println(binSrc(key, numbers));
   }

}   
    