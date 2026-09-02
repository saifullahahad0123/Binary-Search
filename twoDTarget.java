
public class twoDTarget{
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 5, 7},
                        {8,9 ,10 ,11},
                        {12, 13 , 14 ,15},
                        { 16, 17 , 18, 19}};
        int target = 19;

        int row = arr.length;
        int col = arr[0].length;
        int lo = 0 , hi = row*col -1;
        boolean tar = false;
        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;
                int rowmid = mid/col;
                int colmid = mid%col;
                if (target == arr[rowmid][colmid]){
                    tar = true;
                    break;
                }
                else if(target<arr[rowmid][colmid]){
                    hi = mid - 1;
                }
                else{
                    lo = mid + 1;
                }
        }

        System.out.println(tar );
    }
}