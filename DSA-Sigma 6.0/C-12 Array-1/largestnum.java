public class largestnum {


    public static void largestnumber(int numb[]){

        int bignum=numb[0];

        for(int i=0;i<numb.length;i++){
            if(numb[i] > bignum){
                bignum = numb[i];
            }
        }

        System.out.println(bignum);

        
    }

    public static void main(String[] args) {
        
        int numbers[]={1,3,5,9,2,4};

        largestnumber(numbers);


    }




}