public class sortSearch {

    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 0, 1, 1, 1, 1};

        int target = 1;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                break;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
    }
}
