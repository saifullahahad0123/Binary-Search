public class maxpoorng{
    public static void main(String[] args) {

        int[] arr = {-1,-3,-9, 9, 19};
        int n = arr.length-1;
         int po = 0;
         int ng = 0;
   for(int i = 0;i<=n; i++){
    if(arr[i] < 0){
        ng = ng +1;

    }
    else if(arr[i]>0){
        po = po +1;
    }

   }
    if (ng<po){
        System.err.println("max is positive "+ po);
    }
    else if (ng>po){
        System.out.println("max is nagative " + ng);
    }
    else{
        System.err.println("BOTH ARE SAME " + po+" "+ ng

        );
    }
        

     
    }
}