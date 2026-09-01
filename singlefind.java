public class singlefind{

    public static void main(String[] args) {

        int[] arr = {1,1, 2,2,3,3,4,4 ,5,6,6};

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
        
                if(arr[mid] < arr[mid + 1] && arr[mid]> arr[mid-1]){
                    System.err.println(arr[mid]);
                }
               int f = mid, s = mid;
               if (arr[mid - 1] == arr[mid]){
                f = mid - 1;
               }
               else {
                s = mid +1;
               }
               int leftCount = f - left;
               int rightCount = right - s;
               if ( leftCount%2 == 0) {
                left = s +1;

               }
               else{
                right =f-1;
               }
            
        }
        System.err.println(left);
        }
    }