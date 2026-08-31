import java.util.*;
  
public class istoccurence{
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3,4,5,6,7};
        int n = arr.length;   
        int  i = 0 , j= n-1;
        
        int target = 100;
        int idx = -1;
        while(i<=j){
            int mid = (i+j)/2;
            if(target<arr[mid]){
                j = mid-1;

            }
            else if(target>arr[mid]){
                i = mid + 1;
            }
            else{
            idx = mid;
            j = mid - 1;
            }
        }
        System.out.println(idx);

        
    }
}
