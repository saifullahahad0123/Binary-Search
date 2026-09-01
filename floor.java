public class floor {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 7, 9, 19};
        int target = 20;

        int floor = -1;

        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {

            int mid = i + (j - i) / 2;

            if (arr[mid] == target) {
                floor = arr[mid];
                break;
            }

            else if (arr[mid] < target) {
                
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