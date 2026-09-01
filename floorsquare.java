public class floorsquare{
    public static void main(String[] args) {

        int[] arr = {0,1,2, 3,4,5,6,7,8,9 };
        int target = 17;
       int floor = -1;
       

        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {

            int mid = i + (j - i) / 2;

            if (arr[i]*arr[i] == target) {
                floor = arr[mid];
                break;
            }

            else if (arr[i]*arr[i] < target) {
                
             floor = arr[mid];

                
                i = mid + 1;
            }

            else {
                
                j = mid - 1;
            }
        }

        System.out.println("Floor = " + floor);
    }
}
