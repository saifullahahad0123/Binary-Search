public class mountain {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 6, 4, 2};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // We are on increasing side
                left = mid + 1;
            } 
            else {
                // We are on decreasing side
                right = mid;
            }
        }

        System.out.println("Peak index: " + left);
        System.out.println("Peak value: " + arr[left]);
    }
}
