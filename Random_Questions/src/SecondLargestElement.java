public class SecondLargestElement {
    // 1). O(n*log(n)) + O(n)
    // public static int getSecondLargest(int[] arr){
    //     int n = arr.length;

    //     Arrays.sort(arr); // O(n*log(n))

    //     for(int i=n-2;i>=0;i--){ // O(n)
    //         if(arr[i]!=arr[n-1]){
    //             return arr[i];
    //         }
    //     }
    //     return -1; // if not found.
    // }

    public static int getSecondLargest(int[] arr){
        int n = arr.length;

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        // 1st find largest
        for(int i=0; i<n; i++){
            largest = Math.max(arr[i], largest);
        }

        //2nd Highest
        for(int i=0;i<n;i++){
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println(getSecondLargest(arr));
    }
}
