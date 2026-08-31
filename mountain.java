
import java.util.*;
  
public class mountain{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,};
        int n = arr.length;
        int i = 0, j = i+1;   
      while(i <n){
        if(arr[i]<arr[j]){
            i++;
            j++;
        }
        else{
            System.err.println(arr[i]);
            break;
        }
      }
        
    }
}
