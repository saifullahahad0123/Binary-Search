public class searchRotate{

    public static void main(String[] args) {

        int[] arr = {4,5,6,7,8,9,10,1,2,3};

        int left = 0;
        int right = arr.length - 1;
        int tar = 9;

        while (left <= right) {

            int mid = left + (right - left) / 2;

         if(arr[tar] == mid){
            System.err.println(mid);

         }
         else if(arr[left] < arr[mid]){
            if(arr[left] <= tar && tar < arr[mid]){
             right = mid -1; 
            }
            else{
                left = mid +1;
            }
         }
         else{
            if(arr[mid] < tar && tar <= arr[right]){
                left = mid + 1;

            }
            else {
                right = mid - 1;
            }
         }
        }

        System.out.println("index is: " + left);
        System.out.println("index value: " + arr[left]);
    }
}
