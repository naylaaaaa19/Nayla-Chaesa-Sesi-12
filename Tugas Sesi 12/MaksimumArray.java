public class MaksimumArray {
    public class MaxArray {
        public static int FindMax(int[] arr, int n, int max) {
            if (n == 0) {
               return max;
            } 
            if (arr[n] > max) {
                 max = arr[n];
            }
            if (n > 0) {
                FindMax(arr, n-1, max);
            }
            return max;
        }
    
        public static void main(String[] args){
            int arr[] = {3, 2, 5, 8, 9, 9, 10, 8, 4, 13, 14, 15};
            int max = 0;
            int result=FindMax (arr, arr.length-1, max);
            System.out.println("nilai tertinggi = "+result);
            }
        }
    
}
