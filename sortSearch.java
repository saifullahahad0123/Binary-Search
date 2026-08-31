import java.util.*;
  
public class sortSearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;   
        int  i = 0 , j= n-1;
        
        int target = 7;
        boolean x = false;
        while(i<=j){
            int mid = (i+j)/2;
            if(target<arr[mid]){
                j = mid-1;

            }
            else if(target>arr[mid]){
                i = mid + 1;
            }
            else{
                x = true;
                // System.out.println(x);
                break;
            }
        }
        System.out.println(x);

        
    }
}
